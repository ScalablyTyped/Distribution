package typings
package uint32Lib.uint32Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uint32", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addMod32(uint32val0: scala.Double, optionalValues: scala.Double*): scala.Double = js.native
  def and(uint32val0: scala.Double, argv: scala.Double*): scala.Double = js.native
  def choose(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  def fromBytesBigEndian(
    highByte: scala.Double,
    secondHighByte: scala.Double,
    thirdHighByte: scala.Double,
    lowByte: scala.Double
  ): scala.Double = js.native
  def getByteBigEndian(uint32value: scala.Double, byteNo: scala.Double): scala.Double = js.native
  def getBytesBigEndian(uint32value: scala.Double): js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double] = js.native
  def highPart(number: scala.Double): scala.Double = js.native
  def log2(uint32val: scala.Double): scala.Double = js.native
  def majority(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  def mult(factor1: scala.Double, factor2: scala.Double, resultUint32Array2: stdLib.Uint32Array): scala.Unit = js.native
  def not(uint32val: scala.Double): scala.Double = js.native
  def or(uint32val0: scala.Double, argv: scala.Double*): scala.Double = js.native
  def rotateLeft(uint32val: scala.Double, numBits: scala.Double): scala.Double = js.native
  def rotateRight(uint32val: scala.Double, numBits: scala.Double): scala.Double = js.native
  def shiftLeft(uint32val: scala.Double, numBits: scala.Double): scala.Double = js.native
  def shiftRight(uint32val: scala.Double, numBits: scala.Double): scala.Double = js.native
  def toHex(uint32value: scala.Double): java.lang.String = js.native
  def toHex(uint32value: scala.Double, optionalMinLength: scala.Double): java.lang.String = js.native
  def toUint32(number: scala.Double): scala.Double = js.native
  def xor(uint32val0: scala.Double, argv: scala.Double*): scala.Double = js.native
}

