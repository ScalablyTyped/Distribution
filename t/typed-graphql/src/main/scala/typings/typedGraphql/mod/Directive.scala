package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Directives
trait Directive
  extends StObject
     with Node {
  
  var arguments: js.UndefOr[js.Array[Argument]] = js.undefined
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
}
object Directive {
  
  @scala.inline
  def apply(kind: String, name: Name): Directive = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
  
  @scala.inline
  implicit class DirectiveMutableBuilder[Self <: Directive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[Argument]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    @scala.inline
    def setArgumentsVarargs(value: Argument*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
