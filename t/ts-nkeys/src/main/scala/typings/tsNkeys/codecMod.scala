package typings.tsNkeys

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import typings.tsNkeys.mod.Prefix
import typings.tsNkeys.utilMod.ToArrayBuffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecMod {
  
  @JSImport("ts-nkeys/lib/codec", "Codec")
  @js.native
  class Codec () extends StObject
  /* static members */
  object Codec {
    
    @JSImport("ts-nkeys/lib/codec", "Codec")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec._decode")
    @js.native
    def _decode(src: Buffer): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec._decodePrefix")
    @js.native
    def _decodePrefix(raw: Buffer): Uint8Array = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec._encode")
    @js.native
    def _encode(seed: Boolean, role: Prefix, payload: Buffer): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec._encodePrefix")
    @js.native
    def _encodePrefix(kind: Prefix, role: Prefix): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec.decode")
    @js.native
    def decode(expected: Prefix, src: Buffer): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec.decodeSeed")
    @js.native
    def decodeSeed(src: Buffer): SeedDecode = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec.encode")
    @js.native
    def encode(prefix: Prefix, src: Buffer): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec.encodeSeed")
    @js.native
    def encodeSeed(role: Prefix, src: Buffer): Buffer = js.native
    
    @JSImport("ts-nkeys/lib/codec", "Codec.toArrayBuffer")
    @js.native
    def toArrayBuffer: ToArrayBuffer_ = js.native
    @JSImport("ts-nkeys/lib/codec", "Codec.toArrayBuffer")
    @js.native
    def toArrayBuffer(buf: Buffer): ArrayBuffer = js.native
    @scala.inline
    def toArrayBuffer_=(x: ToArrayBuffer_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toArrayBuffer")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SeedDecode extends StObject {
    
    var buf: Buffer = js.native
    
    var prefix: Prefix = js.native
  }
  object SeedDecode {
    
    @scala.inline
    def apply(buf: Buffer, prefix: Prefix): SeedDecode = {
      val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeedDecode]
    }
    
    @scala.inline
    implicit class SeedDecodeMutableBuilder[Self <: SeedDecode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuf(value: Buffer): Self = StObject.set(x, "buf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
