package typings.vueCompilerSfc.mod

import typings.std.Record
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typings.vueCompilerSfc.vueCompilerSfcStrings.style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCStyleBlock extends SFCBlock {
  
  var module: js.UndefOr[String | Boolean] = js.native
  
  var scoped: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_SFCStyleBlock: style = js.native
  
  var vars: js.UndefOr[String] = js.native
}
object SFCStyleBlock {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: style): SFCStyleBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCStyleBlock]
  }
  
  @scala.inline
  implicit class SFCStyleBlockMutableBuilder[Self <: SFCStyleBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModule(value: String | Boolean): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    @scala.inline
    def setType(value: style): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVars(value: String): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}
