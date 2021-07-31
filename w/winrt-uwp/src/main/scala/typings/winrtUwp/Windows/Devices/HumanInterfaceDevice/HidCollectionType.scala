package typings.winrtUwp.Windows.Devices.HumanInterfaceDevice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HidCollectionType extends StObject
/** Identifies the relationship that defines a grouping of controls on the device. */
@JSGlobal("Windows.Devices.HumanInterfaceDevice.HidCollectionType")
@js.native
object HidCollectionType extends StObject {
  
  /** The controls are related by intended application. */
  @js.native
  sealed trait application
    extends StObject
       with HidCollectionType
  
  /** The controls are logically related. */
  @js.native
  sealed trait logical
    extends StObject
       with HidCollectionType
  
  /** The controls are related by a named array. */
  @js.native
  sealed trait namedArray
    extends StObject
       with HidCollectionType
  
  /** The control relationship is not described by a defined category. */
  @js.native
  sealed trait other
    extends StObject
       with HidCollectionType
  
  /** The controls are related by physical source. */
  @js.native
  sealed trait physical
    extends StObject
       with HidCollectionType
  
  /** The controls are related by report type. */
  @js.native
  sealed trait report
    extends StObject
       with HidCollectionType
  
  /** The controls are related by a usage modifier. */
  @js.native
  sealed trait usageModifier
    extends StObject
       with HidCollectionType
  
  /** The controls are related by a usage switch. */
  @js.native
  sealed trait usageSwitch
    extends StObject
       with HidCollectionType
}
