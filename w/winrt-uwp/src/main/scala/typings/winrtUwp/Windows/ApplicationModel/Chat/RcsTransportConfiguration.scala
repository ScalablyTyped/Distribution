package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about the configuration of a Rich Communication Services (RCS) transport. */
@js.native
trait RcsTransportConfiguration extends StObject {
  
  /** Gets the maximum number of attachments supported by the transport. */
  var maxAttachmentCount: Double = js.native
  
  /** Gets the maximum size of a file that can be sent using the transport. */
  var maxFileSizeInKilobytes: Double = js.native
  
  /** Gets the maximum size of a group chat message supported by the transport. */
  var maxGroupMessageSizeInKilobytes: Double = js.native
  
  /** Gets the maximum size of a chat message supported by the transport. */
  var maxMessageSizeInKilobytes: Double = js.native
  
  /** Gets the maximum number of recipients supported for a group chat. */
  var maxRecipientCount: Double = js.native
  
  /** Gets the size at which the user should be warned that they are attaching a large file for the transport. */
  var warningFileSizeInKilobytes: Double = js.native
}
object RcsTransportConfiguration {
  
  @scala.inline
  def apply(
    maxAttachmentCount: Double,
    maxFileSizeInKilobytes: Double,
    maxGroupMessageSizeInKilobytes: Double,
    maxMessageSizeInKilobytes: Double,
    maxRecipientCount: Double,
    warningFileSizeInKilobytes: Double
  ): RcsTransportConfiguration = {
    val __obj = js.Dynamic.literal(maxAttachmentCount = maxAttachmentCount.asInstanceOf[js.Any], maxFileSizeInKilobytes = maxFileSizeInKilobytes.asInstanceOf[js.Any], maxGroupMessageSizeInKilobytes = maxGroupMessageSizeInKilobytes.asInstanceOf[js.Any], maxMessageSizeInKilobytes = maxMessageSizeInKilobytes.asInstanceOf[js.Any], maxRecipientCount = maxRecipientCount.asInstanceOf[js.Any], warningFileSizeInKilobytes = warningFileSizeInKilobytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsTransportConfiguration]
  }
  
  @scala.inline
  implicit class RcsTransportConfigurationMutableBuilder[Self <: RcsTransportConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxAttachmentCount(value: Double): Self = StObject.set(x, "maxAttachmentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeInKilobytes(value: Double): Self = StObject.set(x, "maxFileSizeInKilobytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxGroupMessageSizeInKilobytes(value: Double): Self = StObject.set(x, "maxGroupMessageSizeInKilobytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessageSizeInKilobytes(value: Double): Self = StObject.set(x, "maxMessageSizeInKilobytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecipientCount(value: Double): Self = StObject.set(x, "maxRecipientCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningFileSizeInKilobytes(value: Double): Self = StObject.set(x, "warningFileSizeInKilobytes", value.asInstanceOf[js.Any])
  }
}
