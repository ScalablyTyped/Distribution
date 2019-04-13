package typings
package websiteDashScraperLib.websiteDashScraperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var attr: java.lang.String
  var selector: java.lang.String
}

object Source {
  @scala.inline
  def apply(attr: java.lang.String, selector: java.lang.String): Source = {
    val __obj = js.Dynamic.literal(attr = attr, selector = selector)
  
    __obj.asInstanceOf[Source]
  }
}

