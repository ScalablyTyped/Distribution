package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about a change that occurred to a mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxAction")
@js.native
abstract class EmailMailboxAction ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxAction {
  
  /** Gets the number that identifies the change that happened to the mailbox. */
  /* CompleteClass */
  var changeNumber: Double = js.native
  
  /** Gets the value that represents the kind of change that happened to the mailbox. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxActionKind = js.native
}
