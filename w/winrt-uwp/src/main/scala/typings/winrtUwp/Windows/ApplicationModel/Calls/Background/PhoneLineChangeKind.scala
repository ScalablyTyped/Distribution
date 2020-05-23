package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

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
  
}

