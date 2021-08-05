package typings.typescript.mod

import typings.typescript.mod.TypePredicateKind.AssertsIdentifier
import typings.typescript.mod.TypePredicateKind.AssertsThis
import typings.typescript.mod.TypePredicateKind.This
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescript.mod.ThisTypePredicate
  - typings.typescript.mod.IdentifierTypePredicate
  - typings.typescript.mod.AssertsThisTypePredicate
  - typings.typescript.mod.AssertsIdentifierTypePredicate
*/
trait TypePredicate extends StObject
object TypePredicate {
  
  inline def AssertsIdentifierTypePredicate(kind: AssertsIdentifier, parameterIndex: Double, parameterName: java.lang.String): typings.typescript.mod.AssertsIdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.AssertsIdentifierTypePredicate]
  }
  
  inline def AssertsThisTypePredicate(kind: AssertsThis, parameterIndex: Unit, parameterName: Unit): typings.typescript.mod.AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.AssertsThisTypePredicate]
  }
  
  inline def IdentifierTypePredicate(
    kind: typings.typescript.mod.TypePredicateKind.Identifier,
    parameterIndex: Double,
    parameterName: java.lang.String,
    `type`: Type
  ): typings.typescript.mod.IdentifierTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.IdentifierTypePredicate]
  }
  
  inline def ThisTypePredicate(kind: This, parameterIndex: Unit, parameterName: Unit, `type`: Type): typings.typescript.mod.ThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescript.mod.ThisTypePredicate]
  }
}
