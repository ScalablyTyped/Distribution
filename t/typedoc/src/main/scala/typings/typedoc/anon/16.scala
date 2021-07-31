package typings.typedoc.anon

import typings.typedoc.typedocStrings.includeDeclarations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var name: includeDeclarations
}
object `16` {
  
  @scala.inline
  def apply(): `16` = {
    val __obj = js.Dynamic.literal(name = "includeDeclarations")
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: includeDeclarations): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
