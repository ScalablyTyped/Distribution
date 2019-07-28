package typings.web3.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shh extends js.Object {
  def generateSymKeyFromPassword(password: String): js.Promise[String] = js.native
  def generateSymKeyFromPassword(password: String, callback: Callback[String]): Unit = js.native
}

