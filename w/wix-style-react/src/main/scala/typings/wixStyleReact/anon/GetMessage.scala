package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMessage extends StObject {
  
  /**
    * Gets the component root element
    * @returns {Promise<any>}
    */
  def element(): js.Promise[Any]
  
  /**
    * Checks whether the component found with the given data hook
    * @returns {Promise<boolean>}
    */
  def exists(): js.Promise[Boolean]
  
  /**
    * Gets the message
    * @returns {Promise<string>}
    */
  def getMessage(): js.Promise[String]
  
  /**
    * Gets the role
    * @returns {Promise<string>}
    */
  def getRole(): js.Promise[String | Null]
}
object GetMessage {
  
  inline def apply(
    element: () => js.Promise[Any],
    exists: () => js.Promise[Boolean],
    getMessage: () => js.Promise[String],
    getRole: () => js.Promise[String | Null]
  ): GetMessage = {
    val __obj = js.Dynamic.literal(element = js.Any.fromFunction0(element), exists = js.Any.fromFunction0(exists), getMessage = js.Any.fromFunction0(getMessage), getRole = js.Any.fromFunction0(getRole))
    __obj.asInstanceOf[GetMessage]
  }
  
  extension [Self <: GetMessage](x: Self) {
    
    inline def setElement(value: () => js.Promise[Any]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
    
    inline def setExists(value: () => js.Promise[Boolean]): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
    
    inline def setGetMessage(value: () => js.Promise[String]): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    
    inline def setGetRole(value: () => js.Promise[String | Null]): Self = StObject.set(x, "getRole", js.Any.fromFunction0(value))
  }
}
