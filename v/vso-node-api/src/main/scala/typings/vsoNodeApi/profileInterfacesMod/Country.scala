package typings.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Country extends js.Object {
  var code: String
  var englishName: String
}

object Country {
  @scala.inline
  def apply(code: String, englishName: String): Country = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], englishName = englishName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Country]
  }
}

