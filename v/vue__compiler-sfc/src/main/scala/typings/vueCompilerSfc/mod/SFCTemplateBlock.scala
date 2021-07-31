package typings.vueCompilerSfc.mod

import typings.std.Record
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typings.vueCompilerSfc.vueCompilerSfcStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCTemplateBlock
  extends StObject
     with SFCBlock {
  
  var functional: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_SFCTemplateBlock: template
}
object SFCTemplateBlock {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation): SFCTemplateBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("template")
    __obj.asInstanceOf[SFCTemplateBlock]
  }
  
  @scala.inline
  implicit class SFCTemplateBlockMutableBuilder[Self <: SFCTemplateBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctional(value: Boolean): Self = StObject.set(x, "functional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionalUndefined: Self = StObject.set(x, "functional", js.undefined)
    
    @scala.inline
    def setType(value: template): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
