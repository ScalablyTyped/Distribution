package typings.webxr.global

import typings.std.DOMPointReadOnly
import typings.webxr.XRPlaneOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRPlane")
@js.native
abstract class XRPlane ()
  extends StObject
     with typings.webxr.XRPlane {
  
  /* CompleteClass */
  var lastChangedTime: Double = js.native
  
  /* CompleteClass */
  var orientation: XRPlaneOrientation = js.native
  
  /* CompleteClass */
  var planeSpace: typings.webxr.XRSpace = js.native
  
  /* CompleteClass */
  var polygon: js.Array[DOMPointReadOnly] = js.native
}
