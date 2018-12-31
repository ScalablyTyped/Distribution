package typings
package web3Lib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var BN: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any = js.native
  @JSName("_")
  var __Original: underscoreLib.underscoreMod.underscoreNs.UnderscoreStatic = js.native
  var unitMap: js.Any = js.native
  def `_`[T](value: T): underscoreLib.underscoreMod.underscoreNs.Underscore[T] = js.native
  def `_`[T](value: js.Array[T]): underscoreLib.underscoreMod.underscoreNs.Underscore[T] = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param key First argument to Underscore object functions.
    **/
  def `_`[T](value: underscoreLib.underscoreMod.underscoreNs.Dictionary[T]): underscoreLib.underscoreMod.underscoreNs.Underscore[T] = js.native
  def asciiToHex(`val`: java.lang.String): java.lang.String = js.native
  def bytesToHex(`val`: js.Array[scala.Double]): java.lang.String = js.native
  def checkAddressChecksum(address: java.lang.String): scala.Boolean = js.native
  def fromAscii(`val`: java.lang.String): java.lang.String = js.native
  def fromDecimal(`val`: java.lang.String): java.lang.String = js.native
  def fromDecimal(`val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any): java.lang.String = js.native
  def fromDecimal(`val`: scala.Double): java.lang.String = js.native
  def fromUtf8(`val`: java.lang.String): java.lang.String = js.native
  def fromWei(`val`: java.lang.String): java.lang.String = js.native
  def fromWei(`val`: java.lang.String, unit: Unit): java.lang.String = js.native
  def fromWei(`val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any): js.Any = js.native
  def fromWei(
    `val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any,
    unit: Unit
  ): js.Any = js.native
  def fromWei(`val`: scala.Double): java.lang.String = js.native
  def fromWei(`val`: scala.Double, unit: Unit): java.lang.String = js.native
  def hexToAscii(`val`: java.lang.String): java.lang.String = js.native
  def hexToBytes(`val`: java.lang.String): js.Array[scala.Double] = js.native
  def hexToNumber(`val`: java.lang.String): scala.Double = js.native
  def hexToNumber(`val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any): scala.Double = js.native
  def hexToNumber(`val`: scala.Double): scala.Double = js.native
  def hexToNumberString(`val`: java.lang.String): java.lang.String = js.native
  def hexToNumberString(`val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any): java.lang.String = js.native
  def hexToNumberString(`val`: scala.Double): java.lang.String = js.native
  def hexToString(`val`: java.lang.String): java.lang.String = js.native
  def hexToUtf8(`val`: java.lang.String): java.lang.String = js.native
  def isAddress(any: js.Any): scala.Boolean = js.native
   // TODO only static-definition
  def isBN(any: js.Any): scala.Boolean = js.native
  def isBigNumber(any: js.Any): scala.Boolean = js.native
  def isHex(any: js.Any): scala.Boolean = js.native
  def isHexStrict(`val`: Hex): scala.Boolean = js.native
  def keccak256(`val`: java.lang.String): java.lang.String = js.native
  def leftPad(string: java.lang.String, chars: scala.Double, sign: java.lang.String): java.lang.String = js.native
  def numberToHex(`val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any): java.lang.String = js.native
  def numberToHex(`val`: scala.Double): java.lang.String = js.native
  def padLeft(string: java.lang.String, chars: scala.Double, sign: java.lang.String): java.lang.String = js.native
  def padRight(string: java.lang.String, chars: scala.Double, sign: java.lang.String): java.lang.String = js.native
  def randomHex(bytes: scala.Double): java.lang.String = js.native
  def rightPad(string: java.lang.String, chars: scala.Double, sign: java.lang.String): java.lang.String = js.native
  def sha3(`val`: java.lang.String): java.lang.String = js.native
  def sha3(`val`: java.lang.String, val2: java.lang.String): java.lang.String = js.native
  def sha3(`val`: java.lang.String, val2: java.lang.String, val3: java.lang.String): java.lang.String = js.native
  def sha3(`val`: java.lang.String, val2: java.lang.String, val3: java.lang.String, val4: java.lang.String): java.lang.String = js.native
  def sha3(
    `val`: java.lang.String,
    val2: java.lang.String,
    val3: java.lang.String,
    val4: java.lang.String,
    val5: java.lang.String
  ): java.lang.String = js.native
  def soliditySha3(`val`: Mixed*): java.lang.String = js.native
  def stringToHex(`val`: java.lang.String): java.lang.String = js.native
  def toAscii(hex: java.lang.String): java.lang.String = js.native
  def toBN(any: js.Any): js.Any = js.native
  def toChecksumAddress(`val`: java.lang.String): java.lang.String = js.native
  def toDecimal(`val`: js.Any): scala.Double = js.native
  def toHex(`val`: js.Any): java.lang.String = js.native
  def toUtf8(`val`: js.Any): java.lang.String = js.native
  def toWei(`val`: java.lang.String): java.lang.String = js.native
  def toWei(`val`: java.lang.String, unit: Unit): java.lang.String = js.native
  def toWei(`val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any): js.Any = js.native
  def toWei(
    `val`: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify BigNumber */ js.Any,
    unit: Unit
  ): js.Any = js.native
  def toWei(`val`: scala.Double): java.lang.String = js.native
  def toWei(`val`: scala.Double, unit: Unit): java.lang.String = js.native
}

