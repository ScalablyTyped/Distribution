package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderManifestEntryStatic
  extends StObject
     with RenderManifestEntry {
  
  var auxiliary: js.UndefOr[Boolean] = js.undefined
  
  var filename: String
  
  var hash: js.UndefOr[String] = js.undefined
  
  var identifier: String
  
  var info: AssetInfo
  
  def render(): Source
}
object RenderManifestEntryStatic {
  
  inline def apply(filename: String, identifier: String, info: AssetInfo, render: () => Source): RenderManifestEntryStatic = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[RenderManifestEntryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderManifestEntryStatic] (val x: Self) extends AnyVal {
    
    inline def setAuxiliary(value: Boolean): Self = StObject.set(x, "auxiliary", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryUndefined: Self = StObject.set(x, "auxiliary", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setRender(value: () => Source): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
