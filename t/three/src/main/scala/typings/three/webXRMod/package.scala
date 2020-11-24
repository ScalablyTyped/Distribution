package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object webXRMod {
  
  type XRAnchorSet = typings.std.Set[typings.three.webXRMod.XRAnchor]
  
  type XRAnimationLoopCallback = js.Function2[
    /* time */ scala.Double, 
    /* frame */ js.UndefOr[typings.three.webXRMod.XRFrame], 
    scala.Unit
  ]
  
  type XRFrameRequestCallback = js.Function2[/* time */ scala.Double, /* frame */ typings.three.webXRMod.XRFrame, scala.Unit]
  
  type XRJointSpace = typings.three.webXRMod.XRSpace
  
  type XRPlaneSet = typings.std.Set[typings.three.webXRMod.XRPlane]
  
  type XRSpace = typings.std.EventTarget
}
