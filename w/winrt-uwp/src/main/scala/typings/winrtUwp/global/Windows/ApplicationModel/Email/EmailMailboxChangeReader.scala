package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangeReader")
@js.native
open class EmailMailboxChangeReader ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangeReader {
  
  /** Accepts all changes. */
  /* CompleteClass */
  override def acceptChanges(): Unit = js.native
  
  /**
    * Accepts all changes through the current change.
    * @param lastChangeToAcknowledge The current change.
    */
  /* CompleteClass */
  override def acceptChangesThrough(lastChangeToAcknowledge: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChange): Unit = js.native
  
  /**
    * Reads a collection of changes.
    * @return A batch of changes.
    */
  /* CompleteClass */
  override def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
}
