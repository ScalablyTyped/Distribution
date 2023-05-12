package typings.tufjsModels

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.Record
import typings.tufjsModels.distUtilsTypesMod.JSONObject
import typings.tufjsModels.distUtilsTypesMod.JSONValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFileMod {
  
  @JSImport("@tufjs/models/dist/file", "MetaFile")
  @js.native
  open class MetaFile protected () extends StObject {
    def this(opts: MetaFileOptions) = this()
    
    def equals(other: MetaFile): Boolean = js.native
    
    val hashes: js.UndefOr[Record[String, String]] = js.native
    
    val length: js.UndefOr[Double] = js.native
    
    def toJSON(): JSONObject = js.native
    
    val unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.native
    
    def verify(data: Buffer): Unit = js.native
    
    val version: Double = js.native
  }
  /* static members */
  object MetaFile {
    
    @JSImport("@tufjs/models/dist/file", "MetaFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(data: JSONObject): MetaFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[MetaFile]
  }
  
  @JSImport("@tufjs/models/dist/file", "TargetFile")
  @js.native
  open class TargetFile protected () extends StObject {
    def this(opts: TargetFileOptions) = this()
    
    def custom: Record[String, Any] = js.native
    
    def equals(other: TargetFile): Boolean = js.native
    
    val hashes: Record[String, String] = js.native
    
    val length: Double = js.native
    
    val path: String = js.native
    
    def toJSON(): JSONObject = js.native
    
    val unrecognizedFields: Record[String, JSONValue] = js.native
    
    def verify(stream: Readable): js.Promise[Unit] = js.native
  }
  /* static members */
  object TargetFile {
    
    @JSImport("@tufjs/models/dist/file", "TargetFile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(path: String, data: JSONObject): TargetFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[TargetFile]
  }
  
  trait MetaFileOptions extends StObject {
    
    var hashes: js.UndefOr[Record[String, String]] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.undefined
    
    var version: Double
  }
  object MetaFileOptions {
    
    inline def apply(version: Double): MetaFileOptions = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetaFileOptions] (val x: Self) extends AnyVal {
      
      inline def setHashes(value: Record[String, String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
      
      inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setUnrecognizedFields(value: Record[String, JSONValue]): Self = StObject.set(x, "unrecognizedFields", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFieldsUndefined: Self = StObject.set(x, "unrecognizedFields", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetFileOptions extends StObject {
    
    var hashes: Record[String, String]
    
    var length: Double
    
    var path: String
    
    var unrecognizedFields: js.UndefOr[Record[String, JSONValue]] = js.undefined
  }
  object TargetFileOptions {
    
    inline def apply(hashes: Record[String, String], length: Double, path: String): TargetFileOptions = {
      val __obj = js.Dynamic.literal(hashes = hashes.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetFileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TargetFileOptions] (val x: Self) extends AnyVal {
      
      inline def setHashes(value: Record[String, String]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFields(value: Record[String, JSONValue]): Self = StObject.set(x, "unrecognizedFields", value.asInstanceOf[js.Any])
      
      inline def setUnrecognizedFieldsUndefined: Self = StObject.set(x, "unrecognizedFields", js.undefined)
    }
  }
}
