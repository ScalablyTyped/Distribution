package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermIdGetByName extends js.Object {
  var permid: Double
  var permsid: String
}

object PermIdGetByName {
  @scala.inline
  def apply(permid: Double, permsid: String): PermIdGetByName = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermIdGetByName]
  }
}

