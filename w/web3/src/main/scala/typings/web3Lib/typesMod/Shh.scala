package typings
package web3Lib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shh extends js.Object {
  def generateSymKeyFromPassword(password: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def generateSymKeyFromPassword(password: java.lang.String, callback: Callback[java.lang.String]): scala.Unit = js.native
}

