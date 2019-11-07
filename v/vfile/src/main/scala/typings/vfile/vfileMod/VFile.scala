package typings.vfile.vfileMod

import typings.node.BufferEncoding
import typings.unist.unistMod.Node
import typings.unist.unistMod.Point
import typings.unist.unistMod.Position
import typings.vfileDashMessage.vfileDashMessageMod.VFileMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VFile extends _VFileCompatible {
  /**
    * Current name (including extension) of `vfile`.
    * Cannot contain path separators.
    * Cannot be nullified either (use `file.path = file.dirname` instead).
    */
  var basename: js.UndefOr[String] = js.native
  /**
    * Raw value.
    */
  var contents: VFileContents = js.native
  /**
    * Base of `path`.
    * Defaults to `process.cwd()`.
    */
  var cwd: String = js.native
  /**
    * Place to store custom information.
    * It's OK to store custom data directly on the `vfile`, moving it to `data` gives a little more privacy.
    */
  var data: js.Any = js.native
  /**
    * Path to parent directory of `vfile`.
    * Cannot be set if there's no `path` yet.
    */
  var dirname: js.UndefOr[String] = js.native
  /**
    * Extension (with dot) of `vfile`.
    * Cannot be set if there's no `path` yet and cannot contain path separators.
    */
  var extname: js.UndefOr[String] = js.native
  /**
    * List of file-paths the file moved between.
    */
  var history: js.Array[String] = js.native
  /**
    * List of messages associated with the file.
    */
  var messages: js.Array[VFileMessage] = js.native
  /**
    * Path of `vfile`.
    * Cannot be nullified.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Name (without extension) of `vfile`.
    * Cannot be nullified, and cannot contain path separators.
    */
  var stem: js.UndefOr[String] = js.native
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
  def apply[F /* <: VFile */](input: F): F = js.native
  def apply[F /* <: VFile */](input: VFileContents): F = js.native
  def apply[F /* <: VFile */](input: VFileOptions): F = js.native
  /**
    * Associates a fatal message with the file, then immediately throws it.
    * Note: fatal errors mean a file is no longer processable.
    * Calls `message()` internally.
    * @param reason Reason for message. Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in `vfile`.
    * @param ruleId Category of message.
    */
  def fail(reason: String): scala.Nothing = js.native
  def fail(reason: String, position: Node): scala.Nothing = js.native
  def fail(reason: String, position: Node, ruleId: String): scala.Nothing = js.native
  def fail(reason: String, position: Point): scala.Nothing = js.native
  def fail(reason: String, position: Point, ruleId: String): scala.Nothing = js.native
  def fail(reason: String, position: Position): scala.Nothing = js.native
  def fail(reason: String, position: Position, ruleId: String): scala.Nothing = js.native
  /**
    * Associates an informational message with the file, where `fatal` is set to `null`.
    * Calls `message()` internally.
    * @param reason Reason for message. Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in `vfile`.
    * @param ruleId Category of message.
    */
  def info(reason: String): VFileMessage = js.native
  def info(reason: String, position: Node): VFileMessage = js.native
  def info(reason: String, position: Node, ruleId: String): VFileMessage = js.native
  def info(reason: String, position: Point): VFileMessage = js.native
  def info(reason: String, position: Point, ruleId: String): VFileMessage = js.native
  def info(reason: String, position: Position): VFileMessage = js.native
  def info(reason: String, position: Position, ruleId: String): VFileMessage = js.native
  /**
    * Associates a message with the file for `reason` at `position`.
    * When an error is passed in as `reason`, copies the stack.
    * Each message has a `fatal` property which by default is set to `false` (ie. `warning`).
    * @param reason Reason for message. Uses the stack and message of the error if given.
    * @param position Place at which the message occurred in `vfile`.
    * @param ruleId Category of message.
    */
  def message(reason: String): VFileMessage = js.native
  def message(reason: String, position: Node): VFileMessage = js.native
  def message(reason: String, position: Node, ruleId: String): VFileMessage = js.native
  def message(reason: String, position: Point): VFileMessage = js.native
  def message(reason: String, position: Point, ruleId: String): VFileMessage = js.native
  def message(reason: String, position: Position): VFileMessage = js.native
  def message(reason: String, position: Position, ruleId: String): VFileMessage = js.native
  def toString(encoding: BufferEncoding): String = js.native
}

