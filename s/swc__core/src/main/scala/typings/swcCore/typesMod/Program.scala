package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.Module
  - typings.swcCore.typesMod.Script
*/
trait Program extends StObject
object Program {
  
  inline def Module(body: js.Array[ModuleItem], interpreter: String, span: Span): typings.swcCore.typesMod.Module = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Module")
    __obj.asInstanceOf[typings.swcCore.typesMod.Module]
  }
  
  inline def Script(body: js.Array[Statement], interpreter: String, span: Span): typings.swcCore.typesMod.Script = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], interpreter = interpreter.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Script")
    __obj.asInstanceOf[typings.swcCore.typesMod.Script]
  }
}
