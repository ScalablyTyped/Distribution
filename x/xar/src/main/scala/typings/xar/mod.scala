package typings.xar

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
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
  val create: js.Function2[/* dir */ String, /* opts */ js.UndefOr[PackOptions], Readable] = js.native
  
  inline def extract(data: Buffer, cb: ExtractCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extract")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getToc(data: Buffer, cb: GetTOCCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getToc")(data.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def pack(dir: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(dir.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def pack(dir: String, opts: PackOptions): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(dir.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  @JSImport("xar", "unpack")
  @js.native
  val unpack: js.Function2[/* data */ Buffer, /* cb */ ExtractCallback, Unit] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.xar.xarStrings.none
    - typings.xar.xarStrings.gzip
  */
  trait Compression extends StObject
  object Compression {
    
    inline def gzip: typings.xar.xarStrings.gzip = "gzip".asInstanceOf[typings.xar.xarStrings.gzip]
    
    inline def none: typings.xar.xarStrings.none = "none".asInstanceOf[typings.xar.xarStrings.none]
  }
  
  type ExtractCallback = js.Function3[
    /* error */ js.Error | Null, 
    /* file */ Record[String, Any], 
    /* content */ js.UndefOr[String], 
    Unit
  ]
  
  type GetTOCCallback = js.Function4[
    /* error */ js.Error | Null, 
    /* xmlBuffer */ Buffer, 
    /* json */ Record[String, Any], 
    /* header */ TOCHeader, 
    Unit
  ]
  
  trait PackOptions extends StObject {
    
    var compression: js.UndefOr[Compression] = js.undefined
  }
  object PackOptions {
    
    inline def apply(): PackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PackOptions] (val x: Self) extends AnyVal {
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TOCHeader] (val x: Self) extends AnyVal {
      
      inline def setCksumAlg(value: Double): Self = StObject.set(x, "cksumAlg", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTocLengthCompressed(value: Double): Self = StObject.set(x, "tocLengthCompressed", value.asInstanceOf[js.Any])
      
      inline def setTocLengthUncompressed(value: Double): Self = StObject.set(x, "tocLengthUncompressed", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
