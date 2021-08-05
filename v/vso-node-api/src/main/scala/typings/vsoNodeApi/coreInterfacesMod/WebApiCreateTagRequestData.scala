package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApiCreateTagRequestData extends StObject {
  
  /**
    * Name of the tag definition that will be created.
    */
  var name: String
}
object WebApiCreateTagRequestData {
  
  inline def apply(name: String): WebApiCreateTagRequestData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiCreateTagRequestData]
  }
  
  extension [Self <: WebApiCreateTagRequestData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
