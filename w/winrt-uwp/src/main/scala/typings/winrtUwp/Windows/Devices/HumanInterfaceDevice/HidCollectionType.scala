package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HidCollectionType extends js.Object

/** Identifies the relationship that defines a grouping of controls on the device. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollectionType")
@js.native
object HidCollectionType extends js.Object {
  /** The controls are related by intended application. */
  @js.native
  sealed trait application extends HidCollectionType
  
  /** The controls are logically related. */
  @js.native
  sealed trait logical extends HidCollectionType
  
  /** The controls are related by a named array. */
  @js.native
  sealed trait namedArray extends HidCollectionType
  
  /** The control relationship is not described by a defined category. */
  @js.native
  sealed trait other extends HidCollectionType
  
  /** The controls are related by physical source. */
  @js.native
  sealed trait physical extends HidCollectionType
  
  /** The controls are related by report type. */
  @js.native
  sealed trait report extends HidCollectionType
  
  /** The controls are related by a usage modifier. */
  @js.native
  sealed trait usageModifier extends HidCollectionType
  
  /** The controls are related by a usage switch. */
  @js.native
  sealed trait usageSwitch extends HidCollectionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HidCollectionType with Double] = js.native
  /* 1 */ @js.native
  object application extends TopLevel[application with Double]
  
  /* 2 */ @js.native
  object logical extends TopLevel[logical with Double]
  
  /* 4 */ @js.native
  object namedArray extends TopLevel[namedArray with Double]
  
  /* 7 */ @js.native
  object other extends TopLevel[other with Double]
  
  /* 0 */ @js.native
  object physical extends TopLevel[physical with Double]
  
  /* 3 */ @js.native
  object report extends TopLevel[report with Double]
  
  /* 6 */ @js.native
  object usageModifier extends TopLevel[usageModifier with Double]
  
  /* 5 */ @js.native
  object usageSwitch extends TopLevel[usageSwitch with Double]
  
}

