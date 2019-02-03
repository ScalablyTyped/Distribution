package typings
package web3Lib.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Iban")
@js.native
class Iban protected () extends js.Object {
  def this(address: java.lang.String) = this()
  def isValid(): scala.Boolean = js.native
}

/* static members */
@JSImport("web3/eth/types", "Iban")
@js.native
object Iban extends js.Object {
  def toAddress(iban: web3Lib.ethTypesMod.Iban): java.lang.String = js.native
}

