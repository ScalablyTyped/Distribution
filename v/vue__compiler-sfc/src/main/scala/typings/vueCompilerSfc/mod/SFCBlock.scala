package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import typings.std.Record
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCBlock extends StObject {
  
  var attrs: Record[String, String | `true`]
  
  var content: String
  
  var lang: js.UndefOr[String] = js.undefined
  
  var loc: SourceLocation
  
  var map: js.UndefOr[RawSourceMap] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object SFCBlock {
  
  inline def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: String): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
  
  extension [Self <: SFCBlock](x: Self) {
    
    inline def setAttrs(value: Record[String, String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
