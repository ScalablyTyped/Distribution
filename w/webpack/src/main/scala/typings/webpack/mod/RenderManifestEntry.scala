package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.webpack.mod.RenderManifestEntryTemplated
  - typings.webpack.mod.RenderManifestEntryStatic
*/
trait RenderManifestEntry extends StObject
object RenderManifestEntry {
  
  inline def RenderManifestEntryStatic(filename: String, identifier: String, info: AssetInfo, render: () => Source): typings.webpack.mod.RenderManifestEntryStatic = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[typings.webpack.mod.RenderManifestEntryStatic]
  }
  
  inline def RenderManifestEntryTemplated(
    filenameTemplate: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String]),
    identifier: String,
    render: () => Source
  ): typings.webpack.mod.RenderManifestEntryTemplated = {
    val __obj = js.Dynamic.literal(filenameTemplate = filenameTemplate.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[typings.webpack.mod.RenderManifestEntryTemplated]
  }
}
