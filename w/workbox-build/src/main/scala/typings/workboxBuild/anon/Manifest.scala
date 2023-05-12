package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Manifest extends StObject {
  
  var manifest: js.Array[ManifestEntrysizenumber]
  
  var warnings: js.Array[String]
}
object Manifest {
  
  inline def apply(manifest: js.Array[ManifestEntrysizenumber], warnings: js.Array[String]): Manifest = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
    
    inline def setManifest(value: js.Array[ManifestEntrysizenumber]): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestVarargs(value: ManifestEntrysizenumber*): Self = StObject.set(x, "manifest", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
