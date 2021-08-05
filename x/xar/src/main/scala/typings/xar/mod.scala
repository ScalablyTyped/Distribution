package typings.xar

import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("xar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("xar", "create")
  @js.native
  val create: js.Function1[/* dir */ String, Readable] = js.native
  
  inline def extract(data: Buffer, cb: ExtractCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getToc(data: Buffer, cb: GetTOCCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getToc")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pack(dir: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(dir.asInstanceOf[js.Any]).asInstanceOf[Readable]
  
  @JSImport("xar", "unpack")
  @js.native
  val unpack: js.Function2[/* data */ Buffer, /* cb */ ExtractCallback, Unit] = js.native
  
  type ExtractCallback = js.Function3[
    /* error */ Error | Null, 
    /* file */ Record[String, js.Any], 
    /* content */ js.UndefOr[String], 
    Unit
  ]
  
  type GetTOCCallback = js.Function4[
    /* error */ Error | Null, 
    /* xmlBuffer */ Buffer, 
    /* json */ Record[String, js.Any], 
    /* header */ TOCHeader, 
    Unit
  ]
  
  trait TOCHeader extends StObject {
    
    var cksumAlg: Double
    
    var size: Double
    
    var tocLengthCompressed: Double
    
    var tocLengthUncompressed: Double
    
    var version: Double
  }
  object TOCHeader {
    
    inline def apply(
      cksumAlg: Double,
      size: Double,
      tocLengthCompressed: Double,
      tocLengthUncompressed: Double,
      version: Double
    ): TOCHeader = {
      val __obj = js.Dynamic.literal(cksumAlg = cksumAlg.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tocLengthCompressed = tocLengthCompressed.asInstanceOf[js.Any], tocLengthUncompressed = tocLengthUncompressed.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TOCHeader]
    }
    
    extension [Self <: TOCHeader](x: Self) {
      
      inline def setCksumAlg(value: Double): Self = StObject.set(x, "cksumAlg", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTocLengthCompressed(value: Double): Self = StObject.set(x, "tocLengthCompressed", value.asInstanceOf[js.Any])
      
      inline def setTocLengthUncompressed(value: Double): Self = StObject.set(x, "tocLengthUncompressed", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
