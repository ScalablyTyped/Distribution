package typings.web3.utilsMod

import typings.underscore.underscoreMod.Dictionary
import typings.underscore.underscoreMod.List
import typings.underscore.underscoreMod.TypeOfDictionary
import typings.underscore.underscoreMod.Underscore
import typings.underscore.underscoreMod.UnderscoreStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Utils extends js.Object {
  var BN: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any = js.native
  @JSName("_")
  var __Original: UnderscoreStatic = js.native
  var unitMap: js.Any = js.native
  def `_`[T](value: T): Underscore[T, T] = js.native
  def `_`[T](value: js.Array[T]): Underscore[T, js.Array[T]] = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param key First argument to Underscore object functions.
    **/
  def `_`[T](value: List[T]): Underscore[T, List[T]] = js.native
  @JSName("_")
  def __T_TypeOfDictionaryVV_DictionaryWildcard[T /* <: TypeOfDictionary[V] */, V /* <: Dictionary[_] */](value: V): Underscore[T, V] = js.native
  def asciiToHex(`val`: String): String = js.native
  def bytesToHex(`val`: js.Array[Double]): String = js.native
  def checkAddressChecksum(address: String): Boolean = js.native
  def fromAscii(`val`: String): String = js.native
  def fromDecimal(`val`: String): String = js.native
  def fromDecimal(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): String = js.native
  def fromDecimal(`val`: Double): String = js.native
  def fromUtf8(`val`: String): String = js.native
  def fromWei(`val`: String): String = js.native
  def fromWei(`val`: String, unit: Unit): String = js.native
  def fromWei(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): String = js.native
  def fromWei(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any,
    unit: Unit
  ): String = js.native
  def fromWei(`val`: Double): String = js.native
  def fromWei(`val`: Double, unit: Unit): String = js.native
  def hexToAscii(`val`: String): String = js.native
  def hexToBytes(`val`: String): js.Array[Double] = js.native
  def hexToNumber(`val`: String): Double = js.native
  def hexToNumber(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): Double = js.native
  def hexToNumber(`val`: Double): Double = js.native
  def hexToNumberString(`val`: String): String = js.native
  def hexToNumberString(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): String = js.native
  def hexToNumberString(`val`: Double): String = js.native
  def hexToString(`val`: String): String = js.native
  def hexToUtf8(`val`: String): String = js.native
  def isAddress(any: js.Any): Boolean = js.native
   // TODO only static-definition
  def isBN(any: js.Any): Boolean = js.native
  def isBigNumber(any: js.Any): Boolean = js.native
  def isHex(any: js.Any): Boolean = js.native
  def isHexStrict(`val`: Hex): Boolean = js.native
  def keccak256(`val`: String): String = js.native
  def leftPad(string: String, chars: Double, sign: String): String = js.native
  def numberToHex(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): String = js.native
  def numberToHex(`val`: Double): String = js.native
  def padLeft(string: String, chars: Double, sign: String): String = js.native
  def padRight(string: String, chars: Double, sign: String): String = js.native
  def randomHex(bytes: Double): String = js.native
  def rightPad(string: String, chars: Double, sign: String): String = js.native
  def sha3(`val`: String): String = js.native
  def sha3(`val`: String, val2: String): String = js.native
  def sha3(`val`: String, val2: String, val3: String): String = js.native
  def sha3(`val`: String, val2: String, val3: String, val4: String): String = js.native
  def sha3(`val`: String, val2: String, val3: String, val4: String, val5: String): String = js.native
  def soliditySha3(`val`: Mixed*): String = js.native
  def stringToHex(`val`: String): String = js.native
  def toAscii(hex: String): String = js.native
  def toBN(any: js.Any): js.Any = js.native
  def toChecksumAddress(`val`: String): String = js.native
  def toDecimal(`val`: js.Any): Double = js.native
  def toHex(`val`: js.Any): String = js.native
  def toUtf8(`val`: js.Any): String = js.native
  def toWei(`val`: String): String = js.native
  def toWei(`val`: String, unit: Unit): String = js.native
  def toWei(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any
  ): js.Any = js.native
  def toWei(
    `val`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BigNumber */ js.Any,
    unit: Unit
  ): js.Any = js.native
}

