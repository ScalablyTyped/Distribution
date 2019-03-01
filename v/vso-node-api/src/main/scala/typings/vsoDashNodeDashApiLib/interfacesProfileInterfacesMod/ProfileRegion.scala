package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileRegion extends js.Object {
  /**
    * The two-letter code defined in ISO 3166 for the country/region.
    */
  var code: java.lang.String
  /**
    * Localized country/region name
    */
  var name: java.lang.String
}

object ProfileRegion {
  @scala.inline
  def apply(code: java.lang.String, name: java.lang.String): ProfileRegion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ProfileRegion]
  }
}

