package typings.summernote.mod._Global_.Summernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.summernote.summernoteStrings.fullscreen
  - typings.summernote.summernoteStrings.codeview
  - typings.summernote.summernoteStrings.undo
  - typings.summernote.summernoteStrings.redo
  - typings.summernote.summernoteStrings.help
*/
trait miscGroupOptions extends js.Object

object miscGroupOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def codeview: typings.summernote.summernoteStrings.codeview = this.cast("codeview")
  @scala.inline
  def fullscreen: typings.summernote.summernoteStrings.fullscreen = this.cast("fullscreen")
  @scala.inline
  def help: typings.summernote.summernoteStrings.help = this.cast("help")
  @scala.inline
  def redo: typings.summernote.summernoteStrings.redo = this.cast("redo")
  @scala.inline
  def undo: typings.summernote.summernoteStrings.undo = this.cast("undo")
}

