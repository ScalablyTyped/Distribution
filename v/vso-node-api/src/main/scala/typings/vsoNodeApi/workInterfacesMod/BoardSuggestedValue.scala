package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoardSuggestedValue extends StObject {
  
  var name: String = js.native
}
object BoardSuggestedValue {
  
  @scala.inline
  def apply(name: String): BoardSuggestedValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardSuggestedValue]
  }
  
  @scala.inline
  implicit class BoardSuggestedValueMutableBuilder[Self <: BoardSuggestedValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
