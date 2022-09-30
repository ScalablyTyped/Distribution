package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.TsEntityName
  - typings.swcCore.typesMod.TsExternalModuleReference
*/
trait TsModuleReference extends StObject
object TsModuleReference {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.Identifier]
  }
  
  inline def TsExternalModuleReference(expression: StringLiteral, span: Span): typings.swcCore.typesMod.TsExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExternalModuleReference")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsExternalModuleReference]
  }
  
  inline def TsQualifiedName(left: TsEntityName, right: Identifier): typings.swcCore.typesMod.TsQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsQualifiedName")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsQualifiedName]
  }
}
