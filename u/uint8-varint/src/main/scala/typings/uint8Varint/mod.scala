package typings.uint8Varint

import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uint8-varint", "signed")
  @js.native
  val signed: VarintCodec = js.native
  
  @JSImport("uint8-varint", "unsigned")
  @js.native
  val unsigned: VarintCodec = js.native
  
  @JSImport("uint8-varint", "zigzag")
  @js.native
  val zigzag: VarintCodec = js.native
  
  @js.native
  trait VarintCodec extends StObject {
    
    def decode(buf: js.typedarray.Uint8Array): Double = js.native
    def decode(buf: js.typedarray.Uint8Array, offset: Double): Double = js.native
    def decode(buf: Uint8ArrayList): Double = js.native
    def decode(buf: Uint8ArrayList, offset: Double): Double = js.native
    
    def encode(value: Double): js.typedarray.Uint8Array = js.native
    def encode(value: Double, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encode(value: Double, buf: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
    def encode(value: Double, buf: Uint8ArrayList): Uint8ArrayList = js.native
    def encode(value: Double, buf: Uint8ArrayList, offset: Double): Uint8ArrayList = js.native
    @JSName("encode")
    var encode_Original: (js.Function1[/* value */ Double, js.typedarray.Uint8Array]) & (js.Function3[
        /* value */ Double, 
        /* buf */ js.typedarray.Uint8Array, 
        /* offset */ js.UndefOr[Double], 
        js.typedarray.Uint8Array
      ]) & (js.Function3[
        /* value */ Double, 
        /* buf */ Uint8ArrayList, 
        /* offset */ js.UndefOr[Double], 
        Uint8ArrayList
      ]) = js.native
    
    def encodingLength(value: Double): Double = js.native
  }
}
