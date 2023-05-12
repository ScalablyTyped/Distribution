package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManifestResult extends StObject {
  
  var count: Double
  
  var manifestEntries: js.Array[ManifestEntry]
  
  var size: Double
  
  var warnings: js.Array[String]
}
object GetManifestResult {
  
  inline def apply(count: Double, manifestEntries: js.Array[ManifestEntry], size: Double, warnings: js.Array[String]): GetManifestResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], manifestEntries = manifestEntries.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetManifestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManifestResult] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setManifestEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "manifestEntries", value.asInstanceOf[js.Any])
    
    inline def setManifestEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "manifestEntries", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
