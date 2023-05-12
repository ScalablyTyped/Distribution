package typings.workboxBuild.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined workbox-build.workbox-build/build/types.ManifestEntry & {  size :number} */
trait ManifestEntrysizenumber extends StObject {
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var revision: String | Null
  
  var size: Double
  
  var url: String
}
object ManifestEntrysizenumber {
  
  inline def apply(size: Double, url: String): ManifestEntrysizenumber = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], revision = null)
    __obj.asInstanceOf[ManifestEntrysizenumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestEntrysizenumber] (val x: Self) extends AnyVal {
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
