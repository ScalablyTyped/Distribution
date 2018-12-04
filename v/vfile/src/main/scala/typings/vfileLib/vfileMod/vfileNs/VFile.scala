package typings
package vfileLib.vfileMod.vfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VFile extends js.Object {
  /**
           * Current name (including extension) of `vfile`.
           * Cannot contain path separators.
           * Cannot be nullified either (use `file.path = file.dirname` instead).
           */
  var basename: js.UndefOr[java.lang.String] = js.native
  /**
           * Raw value.
           */
  var contents: VFileContents = js.native
  /**
           * Base of `path`.
           * Defaults to `process.cwd()`.
           */
  var cwd: java.lang.String = js.native
  /**
           * Place to store custom information.
           * It's OK to store custom data directly on the `vfile`, moving it to `data` gives a little more privacy.
           */
  var data: js.Any = js.native
  /**
           * Path to parent directory of `vfile`.
           * Cannot be set if there's no `path` yet.
           */
  var dirname: js.UndefOr[java.lang.String] = js.native
  /**
           * Extension (with dot) of `vfile`.
           * Cannot be set if there's no `path` yet and cannot contain path separators.
           */
  var extname: js.UndefOr[java.lang.String] = js.native
  /**
           * List of file-paths the file moved between.
           */
  var history: js.Array[java.lang.String] = js.native
  /**
           * List of messages associated with the file.
           */
  var messages: js.Array[vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage] = js.native
  /**
           * Path of `vfile`.
           * Cannot be nullified.
           */
  var path: js.UndefOr[java.lang.String] = js.native
  /**
           * Name (without extension) of `vfile`.
           * Cannot be nullified, and cannot contain path separators.
           */
  var stem: js.UndefOr[java.lang.String] = js.native
  /**
           * Create a new virtual file. If `options` is `string` or `Buffer`, treats it as `{contents: options}`.
           * If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           *
           * Path related properties are set in the following order (least specific to most specific): `history`, `path`, `basename`, `stem`, `extname`, `dirname`.
           *
           * It’s not possible to set either `dirname` or `extname` without setting either `history`, `path`, `basename`, or `stem` as well.
           *
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](): F = js.native
  /**
           * Create a new virtual file. If `options` is `string` or `Buffer`, treats it as `{contents: options}`.
           * If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           *
           * Path related properties are set in the following order (least specific to most specific): `history`, `path`, `basename`, `stem`, `extname`, `dirname`.
           *
           * It’s not possible to set either `dirname` or `extname` without setting either `history`, `path`, `basename`, or `stem` as well.
           *
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](input: F): F = js.native
  /**
           * Create a new virtual file. If `options` is `string` or `Buffer`, treats it as `{contents: options}`.
           * If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           *
           * Path related properties are set in the following order (least specific to most specific): `history`, `path`, `basename`, `stem`, `extname`, `dirname`.
           *
           * It’s not possible to set either `dirname` or `extname` without setting either `history`, `path`, `basename`, or `stem` as well.
           *
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](input: VFileContents): F = js.native
  /**
           * Create a new virtual file. If `options` is `string` or `Buffer`, treats it as `{contents: options}`.
           * If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           *
           * Path related properties are set in the following order (least specific to most specific): `history`, `path`, `basename`, `stem`, `extname`, `dirname`.
           *
           * It’s not possible to set either `dirname` or `extname` without setting either `history`, `path`, `basename`, or `stem` as well.
           *
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](input: VFileOptions): F = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(reason: java.lang.String): scala.Nothing = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(reason: java.lang.String, position: unistLib.unistMod.Point): scala.Nothing = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(reason: java.lang.String, position: unistLib.unistMod.Point, ruleId: java.lang.String): scala.Nothing = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(reason: java.lang.String, position: unistLib.unistMod.Position): scala.Nothing = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(reason: java.lang.String, position: unistLib.unistMod.Position, ruleId: java.lang.String): scala.Nothing = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(reason: java.lang.String, position: vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.AnyNode): scala.Nothing = js.native
  /**
           * Associates a fatal message with the file, then immediately throws it.
           * Note: fatal errors mean a file is no longer processable.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def fail(
    reason: java.lang.String,
    position: vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.AnyNode,
    ruleId: java.lang.String
  ): scala.Nothing = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(reason: java.lang.String): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(reason: java.lang.String, position: unistLib.unistMod.Point): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(reason: java.lang.String, position: unistLib.unistMod.Point, ruleId: java.lang.String): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(reason: java.lang.String, position: unistLib.unistMod.Position): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(reason: java.lang.String, position: unistLib.unistMod.Position, ruleId: java.lang.String): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(reason: java.lang.String, position: vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.AnyNode): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates an informational message with the file, where `fatal` is set to `null`.
           * Calls `message()` internally.
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def info(
    reason: java.lang.String,
    position: vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.AnyNode,
    ruleId: java.lang.String
  ): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(reason: java.lang.String): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(reason: java.lang.String, position: unistLib.unistMod.Point): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(reason: java.lang.String, position: unistLib.unistMod.Point, ruleId: java.lang.String): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(reason: java.lang.String, position: unistLib.unistMod.Position): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(reason: java.lang.String, position: unistLib.unistMod.Position, ruleId: java.lang.String): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(reason: java.lang.String, position: vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.AnyNode): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Associates a message with the file for `reason` at `position`.
           * When an error is passed in as `reason`, copies the stack.
           * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
           * @param reason Reason for message. Uses the stack and message of the error if given.
           * @param position Place at which the message occurred in `vfile`.
           * @param ruleId Category of message.
           */
  def message(
    reason: java.lang.String,
    position: vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.AnyNode,
    ruleId: java.lang.String
  ): vfileDashMessageLib.vfileDashMessageMod.vfileMessageNs.VFileMessage = js.native
  /**
           * Convert contents of `vfile` to string.
           * @param encoding If `contents` is a buffer, `encoding` is used to stringify buffers (default: `'utf8'`).
           */
  def toString(encoding: nodeLib.BufferEncoding): java.lang.String = js.native
}

