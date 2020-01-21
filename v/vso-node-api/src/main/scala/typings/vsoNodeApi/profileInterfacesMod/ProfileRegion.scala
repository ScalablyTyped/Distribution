package typings.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileRegion extends js.Object {
  /**
    * The two-letter code defined in ISO 3166 for the country/region.
    */
  var code: String
  /**
    * Localized country/region name
    */
  var name: String
}

object ProfileRegion {
  @scala.inline
  def apply(code: String, name: String): ProfileRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProfileRegion]
  }
}

