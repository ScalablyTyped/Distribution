package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderManifestEntryTemplated
  extends StObject
     with RenderManifestEntry {
  
  var auxiliary: js.UndefOr[Boolean] = js.undefined
  
  var filenameTemplate: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String])
  
  var hash: js.UndefOr[String] = js.undefined
  
  var identifier: String
  
  var info: js.UndefOr[AssetInfo] = js.undefined
  
  var pathOptions: js.UndefOr[PathData] = js.undefined
  
  def render(): Source
}
object RenderManifestEntryTemplated {
  
  inline def apply(
    filenameTemplate: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]),
    identifier: String,
    render: () => Source
  ): RenderManifestEntryTemplated = {
    val __obj = js.Dynamic.literal(filenameTemplate = filenameTemplate.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[RenderManifestEntryTemplated]
  }
  
  extension [Self <: RenderManifestEntryTemplated](x: Self) {
    
    inline def setAuxiliary(value: Boolean): Self = StObject.set(x, "auxiliary", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryUndefined: Self = StObject.set(x, "auxiliary", js.undefined)
    
    inline def setFilenameTemplate(value: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String])): Self = StObject.set(x, "filenameTemplate", value.asInstanceOf[js.Any])
    
    inline def setFilenameTemplateFunction2(value: (/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filenameTemplate", js.Any.fromFunction2(value))
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setPathOptions(value: PathData): Self = StObject.set(x, "pathOptions", value.asInstanceOf[js.Any])
    
    inline def setPathOptionsUndefined: Self = StObject.set(x, "pathOptions", js.undefined)
    
    inline def setRender(value: () => Source): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
