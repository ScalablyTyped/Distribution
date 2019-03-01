package typings
package vsoDashNodeDashApiLib.interfacesProfileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var code: java.lang.String
  var englishName: java.lang.String
}

object Country {
  @scala.inline
  def apply(code: java.lang.String, englishName: java.lang.String): Country = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("englishName")(englishName)
    __obj.asInstanceOf[Country]
  }
}

