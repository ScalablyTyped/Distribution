package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApiCreateTagRequestData extends StObject {
  
  /**
    * Name of the tag definition that will be created.
    */
  var name: String = js.native
}
object WebApiCreateTagRequestData {
  
  @scala.inline
  def apply(name: String): WebApiCreateTagRequestData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiCreateTagRequestData]
  }
  
  @scala.inline
  implicit class WebApiCreateTagRequestDataMutableBuilder[Self <: WebApiCreateTagRequestData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
