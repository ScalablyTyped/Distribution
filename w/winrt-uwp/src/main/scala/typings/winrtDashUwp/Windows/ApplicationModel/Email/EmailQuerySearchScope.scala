package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailQuerySearchScope extends js.Object

/** Defines the scope of a query. */
@JSGlobal("Windows.ApplicationModel.Email.EmailQuerySearchScope")
@js.native
object EmailQuerySearchScope extends js.Object {
  /** Query only the local email message collection. */
  @js.native
  sealed trait local extends EmailQuerySearchScope
  
  /** Query the entire email message collection contained on the email server. */
  @js.native
  sealed trait server extends EmailQuerySearchScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailQuerySearchScope with Double] = js.native
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 1 */ @js.native
  object server extends TopLevel[server with Double]
  
}

