package typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PhoneLineChangeKind extends js.Object

/** Indicates the type of change for a background phone line change trigger. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind")
@js.native
object PhoneLineChangeKind extends js.Object {
  /** A new phone line was added. */
  @js.native
  sealed trait added extends PhoneLineChangeKind
  
  /** A phone line has updated properties. */
  @js.native
  sealed trait propertiesChanged extends PhoneLineChangeKind
  
  /** A phone line was removed. */
  @js.native
  sealed trait removed extends PhoneLineChangeKind
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneLineChangeKind with Double] = js.native
  /* 0 */ @js.native
  object added extends TopLevel[added with Double]
  
  /* 2 */ @js.native
  object propertiesChanged extends TopLevel[propertiesChanged with Double]
  
  /* 1 */ @js.native
  object removed extends TopLevel[removed with Double]
  
}

