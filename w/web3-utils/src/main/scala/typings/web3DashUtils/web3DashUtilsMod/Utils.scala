package typings.web3DashUtils.web3DashUtilsMod

import typings.bnDotJs.bnDotJsMod.^
import typings.std.Uint8Array
import typings.web3DashUtils.Anon_R
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  def asciiToHex(string: String): String = js.native
  def asciiToHex(string: String, length: Double): String = js.native
  def bytesToHex(bytes: js.Array[Double]): String = js.native
  def checkAddressChecksum(address: String): Boolean = js.native
  def checkAddressChecksum(address: String, chainId: Double): Boolean = js.native
  def fromAscii(string: String): String = js.native
  def fromDecimal(value: String): String = js.native
  def fromDecimal(value: Double): String = js.native
  def fromUtf8(string: String): String = js.native
  def fromWei(value: String): String = js.native
  def fromWei(value: String, unit: Unit): String = js.native
  def fromWei(value: ^): String = js.native
  def fromWei(value: ^, unit: Unit): String = js.native
  def getSignatureParameters(signature: String): Anon_R = js.native
  def getUnitValue(unit: Unit): String = js.native
  def hexToAscii(string: String): String = js.native
  def hexToBytes(hex: Hex): js.Array[Double] = js.native
  def hexToNumber(hex: Hex): Double = js.native
  def hexToNumberString(hex: Hex): String = js.native
  def hexToString(hex: Hex): String = js.native
  def hexToUtf8(string: String): String = js.native
  def isAddress(address: String): Boolean = js.native
  def isAddress(address: String, chainId: Double): Boolean = js.native
  def isBN(value: String): Boolean = js.native
  def isBN(value: Double): Boolean = js.native
  def isBigNumber(value: ^): Boolean = js.native
  def isBloom(bloom: String): Boolean = js.native
  def isContractAddressInBloom(bloom: String, contractAddress: String): Boolean = js.native
  def isHex(hex: Hex): Boolean = js.native
  def isHexStrict(hex: Hex): Boolean = js.native
  def isInBloom(bloom: String, value: String): Boolean = js.native
  def isInBloom(bloom: String, value: Uint8Array): Boolean = js.native
  def isTopic(topic: String): Boolean = js.native
  def isTopicInBloom(bloom: String, topic: String): Boolean = js.native
  def isUserEthereumAddressInBloom(bloom: String, ethereumAddress: String): Boolean = js.native
  def jsonInterfaceMethodToString(abiItem: AbiItem): String = js.native
  def keccak256(value: String): String = js.native
  def keccak256(value: ^): String = js.native
  def leftPad(string: String, characterAmount: Double): String = js.native
  def leftPad(string: String, characterAmount: Double, sign: String): String = js.native
  def leftPad(string: Double, characterAmount: Double): String = js.native
  def leftPad(string: Double, characterAmount: Double, sign: String): String = js.native
  def numberToHex(value: String): String = js.native
  def numberToHex(value: Double): String = js.native
  def numberToHex(value: ^): String = js.native
  def padLeft(value: String, characterAmount: Double): String = js.native
  def padLeft(value: String, characterAmount: Double, sign: String): String = js.native
  def padLeft(value: Double, characterAmount: Double): String = js.native
  def padLeft(value: Double, characterAmount: Double, sign: String): String = js.native
  def padRight(string: String, characterAmount: Double): String = js.native
  def padRight(string: String, characterAmount: Double, sign: String): String = js.native
  def padRight(string: Double, characterAmount: Double): String = js.native
  def padRight(string: Double, characterAmount: Double, sign: String): String = js.native
  def randomHex(bytesSize: Double): String = js.native
  def rightPad(string: String, characterAmount: Double): String = js.native
  def rightPad(string: String, characterAmount: Double, sign: String): String = js.native
  def rightPad(string: Double, characterAmount: Double): String = js.native
  def rightPad(string: Double, characterAmount: Double, sign: String): String = js.native
  def sha3(value: String): String = js.native
  def sha3(value: ^): String = js.native
  def soliditySha3(`val`: Mixed*): String = js.native
  def stringToHex(string: String): String = js.native
  def stripHexPrefix(str: String): String = js.native
  def testAddress(bloom: String, address: String): Boolean = js.native
  def testTopic(bloom: String, topic: String): Boolean = js.native
  def toAscii(string: String): String = js.native
  def toBN(value: String): ^ = js.native
  def toBN(value: Double): ^ = js.native
  def toChecksumAddress(address: String): String = js.native
  def toChecksumAddress(address: String, chainId: Double): String = js.native
  def toDecimal(hex: Hex): Double = js.native
  def toHex(value: String): String = js.native
  def toHex(value: Double): String = js.native
  def toHex(value: ^): String = js.native
  def toTwosComplement(value: String): String = js.native
  def toTwosComplement(value: Double): String = js.native
  def toTwosComplement(value: ^): String = js.native
  def toUtf8(string: String): String = js.native
  def toWei(`val`: String): String = js.native
  def toWei(`val`: String, unit: Unit): String = js.native
  def toWei(`val`: ^): ^ = js.native
  def toWei(`val`: ^, unit: Unit): ^ = js.native
  def unitMap(): Units = js.native
  def utf8ToHex(string: String): String = js.native
}

