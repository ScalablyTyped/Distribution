package typings.wepy.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlParam extends js.Object {
  var url: String
}

object UrlParam {
  @scala.inline
  def apply(url: String): UrlParam = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[UrlParam]
  }
}

