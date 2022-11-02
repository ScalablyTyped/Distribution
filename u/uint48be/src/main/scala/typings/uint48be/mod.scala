package typings.uint48be

import typings.node.bufferMod.global.Buffer
import typings.uint48be.uint48beInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uint48be", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def apply(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("uint48be", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of bytes after decoding a number. Always returns `6`.
      */
    @JSImport("uint48be", "decode.bytes")
    @js.native
    val bytes: `6` = js.native
  }
  
  object encode {
    
    inline def apply(number: Double): Buffer = ^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(number: Double, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(number: Double, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(number: Double, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("uint48be", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Number of bytes after encoding a number. Always returns `6`.
      */
    @JSImport("uint48be", "encode.bytes")
    @js.native
    val bytes: `6` = js.native
  }
  
  inline def encodingLength(number: Double): `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(number.asInstanceOf[js.Any]).asInstanceOf[`6`]
}
