package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads a batch of email conversations. */
@JSGlobal("Windows.ApplicationModel.Email.EmailConversationReader")
@js.native
abstract class EmailConversationReader ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailConversationReader {
  
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Email.EmailConversationBatch] = js.native
}
