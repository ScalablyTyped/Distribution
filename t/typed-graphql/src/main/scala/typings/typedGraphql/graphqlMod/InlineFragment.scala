package typings.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineFragment
  extends StObject
     with Node
     with Selection {
  
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var selectionSet: SelectionSet
  
  var typeCondition: js.UndefOr[NamedType] = js.undefined
}
object InlineFragment {
  
  inline def apply(kind: String, selectionSet: SelectionSet): InlineFragment = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineFragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InlineFragment] (val x: Self) extends AnyVal {
    
    inline def setDirectives(value: js.Array[Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: Directive*): Self = StObject.set(x, "directives", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setSelectionSet(value: SelectionSet): Self = StObject.set(x, "selectionSet", value.asInstanceOf[js.Any])
    
    inline def setTypeCondition(value: NamedType): Self = StObject.set(x, "typeCondition", value.asInstanceOf[js.Any])
    
    inline def setTypeConditionUndefined: Self = StObject.set(x, "typeCondition", js.undefined)
  }
}
