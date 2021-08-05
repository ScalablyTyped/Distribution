package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties that are applicable to all types of frame sources. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties")
@js.native
abstract class KnownPerceptionFrameSourceProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionFrameSourceProperties
object KnownPerceptionFrameSourceProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties.deviceId")
  @js.native
  def deviceId: js.Any = js.native
  inline def deviceId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(x.asInstanceOf[js.Any])
  
  /* unmapped type */
  /** Gets a string key used to look up a string property with the device, model, version string for the physical sensor device this frame source represents. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties.deviceModelVersion")
  @js.native
  def deviceModelVersion: String = js.native
  inline def deviceModelVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceModelVersion")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to look up an enumeration property indicating the physical location of the sensor on the Windows device. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties.enclosureLocation")
  @js.native
  def enclosureLocation: String = js.native
  inline def enclosureLocation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enclosureLocation")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to look up a string property that is a string key indicating the kind of frame the source provides. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties.frameKind")
  @js.native
  def frameKind: String = js.native
  inline def frameKind_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameKind")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to look up a string property with the unique ID of the frame source. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties.id")
  @js.native
  def id: String = js.native
  inline def id_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to look up a string array property containing the physical device IDs of the sensor this frame source represents. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionFrameSourceProperties.physicalDeviceIds")
  @js.native
  def physicalDeviceIds: String = js.native
  inline def physicalDeviceIds_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("physicalDeviceIds")(x.asInstanceOf[js.Any])
}
