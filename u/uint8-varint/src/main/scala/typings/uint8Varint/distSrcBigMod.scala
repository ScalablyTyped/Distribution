package typings.uint8Varint

import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBigMod {
  
  @JSImport("uint8-varint/dist/src/big", "signed")
  @js.native
  val signed: BigVarintCodec = js.native
  
  @JSImport("uint8-varint/dist/src/big", "unsigned")
  @js.native
  val unsigned: BigVarintCodec = js.native
  
  @JSImport("uint8-varint/dist/src/big", "zigzag")
  @js.native
  val zigzag: BigVarintCodec = js.native
  
  @js.native
  trait BigVarintCodec extends StObject {
    
    def decode(buf: js.typedarray.Uint8Array): js.BigInt = js.native
    def decode(buf: js.typedarray.Uint8Array, offset: Double): js.BigInt = js.native
    def decode(buf: Uint8ArrayList): js.BigInt = js.native
    def decode(buf: Uint8ArrayList, offset: Double): js.BigInt = js.native
    
    def encode(value: js.BigInt): js.typedarray.Uint8Array = js.native
    def encode(value: js.BigInt, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
    def encode(value: js.BigInt, buf: js.typedarray.Uint8Array, offset: Double): js.typedarray.Uint8Array = js.native
    def encode(value: js.BigInt, buf: Uint8ArrayList): Uint8ArrayList = js.native
    def encode(value: js.BigInt, buf: Uint8ArrayList, offset: Double): Uint8ArrayList = js.native
    @JSName("encode")
    var encode_Original: (js.Function1[/* value */ js.BigInt, js.typedarray.Uint8Array]) & (js.Function3[
        /* value */ js.BigInt, 
        /* buf */ js.typedarray.Uint8Array, 
        /* offset */ js.UndefOr[Double], 
        js.typedarray.Uint8Array
      ]) & (js.Function3[
        /* value */ js.BigInt, 
        /* buf */ Uint8ArrayList, 
        /* offset */ js.UndefOr[Double], 
        Uint8ArrayList
      ]) = js.native
    
    def encodingLength(value: js.BigInt): Double = js.native
  }
}
