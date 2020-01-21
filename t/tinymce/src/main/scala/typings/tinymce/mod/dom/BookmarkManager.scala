package typings.tinymce.mod.dom

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BookmarkManager extends js.Object {
  def getBookmark(): js.Object = js.native
  def getBookmark(`type`: Double): js.Object = js.native
  def getBookmark(`type`: Double, normalized: Boolean): js.Object = js.native
  def isBookmarkNode(node: HTMLElement): Boolean = js.native
  def moveToBookmark(bookmark: js.Object): Boolean = js.native
}

