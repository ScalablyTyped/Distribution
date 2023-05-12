package typings.workboxBuild.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestEntry extends StObject {
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var revision: String | Null
  
  var url: String
}
object ManifestEntry {
  
  inline def apply(url: String): ManifestEntry = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], revision = null)
    __obj.asInstanceOf[ManifestEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManifestEntry] (val x: Self) extends AnyVal {
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
