package typings.webxr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type XRAnchorSet = typings.std.Set[typings.webxr.mod.XRAnchor]
  
  type XREventHandler = typings.std.EventHandlerNonNull
  
  type XRFrameRequestCallback = js.Function2[
    /* time */ typings.std.DOMHighResTimeStamp, 
    /* frame */ typings.webxr.mod.XRFrame, 
    scala.Unit
  ]
  
  type XRInputSourceArray = js.Array[typings.webxr.mod.XRInputSource]
  
  type XRJointSpace = typings.webxr.mod.XRSpace
  
  type XRLayer = typings.std.EventTarget
  
  type XRPlaneSet = typings.std.Set[typings.webxr.mod.XRPlane]
  
  type XRSpace = typings.std.EventTarget
}
