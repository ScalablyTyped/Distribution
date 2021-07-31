package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceClass extends StObject
@JSGlobal("Windows.Devices.Enumeration.DeviceClass")
@js.native
object DeviceClass extends StObject {
  
  @js.native
  sealed trait all
    extends StObject
       with DeviceClass
  
  @js.native
  sealed trait audioCapture
    extends StObject
       with DeviceClass
  
  @js.native
  sealed trait audioRender
    extends StObject
       with DeviceClass
  
  @js.native
  sealed trait portableStorageDevice
    extends StObject
       with DeviceClass
  
  @js.native
  sealed trait videoCapture
    extends StObject
       with DeviceClass
}
