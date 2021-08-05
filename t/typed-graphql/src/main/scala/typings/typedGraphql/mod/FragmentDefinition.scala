package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragmentDefinition
  extends StObject
     with Definition
     with HasSelectionSet
     with Node {
  
  var directives: js.UndefOr[js.Array[Directive]] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
  
  var selectionSet: SelectionSet
  
  var typeCondition: NamedType
}
object FragmentDefinition {
  
  inline def apply(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentDefinition]
  }
  
  extension [Self <: FragmentDefinition](x: Self) {
    
    inline def setDirectives(value: js.Array[Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    inline def setDirectivesVarargs(value: Directive*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelectionSet(value: SelectionSet): Self = StObject.set(x, "selectionSet", value.asInstanceOf[js.Any])
    
    inline def setTypeCondition(value: NamedType): Self = StObject.set(x, "typeCondition", value.asInstanceOf[js.Any])
  }
}
