package typings
package websiteDashScraperLib.websiteDashScraperMod.websiteScraperNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attr")(attr)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Source]
  }
}

