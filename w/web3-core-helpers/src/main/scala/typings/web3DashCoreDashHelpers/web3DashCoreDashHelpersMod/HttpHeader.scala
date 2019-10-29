package typings.web3DashCoreDashHelpers.web3DashCoreDashHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpHeader extends js.Object {
  var name: String
  var value: String
}

object HttpHeader {
  @scala.inline
  def apply(name: String, value: String): HttpHeader = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[HttpHeader]
  }
}

