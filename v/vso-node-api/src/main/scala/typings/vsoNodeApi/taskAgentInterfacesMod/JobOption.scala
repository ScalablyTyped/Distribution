package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobOption extends StObject {
  
  var data: StringDictionary[String] = js.native
  
  /**
    * Gets the id of the option.
    */
  var id: String = js.native
}
object JobOption {
  
  @scala.inline
  def apply(data: StringDictionary[String], id: String): JobOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOption]
  }
  
  @scala.inline
  implicit class JobOptionMutableBuilder[Self <: JobOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
