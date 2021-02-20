package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import typings.std.Record
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCBlock extends StObject {
  
  var attrs: Record[String, String | `true`] = js.native
  
  var content: String = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var loc: SourceLocation = js.native
  
  var map: js.UndefOr[RawSourceMap] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object SFCBlock {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: String): SFCBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCBlock]
  }
  
  @scala.inline
  implicit class SFCBlockMutableBuilder[Self <: SFCBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: Record[String, String | `true`]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
