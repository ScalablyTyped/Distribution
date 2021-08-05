package typings.uint32

import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uint32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMod32(uint32val0: Double, optionalValues: Double*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addMod32")(uint32val0.asInstanceOf[js.Any], optionalValues.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def and(uint32val0: Double, argv: Double*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(uint32val0.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def choose(x: Double, y: Double, z: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("choose")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fromBytesBigEndian(highByte: Double, secondHighByte: Double, thirdHighByte: Double, lowByte: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytesBigEndian")(highByte.asInstanceOf[js.Any], secondHighByte.asInstanceOf[js.Any], thirdHighByte.asInstanceOf[js.Any], lowByte.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getByteBigEndian(uint32value: Double, byteNo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getByteBigEndian")(uint32value.asInstanceOf[js.Any], byteNo.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getBytesBigEndian(uint32value: Double): js.Tuple4[Double, Double, Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBytesBigEndian")(uint32value.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Double, Double, Double, Double]]
  
  inline def highPart(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("highPart")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def log2(uint32val: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("log2")(uint32val.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def majority(x: Double, y: Double, z: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("majority")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def mult(factor1: Double, factor2: Double, resultUint32Array2: Uint32Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mult")(factor1.asInstanceOf[js.Any], factor2.asInstanceOf[js.Any], resultUint32Array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def not(uint32val: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(uint32val.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def or(uint32val0: Double, argv: Double*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(uint32val0.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rotateLeft(uint32val: Double, numBits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateLeft")(uint32val.asInstanceOf[js.Any], numBits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rotateRight(uint32val: Double, numBits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rotateRight")(uint32val.asInstanceOf[js.Any], numBits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shiftLeft(uint32val: Double, numBits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftLeft")(uint32val.asInstanceOf[js.Any], numBits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def shiftRight(uint32val: Double, numBits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftRight")(uint32val.asInstanceOf[js.Any], numBits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toHex(uint32value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(uint32value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toHex(uint32value: Double, optionalMinLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(uint32value.asInstanceOf[js.Any], optionalMinLength.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toUint32(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint32")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def xor(uint32val0: Double, argv: Double*): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(uint32val0.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[Double]
}
