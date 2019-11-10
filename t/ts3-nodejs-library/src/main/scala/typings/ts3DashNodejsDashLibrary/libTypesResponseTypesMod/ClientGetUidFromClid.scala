package typings.ts3DashNodejsDashLibrary.libTypesResponseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientGetUidFromClid extends js.Object {
  var clid: Double
  var cluid: String
  var nickname: String
}

object ClientGetUidFromClid {
  @scala.inline
  def apply(clid: Double, cluid: String, nickname: String): ClientGetUidFromClid = {
    val __obj = js.Dynamic.literal(clid = clid, cluid = cluid, nickname = nickname)
  
    __obj.asInstanceOf[ClientGetUidFromClid]
  }
}

