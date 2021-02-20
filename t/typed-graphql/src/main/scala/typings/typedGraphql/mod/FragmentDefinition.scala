package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FragmentDefinition
  extends Definition
     with HasSelectionSet
     with Node {
  
  var directives: js.UndefOr[js.Array[Directive]] = js.native
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var name: Name = js.native
  
  var selectionSet: SelectionSet = js.native
  
  var typeCondition: NamedType = js.native
}
object FragmentDefinition {
  
  @scala.inline
  def apply(kind: String, name: Name, selectionSet: SelectionSet, typeCondition: NamedType): FragmentDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentDefinition]
  }
  
  @scala.inline
  implicit class FragmentDefinitionMutableBuilder[Self <: FragmentDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectives(value: js.Array[Directive]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: Directive*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionSet(value: SelectionSet): Self = StObject.set(x, "selectionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeCondition(value: NamedType): Self = StObject.set(x, "typeCondition", value.asInstanceOf[js.Any])
  }
}
