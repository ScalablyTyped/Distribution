package typings.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argument
  extends StObject
     with Node {
  
  var kind: String
  
  var loc: js.UndefOr[Location] = js.undefined
  
  var name: Name
  
  var value: Value
}
object Argument {
  
  @scala.inline
  def apply(kind: String, name: Name, value: Value): Argument = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit class ArgumentMutableBuilder[Self <: Argument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
