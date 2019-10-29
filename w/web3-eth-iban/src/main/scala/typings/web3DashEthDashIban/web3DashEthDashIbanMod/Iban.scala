package typings.web3DashEthDashIban.web3DashEthDashIbanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-iban", "Iban")
@js.native
class Iban protected () extends js.Object {
  def this(iban: String) = this()
  def checksum(): String = js.native
  def client(): String = js.native
  def institution(): String = js.native
  def isDirect(): Boolean = js.native
  def isIndirect(): Boolean = js.native
  def isValid(): Boolean = js.native
  def toAddress(): String = js.native
}

/* static members */
@JSImport("web3-eth-iban", "Iban")
@js.native
object Iban extends js.Object {
  def createIndirect(options: IndirectOptions): Iban = js.native
  def fromAddress(address: String): Iban = js.native
  def fromBban(bban: String): Iban = js.native
  def isValid(iban: String): Boolean = js.native
  def toAddress(iban: String): String = js.native
  def toIban(address: String): String = js.native
}

