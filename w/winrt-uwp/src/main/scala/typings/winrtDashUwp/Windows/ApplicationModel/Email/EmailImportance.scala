package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailImportance extends js.Object

/** Defines the importance of an email message. */
@JSGlobal("Windows.ApplicationModel.Email.EmailImportance")
@js.native
object EmailImportance extends js.Object {
  /** The email message is of high importance. */
  @js.native
  sealed trait high extends EmailImportance
  
  /** The email message is of low importance. */
  @js.native
  sealed trait low extends EmailImportance
  
  /** The email message is of normal importance. */
  @js.native
  sealed trait normal extends EmailImportance
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailImportance with Double] = js.native
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 2 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 0 */ @js.native
  object normal extends TopLevel[normal with Double]
  
}

