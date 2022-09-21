package typings.vueCompilerSfc.mod

import typings.std.Record
import typings.vueCompilerCore.mod.ElementNode
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typings.vueCompilerSfc.vueCompilerSfcStrings.template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCTemplateBlock
  extends StObject
     with SFCBlock {
  
  var ast: ElementNode
  
  @JSName("type")
  var type_SFCTemplateBlock: template
}
object SFCTemplateBlock {
  
  inline def apply(ast: ElementNode, attrs: Record[String, String | `true`], content: String, loc: SourceLocation): SFCTemplateBlock = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("template")
    __obj.asInstanceOf[SFCTemplateBlock]
  }
  
  extension [Self <: SFCTemplateBlock](x: Self) {
    
    inline def setAst(value: ElementNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setType(value: template): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
