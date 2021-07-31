package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Front extends StObject {
  
  /**
    * The back of a document returned by a file upload with a purpose value of identity_document.
    */
  var back: String
  
  /**
    * The front of a document returned by a file upload with a purpose value of identity_document.
    */
  var front: String
}
object Front {
  
  @scala.inline
  def apply(back: String, front: String): Front = {
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any])
    __obj.asInstanceOf[Front]
  }
  
  @scala.inline
  implicit class FrontMutableBuilder[Self <: Front] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBack(value: String): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFront(value: String): Self = StObject.set(x, "front", value.asInstanceOf[js.Any])
  }
}
