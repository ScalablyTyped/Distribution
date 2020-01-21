package typings.summernote.mod._Global_.Summernote

import typings.summernote.summernoteStrings.fontname_
import typings.summernote.summernoteStrings.fontsize_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.summernote.summernoteStrings.fontsize_
  - typings.summernote.summernoteStrings.fontname_
  - typings.summernote.summernoteStrings.color
*/
trait toolbarFontsizeGroupOptions extends js.Object

object toolbarFontsizeGroupOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def color: typings.summernote.summernoteStrings.color = this.cast("color")
  @scala.inline
  def fontname: fontname_ = this.cast("fontname")
  @scala.inline
  def fontsize: fontsize_ = this.cast("fontsize")
}

