package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebApiProjectCollection
  extends StObject
     with WebApiProjectCollectionRef {
  
  /**
    * Project collection description
    */
  var description: String
  
  /**
    * Project collection state
    */
  var state: String
}
object WebApiProjectCollection {
  
  @scala.inline
  def apply(collectionUrl: String, description: String, id: String, name: String, state: String, url: String): WebApiProjectCollection = {
    val __obj = js.Dynamic.literal(collectionUrl = collectionUrl.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebApiProjectCollection]
  }
  
  @scala.inline
  implicit class WebApiProjectCollectionMutableBuilder[Self <: WebApiProjectCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
