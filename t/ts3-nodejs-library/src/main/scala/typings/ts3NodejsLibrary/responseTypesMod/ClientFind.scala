package typings.ts3NodejsLibrary.responseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientFind extends js.Object {
  var clid: Double
  var client_nickname: String
}

object ClientFind {
  @scala.inline
  def apply(clid: Double, client_nickname: String): ClientFind = {
    val __obj = js.Dynamic.literal(clid = clid.asInstanceOf[js.Any], client_nickname = client_nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFind]
  }
}

