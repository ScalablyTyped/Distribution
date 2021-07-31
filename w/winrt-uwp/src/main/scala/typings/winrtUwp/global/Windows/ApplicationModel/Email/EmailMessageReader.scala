package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gets a batch of email messages. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMessageReader")
@js.native
abstract class EmailMessageReader ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageReader {
  
  /**
    * Reads a collection of email messages.
    * @return A batch of email messages.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.ApplicationModel.Email.EmailMessageBatch] = js.native
}
