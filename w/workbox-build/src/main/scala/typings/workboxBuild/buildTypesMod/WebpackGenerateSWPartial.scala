package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackGenerateSWPartial extends StObject {
  
  /**
    * One or more names of webpack chunks. The content of those chunks will be
    * included in the generated service worker, via a call to `importScripts()`.
    */
  var importScriptsViaChunks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The asset name of the service worker file created by this plugin.
    * @default "service-worker.js"
    */
  var swDest: js.UndefOr[String] = js.undefined
}
object WebpackGenerateSWPartial {
  
  inline def apply(): WebpackGenerateSWPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackGenerateSWPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebpackGenerateSWPartial] (val x: Self) extends AnyVal {
    
    inline def setImportScriptsViaChunks(value: js.Array[String]): Self = StObject.set(x, "importScriptsViaChunks", value.asInstanceOf[js.Any])
    
    inline def setImportScriptsViaChunksUndefined: Self = StObject.set(x, "importScriptsViaChunks", js.undefined)
    
    inline def setImportScriptsViaChunksVarargs(value: String*): Self = StObject.set(x, "importScriptsViaChunks", js.Array(value*))
    
    inline def setSwDest(value: String): Self = StObject.set(x, "swDest", value.asInstanceOf[js.Any])
    
    inline def setSwDestUndefined: Self = StObject.set(x, "swDest", js.undefined)
  }
}
