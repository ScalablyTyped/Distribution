package typings.unzipper

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CompressedSize extends StObject {
    
    var compressedSize: Double
    
    var compressionMethod: Double
    
    var crc32: Double
    
    var extraFieldLength: Double
    
    var fileNameLength: Double
    
    var flags: Double
    
    var lastModifiedTime: Double
    
    var signature: js.UndefOr[Double] = js.undefined
    
    var versionsNeededToExtract: Double
  }
  object CompressedSize {
    
    inline def apply(
      compressedSize: Double,
      compressionMethod: Double,
      crc32: Double,
      extraFieldLength: Double,
      fileNameLength: Double,
      flags: Double,
      lastModifiedTime: Double,
      versionsNeededToExtract: Double
    ): CompressedSize = {
      val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], compressionMethod = compressionMethod.asInstanceOf[js.Any], crc32 = crc32.asInstanceOf[js.Any], extraFieldLength = extraFieldLength.asInstanceOf[js.Any], fileNameLength = fileNameLength.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], lastModifiedTime = lastModifiedTime.asInstanceOf[js.Any], versionsNeededToExtract = versionsNeededToExtract.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressedSize]
    }
    
    extension [Self <: CompressedSize](x: Self) {
      
      inline def setCompressedSize(value: Double): Self = StObject.set(x, "compressedSize", value.asInstanceOf[js.Any])
      
      inline def setCompressionMethod(value: Double): Self = StObject.set(x, "compressionMethod", value.asInstanceOf[js.Any])
      
      inline def setCrc32(value: Double): Self = StObject.set(x, "crc32", value.asInstanceOf[js.Any])
      
      inline def setExtraFieldLength(value: Double): Self = StObject.set(x, "extraFieldLength", value.asInstanceOf[js.Any])
      
      inline def setFileNameLength(value: Double): Self = StObject.set(x, "fileNameLength", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedTime(value: Double): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Double): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      
      inline def setVersionsNeededToExtract(value: Double): Self = StObject.set(x, "versionsNeededToExtract", value.asInstanceOf[js.Any])
    }
  }
  
  trait Disknum extends StObject {
    
    var compressedSize: Double
    
    var disknum: Double
    
    var offset: Double
    
    var partsize: Double
    
    var signature: Double
    
    var uncompressedSize: Double
  }
  object Disknum {
    
    inline def apply(
      compressedSize: Double,
      disknum: Double,
      offset: Double,
      partsize: Double,
      signature: Double,
      uncompressedSize: Double
    ): Disknum = {
      val __obj = js.Dynamic.literal(compressedSize = compressedSize.asInstanceOf[js.Any], disknum = disknum.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partsize = partsize.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disknum]
    }
    
    extension [Self <: Disknum](x: Self) {
      
      inline def setCompressedSize(value: Double): Self = StObject.set(x, "compressedSize", value.asInstanceOf[js.Any])
      
      inline def setDisknum(value: Double): Self = StObject.set(x, "disknum", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPartsize(value: Double): Self = StObject.set(x, "partsize", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Double): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setUncompressedSize(value: Double): Self = StObject.set(x, "uncompressedSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var path: String
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Promise extends StObject {
    
    def promise(): js.Promise[Unit]
  }
  object Promise {
    
    inline def apply(promise: () => js.Promise[Unit]): Promise = {
      val __obj = js.Dynamic.literal(promise = js.Any.fromFunction0(promise))
      __obj.asInstanceOf[Promise]
    }
    
    extension [Self <: Promise](x: Self) {
      
      inline def setPromise(value: () => js.Promise[Unit]): Self = StObject.set(x, "promise", js.Any.fromFunction0(value))
    }
  }
  
  trait Size extends StObject {
    
    def size(): js.Promise[Double]
    
    var stream: Readable
  }
  object Size {
    
    inline def apply(size: () => js.Promise[Double], stream: Readable): Size = {
      val __obj = js.Dynamic.literal(size = js.Any.fromFunction0(size), stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setSize(value: () => js.Promise[Double]): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
