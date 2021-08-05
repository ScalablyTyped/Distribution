package typings.utif

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utif", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode(buffer: Buffer): js.Array[IFD] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[IFD]]
  inline def decode(buffer: ArrayBuffer): js.Array[IFD] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Array[IFD]]
  
  inline def decodeImage(buffer: Buffer, ifd: IFD): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(buffer.asInstanceOf[js.Any], ifd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def decodeImage(buffer: ArrayBuffer, ifd: IFD): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeImage")(buffer.asInstanceOf[js.Any], ifd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encode(ifds: js.Array[IFD]): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(ifds.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  inline def encodeImage(rgba: Uint8Array, w: Double, h: Double): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeImage")(rgba.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  inline def encodeImage(rgba: Uint8Array, w: Double, h: Double, metadata: IFD): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeImage")(rgba.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
  
  inline def replaceIMG(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceIMG")().asInstanceOf[Unit]
  
  inline def toRGBA8(ifd: IFD): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGBA8")(ifd.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  trait IFD
    extends StObject
       with /* property */ StringDictionary[TiffTag | Double | Uint8Array] {
    
    var data: Uint8Array
    
    var height: Double
    
    var width: Double
  }
  object IFD {
    
    inline def apply(data: Uint8Array, height: Double, width: Double): IFD = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFD]
    }
    
    extension [Self <: IFD](x: Self) {
      
      inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type TiffTag = js.Array[Double | String]
}
