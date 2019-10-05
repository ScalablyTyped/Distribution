package typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background

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
  
  /* 0 */ val added: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.added with Double = js.native
  /* 2 */ val propertiesChanged: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.propertiesChanged with Double = js.native
  /* 1 */ val removed: typings.winrtDashUwp.Windows.ApplicationModel.Calls.Background.PhoneLineChangeKind.removed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PhoneLineChangeKind with Double] = js.native
}

