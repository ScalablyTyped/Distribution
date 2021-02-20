package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contributors extends StObject {
  
  var id: Double = js.native
  
  var id_str: String = js.native
  
  var screen_name: String = js.native
}
object Contributors {
  
  @scala.inline
  def apply(id: Double, id_str: String, screen_name: String): Contributors = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributors]
  }
  
  @scala.inline
  implicit class ContributorsMutableBuilder[Self <: Contributors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
  }
}
