package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitStatusContext extends StObject {
  
  /**
    * Genre of the status. Typically name of the service/tool generating the status, can be empty.
    */
  var genre: String
  
  /**
    * Name identifier of the status, cannot be null or empty.
    */
  var name: String
}
object GitStatusContext {
  
  inline def apply(genre: String, name: String): GitStatusContext = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitStatusContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitStatusContext] (val x: Self) extends AnyVal {
    
    inline def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
