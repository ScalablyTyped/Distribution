package typings.wepy

import typings.wepy.pageMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPages extends js.Object {
  var pages: js.Array[String]
  var window: PageConfig
}

object AnonPages {
  @scala.inline
  def apply(pages: js.Array[String], window: PageConfig): AnonPages = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPages]
  }
}

