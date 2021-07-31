package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailImportance extends StObject
/** Defines the importance of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailImportance")
@js.native
object EmailImportance extends StObject {
  
  /** The email message is of high importance. */
  @js.native
  sealed trait high
    extends StObject
       with EmailImportance
  
  /** The email message is of low importance. */
  @js.native
  sealed trait low
    extends StObject
       with EmailImportance
  
  /** The email message is of normal importance. */
  @js.native
  sealed trait normal
    extends StObject
       with EmailImportance
}
