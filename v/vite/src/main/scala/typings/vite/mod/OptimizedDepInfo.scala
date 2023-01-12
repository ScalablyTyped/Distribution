package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizedDepInfo extends StObject {
  
  var browserHash: js.UndefOr[String] = js.undefined
  
  /**
    * ExportData cache, discovered deps will parse the src entry to get exports
    * data used both to define if interop is needed and when pre-bundling
    */
  var exportsData: js.UndefOr[js.Promise[ExportsData]] = js.undefined
  
  var file: String
  
  var fileHash: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var needsInterop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * During optimization, ids can still be resolved to their final location
    * but the bundles may not yet be saved to disk
    */
  var processing: js.UndefOr[js.Promise[Unit]] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
}
object OptimizedDepInfo {
  
  inline def apply(file: String, id: String): OptimizedDepInfo = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizedDepInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimizedDepInfo] (val x: Self) extends AnyVal {
    
    inline def setBrowserHash(value: String): Self = StObject.set(x, "browserHash", value.asInstanceOf[js.Any])
    
    inline def setBrowserHashUndefined: Self = StObject.set(x, "browserHash", js.undefined)
    
    inline def setExportsData(value: js.Promise[ExportsData]): Self = StObject.set(x, "exportsData", value.asInstanceOf[js.Any])
    
    inline def setExportsDataUndefined: Self = StObject.set(x, "exportsData", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileHash(value: String): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNeedsInterop(value: Boolean): Self = StObject.set(x, "needsInterop", value.asInstanceOf[js.Any])
    
    inline def setNeedsInteropUndefined: Self = StObject.set(x, "needsInterop", js.undefined)
    
    inline def setProcessing(value: js.Promise[Unit]): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
    
    inline def setProcessingUndefined: Self = StObject.set(x, "processing", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
