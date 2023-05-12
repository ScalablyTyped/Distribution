package typings.workboxBuild.buildTypesMod

import typings.workboxBuild.anon.ManifestEntrysizenumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestTransformResult extends StObject {
  
  var manifest: js.Array[ManifestEntrysizenumber]
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object ManifestTransformResult {
  
  inline def apply(manifest: js.Array[ManifestEntrysizenumber]): ManifestTransformResult = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestTransformResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestTransformResult] (val x: Self) extends AnyVal {
    
    inline def setManifest(value: js.Array[ManifestEntrysizenumber]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestVarargs(value: ManifestEntrysizenumber*): Self = StObject.set(x, "manifest", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
