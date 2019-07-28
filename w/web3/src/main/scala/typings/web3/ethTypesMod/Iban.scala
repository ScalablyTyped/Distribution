package typings.web3.ethTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/eth/types", "Iban")
@js.native
class Iban protected () extends js.Object {
  def this(address: String) = this()
  def isValid(): Boolean = js.native
}

/* static members */
@JSImport("web3/eth/types", "Iban")
@js.native
object Iban extends js.Object {
  def toAddress(iban: Iban): String = js.native
}

