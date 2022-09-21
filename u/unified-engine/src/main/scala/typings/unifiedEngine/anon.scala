package typings.unifiedEngine

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Create[Value /* <: js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {  filePath :string | undefined} */ js.Any) */] extends StObject {
    
    def create(buf: Buffer, filePath: String): js.UndefOr[js.Promise[js.UndefOr[Value]] | Value]
    
    var cwd: String
    
    var detect: js.UndefOr[Boolean] = js.undefined
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var names: js.Array[String]
  }
  object Create {
    
    inline def apply[Value /* <: js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {  filePath :string | undefined} */ js.Any) */](
      create: (Buffer, String) => js.UndefOr[js.Promise[js.UndefOr[Value]] | Value],
      cwd: String,
      names: js.Array[String]
    ): Create[Value] = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), cwd = cwd.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
      __obj.asInstanceOf[Create[Value]]
    }
    
    extension [Self <: Create[?], Value /* <: js.Object & (/* import warning: importer.ImportType#apply Failed type conversion: {  filePath :string | undefined} */ js.Any) */](x: Self & Create[Value]) {
      
      inline def setCreate(value: (Buffer, String) => js.UndefOr[js.Promise[js.UndefOr[Value]] | Value]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDetect(value: Boolean): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
      
      inline def setDetectUndefined: Self = StObject.set(x, "detect", js.undefined)
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    }
  }
  
  trait FilePath extends StObject {
    
    var filePath: js.UndefOr[String] = js.undefined
  }
  object FilePath {
    
    inline def apply(): FilePath = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilePath]
    }
    
    extension [Self <: FilePath](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    }
  }
  
  trait PluginId extends StObject {
    
    var pluginId: js.UndefOr[String] = js.undefined
  }
  object PluginId {
    
    inline def apply(): PluginId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginId]
    }
    
    extension [Self <: PluginId](x: Self) {
      
      inline def setPluginId(value: String): Self = StObject.set(x, "pluginId", value.asInstanceOf[js.Any])
      
      inline def setPluginIdUndefined: Self = StObject.set(x, "pluginId", js.undefined)
    }
  }
}
