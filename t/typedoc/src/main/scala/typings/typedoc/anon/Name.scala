package typings.typedoc.anon

import typings.typedoc.typedocStrings.version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: version
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "version")
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: version): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
