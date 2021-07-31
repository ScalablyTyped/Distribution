package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SimpleOrientation extends StObject
@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends StObject {
  
  @js.native
  sealed trait facedown
    extends StObject
       with SimpleOrientation
  
  @js.native
  sealed trait faceup
    extends StObject
       with SimpleOrientation
  
  @js.native
  sealed trait notRotated
    extends StObject
       with SimpleOrientation
  
  @js.native
  sealed trait rotated180DegreesCounterclockwise
    extends StObject
       with SimpleOrientation
  
  @js.native
  sealed trait rotated270DegreesCounterclockwise
    extends StObject
       with SimpleOrientation
  
  @js.native
  sealed trait rotated90DegreesCounterclockwise
    extends StObject
       with SimpleOrientation
}
