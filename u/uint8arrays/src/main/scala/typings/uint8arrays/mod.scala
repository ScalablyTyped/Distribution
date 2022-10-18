package typings.uint8arrays

import typings.std.ArrayLike
import typings.uint8arrays.distSrcUtilBasesMod.SupportedEncodings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uint8arrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def concat(arrays: js.Array[ArrayLike[Double]]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arrays.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def concat(arrays: js.Array[ArrayLike[Double]], length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arrays.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def equals_(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def fromString(string: String, encoding: SupportedEncodings): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toString_(array: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(array: js.typedarray.Uint8Array, encoding: SupportedEncodings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def xor(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
