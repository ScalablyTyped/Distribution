package typings.tsNkeys

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import typings.tsNkeys.mod.Prefix
import typings.tsNkeys.utilMod.ToArrayBuffer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @scala.inline
    def _decode(src: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("_decode")(src.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    @scala.inline
    def _decodePrefix(raw: Buffer): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_decodePrefix")(raw.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
    
    @scala.inline
    def _encode(seed: Boolean, role: Prefix, payload: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_encode")(seed.asInstanceOf[js.Any], role.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def _encodePrefix(kind: Prefix, role: Prefix): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("_encodePrefix")(kind.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def decode(expected: Prefix, src: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(expected.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def decodeSeed(src: Buffer): SeedDecode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSeed")(src.asInstanceOf[js.Any]).asInstanceOf[SeedDecode]
    
    @scala.inline
    def encode(prefix: Prefix, src: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @scala.inline
    def encodeSeed(role: Prefix, src: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSeed")(role.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("ts-nkeys/lib/codec", "Codec.toArrayBuffer")
    @js.native
    def toArrayBuffer: ToArrayBuffer_ = js.native
    @scala.inline
    def toArrayBuffer(buf: Buffer): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    @scala.inline
    def toArrayBuffer_=(x: ToArrayBuffer_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toArrayBuffer")(x.asInstanceOf[js.Any])
  }
  
  trait SeedDecode extends StObject {
    
    var buf: Buffer
    
    var prefix: Prefix
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
