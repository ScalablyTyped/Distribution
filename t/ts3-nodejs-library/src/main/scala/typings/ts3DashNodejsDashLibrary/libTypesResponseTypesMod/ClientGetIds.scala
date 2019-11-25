package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGetIds extends js.Object {
  var clid: Double
  var cluid: String
  var name: String
}

object ClientGetIds {
  @scala.inline
  def apply(clid: Double, cluid: String, name: String): ClientGetIds = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientGetIds]
  }
}

