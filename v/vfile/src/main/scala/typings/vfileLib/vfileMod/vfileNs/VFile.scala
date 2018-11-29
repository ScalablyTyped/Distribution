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
  @JSName("fail")
  var fail_Original: Fail = js.native
  /**
           * List of file-paths the file moved between.
           */
  var history: js.Array[java.lang.String] = js.native
  @JSName("info")
  var info_Original: Info = js.native
  @JSName("message")
  var message_Original: Message = js.native
  /**
           * List of messages associated with the file.
           */
  var messages: js.Array[VFileMessage] = js.native
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
  @JSName("toString")
  var toString_Original: ToString = js.native
  /**
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](): F = js.native
  /**
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](input: F): F = js.native
  /**
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](input: VFileContents): F = js.native
  /**
           * @param options If `options` is `string` or `Buffer`, treats it as `{contents: options}`. If `options` is a `VFile`, returns it. All other options are set on the newly created `vfile`.
           */
  def apply[F /* <: VFile */](input: VFileOptions): F = js.native
  def fail(reason: java.lang.String): scala.Nothing = js.native
  def fail(reason: java.lang.String, position: unistLib.unistMod.Point): scala.Nothing = js.native
  def fail(reason: java.lang.String, position: unistLib.unistMod.Point, ruleId: java.lang.String): scala.Nothing = js.native
  def fail(reason: java.lang.String, position: unistLib.unistMod.Position): scala.Nothing = js.native
  def fail(reason: java.lang.String, position: unistLib.unistMod.Position, ruleId: java.lang.String): scala.Nothing = js.native
  def fail(reason: java.lang.String, position: NodeWithPosition): scala.Nothing = js.native
  def fail(reason: java.lang.String, position: NodeWithPosition, ruleId: java.lang.String): scala.Nothing = js.native
  def info(reason: java.lang.String): scala.Unit = js.native
  def info(reason: java.lang.String, position: unistLib.unistMod.Point): scala.Unit = js.native
  def info(reason: java.lang.String, position: unistLib.unistMod.Point, ruleId: java.lang.String): scala.Unit = js.native
  def info(reason: java.lang.String, position: unistLib.unistMod.Position): scala.Unit = js.native
  def info(reason: java.lang.String, position: unistLib.unistMod.Position, ruleId: java.lang.String): scala.Unit = js.native
  def info(reason: java.lang.String, position: NodeWithPosition): scala.Unit = js.native
  def info(reason: java.lang.String, position: NodeWithPosition, ruleId: java.lang.String): scala.Unit = js.native
  def message(reason: java.lang.String): VFileMessage = js.native
  def message(reason: java.lang.String, position: unistLib.unistMod.Point): VFileMessage = js.native
  def message(reason: java.lang.String, position: unistLib.unistMod.Point, ruleId: java.lang.String): VFileMessage = js.native
  def message(reason: java.lang.String, position: unistLib.unistMod.Position): VFileMessage = js.native
  def message(reason: java.lang.String, position: unistLib.unistMod.Position, ruleId: java.lang.String): VFileMessage = js.native
  def message(reason: java.lang.String, position: NodeWithPosition): VFileMessage = js.native
  def message(reason: java.lang.String, position: NodeWithPosition, ruleId: java.lang.String): VFileMessage = js.native
  def toString(encoding: nodeLib.BufferEncoding): java.lang.String = js.native
}

