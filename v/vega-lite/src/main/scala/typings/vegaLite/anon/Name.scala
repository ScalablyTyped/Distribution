package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Name extends StObject {
  
  var name: String = js.native
  
  var role: String = js.native
  
  var title: Align | Anchor | Angle | Aria | Baseline | Color = js.native
  
  var `type`: String = js.native
}
object Name {
  
  @scala.inline
  def apply(
    name: String,
    role: String,
    title: Align | Anchor | Angle | Aria | Baseline | Color,
    `type`: String
  ): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: Align | Anchor | Angle | Aria | Baseline | Color): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
