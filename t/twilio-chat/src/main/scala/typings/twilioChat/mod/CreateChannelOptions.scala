package typings.twilioChat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for {@link Client.createChannel}.
  */
trait CreateChannelOptions extends StObject {
  
  /**
    * Any custom attributes to attach to the channel.
    */
  var attributes: js.UndefOr[Any] = js.undefined
  
  /**
    * A non-unique display name of the channel.
    */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /**
    * Signifies whether the channel is private.
    */
  var isPrivate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A unique identifier of the channel.
    */
  var uniqueName: js.UndefOr[String] = js.undefined
}
object CreateChannelOptions {
  
  inline def apply(): CreateChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
