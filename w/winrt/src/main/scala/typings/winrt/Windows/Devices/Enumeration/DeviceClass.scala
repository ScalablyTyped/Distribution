package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceClass extends js.Object

@JSGlobal("Windows.Devices.Enumeration.DeviceClass")
@js.native
object DeviceClass extends js.Object {
  @js.native
  sealed trait all extends DeviceClass
  
  @js.native
  sealed trait audioCapture extends DeviceClass
  
  @js.native
  sealed trait audioRender extends DeviceClass
  
  @js.native
  sealed trait portableStorageDevice extends DeviceClass
  
  @js.native
  sealed trait videoCapture extends DeviceClass
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceClass with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object audioCapture extends TopLevel[audioCapture with Double]
  
  /* 2 */ @js.native
  object audioRender extends TopLevel[audioRender with Double]
  
  /* 3 */ @js.native
  object portableStorageDevice extends TopLevel[portableStorageDevice with Double]
  
  /* 4 */ @js.native
  object videoCapture extends TopLevel[videoCapture with Double]
  
}

