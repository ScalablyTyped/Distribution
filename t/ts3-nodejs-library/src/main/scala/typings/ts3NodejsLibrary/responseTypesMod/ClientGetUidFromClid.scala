package typings.ts3NodejsLibrary.responseTypesMod

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
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], cluid = cluid.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientGetUidFromClid]
  }
}

