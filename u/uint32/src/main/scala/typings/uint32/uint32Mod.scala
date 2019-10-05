package typings.uint32

import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uint32", JSImport.Namespace)
@js.native
object uint32Mod extends js.Object {
  def addMod32(uint32val0: Double, optionalValues: Double*): Double = js.native
  def and(uint32val0: Double, argv: Double*): Double = js.native
  def choose(x: Double, y: Double, z: Double): Double = js.native
  def fromBytesBigEndian(highByte: Double, secondHighByte: Double, thirdHighByte: Double, lowByte: Double): Double = js.native
  def getByteBigEndian(uint32value: Double, byteNo: Double): Double = js.native
  def getBytesBigEndian(uint32value: Double): js.Tuple4[Double, Double, Double, Double] = js.native
  def highPart(number: Double): Double = js.native
  def log2(uint32val: Double): Double = js.native
  def majority(x: Double, y: Double, z: Double): Double = js.native
  def mult(factor1: Double, factor2: Double, resultUint32Array2: Uint32Array): Unit = js.native
  def not(uint32val: Double): Double = js.native
  def or(uint32val0: Double, argv: Double*): Double = js.native
  def rotateLeft(uint32val: Double, numBits: Double): Double = js.native
  def rotateRight(uint32val: Double, numBits: Double): Double = js.native
  def shiftLeft(uint32val: Double, numBits: Double): Double = js.native
  def shiftRight(uint32val: Double, numBits: Double): Double = js.native
  def toHex(uint32value: Double): String = js.native
  def toHex(uint32value: Double, optionalMinLength: Double): String = js.native
  def toUint32(number: Double): Double = js.native
  def xor(uint32val0: Double, argv: Double*): Double = js.native
}

