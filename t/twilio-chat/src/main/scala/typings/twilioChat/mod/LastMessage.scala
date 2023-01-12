package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the last message of a channel.
  */
trait LastMessage extends StObject {
  
  /**
    *  Message's creation date.
    */
  var dateCreated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Message's index.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object LastMessage {
  
  inline def apply(): LastMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastMessage] (val x: Self) extends AnyVal {
    
    inline def setDateCreated(value: js.Date): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
