package typings.utrie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("utrie/dist/types/Util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(base64: String): js.typedarray.ArrayBuffer | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(base64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer | js.Array[Double]]
  
  inline def polyUint16Array(buffer: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("polyUint16Array")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def polyUint32Array(buffer: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("polyUint32Array")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
