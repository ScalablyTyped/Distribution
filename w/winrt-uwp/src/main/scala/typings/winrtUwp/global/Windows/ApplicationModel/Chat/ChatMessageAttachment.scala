package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an attachment to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageAttachment")
@js.native
open class ChatMessageAttachment protected ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageAttachment {
  /**
    * Initializes a new instance of the ChatMessageAttachment class.
    * @param mimeType The MIME type of the attachment.
    * @param dataStreamReference A stream containing the attachment data.
    */
  def this(mimeType: String, dataStreamReference: IRandomAccessStreamReference) = this()
  
  /** Gets or sets a stream reference for a message attachment. */
  /* CompleteClass */
  var dataStreamReference: IRandomAccessStreamReference = js.native
  
  /** Gets or sets the identifier for the attachment group to which this attachment belongs. */
  /* CompleteClass */
  var groupId: Double = js.native
  
  /** Gets or sets the MIME type of the attachment. */
  /* CompleteClass */
  var mimeType: String = js.native
  
  /** Gets or sets the original file name of the attachment. */
  /* CompleteClass */
  var originalFileName: String = js.native
  
  /** Gets or sets the text encoded representation of the attachment object. */
  /* CompleteClass */
  var text: String = js.native
  
  /** Gets or sets the thumbnail image for the attachment. */
  /* CompleteClass */
  var thumbnail: IRandomAccessStreamReference = js.native
  
  /** Gets or sets the progress of transferring the attachment. */
  /* CompleteClass */
  var transferProgress: Double = js.native
}
