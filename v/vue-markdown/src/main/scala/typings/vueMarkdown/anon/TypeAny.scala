package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAny extends StObject {
  
  var `type`: js.Any = js.native
}
object TypeAny {
  
  @scala.inline
  def apply(`type`: js.Any): TypeAny = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeAny]
  }
  
  @scala.inline
  implicit class TypeAnyMutableBuilder[Self <: TypeAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
