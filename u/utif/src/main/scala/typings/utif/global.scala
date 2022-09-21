package typings.utif

import typings.node.bufferMod.global.Buffer
import typings.utif.mod.IFD
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object UTIF {
    
    @JSGlobal("UTIF")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decode(buffer: js.typedarray.ArrayBuffer): js.Array[IFD] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[IFD]]
    inline def decode(buffer: Buffer): js.Array[IFD] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[IFD]]
    
    inline def decodeImage(buffer: js.typedarray.ArrayBuffer, ifd: IFD): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(buffer.asInstanceOf[js.Any], ifd.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def decodeImage(buffer: Buffer, ifd: IFD): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(buffer.asInstanceOf[js.Any], ifd.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def encode(ifds: js.Array[IFD]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ifds.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    inline def encodeImage(rgba: js.typedarray.Uint8Array, w: Double, h: Double): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeImage")(rgba.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def encodeImage(rgba: js.typedarray.Uint8Array, w: Double, h: Double, metadata: IFD): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeImage")(rgba.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    
    inline def replaceIMG(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceIMG")().asInstanceOf[Unit]
    
    inline def toRGBA8(ifd: IFD): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGBA8")(ifd.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  }
}
