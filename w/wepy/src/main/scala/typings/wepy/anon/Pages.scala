package typings.wepy.anon

import typings.wepy.pageMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pages extends js.Object {
  var pages: js.Array[String]
  var window: PageConfig
}

object Pages {
  @scala.inline
  def apply(pages: js.Array[String], window: PageConfig): Pages = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
}

