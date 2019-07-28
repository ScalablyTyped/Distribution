package typings.wepy

import typings.wepy.pageMod.PageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pages extends js.Object {
  var pages: js.Array[String]
  var window: PageConfig
}

object Anon_Pages {
  @scala.inline
  def apply(pages: js.Array[String], window: PageConfig): Anon_Pages = {
    val __obj = js.Dynamic.literal(pages = pages, window = window)
  
    __obj.asInstanceOf[Anon_Pages]
  }
}

