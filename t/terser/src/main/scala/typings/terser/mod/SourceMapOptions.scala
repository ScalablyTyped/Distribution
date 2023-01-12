package typings.terser.mod

import typings.jridgewellTraceMapping.distTypesTypesMod.SectionedSourceMapInput
import typings.terser.terserStrings.`inline`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceMapOptions extends StObject {
  
  /** Source map object, 'inline' or source map file content */
  var content: js.UndefOr[SectionedSourceMapInput | String] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var includeSources: js.UndefOr[Boolean] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String | `inline`] = js.undefined
}
object SourceMapOptions {
  
  inline def apply(): SourceMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceMapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceMapOptions] (val x: Self) extends AnyVal {
    
    inline def setContent(value: SectionedSourceMapInput | String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setIncludeSources(value: Boolean): Self = StObject.set(x, "includeSources", value.asInstanceOf[js.Any])
    
    inline def setIncludeSourcesUndefined: Self = StObject.set(x, "includeSources", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setUrl(value: String | `inline`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
