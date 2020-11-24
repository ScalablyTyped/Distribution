package typings.three.webXRControllerMod

import typings.three.anon.Type
import typings.three.groupMod.Group
import typings.three.webXRMod.XRFrame
import typings.three.webXRMod.XRInputSource
import typings.three.webXRMod.XRReferenceSpace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXRController", "WebXRController")
@js.native
class WebXRController () extends js.Object {
  
  def disconnect(inputSource: XRInputSource): this.type = js.native
  
  def dispatchEvent(event: Type): this.type = js.native
  
  def getGripSpace(): Group = js.native
  
  def getTargetRaySpace(): Group = js.native
  
  def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
}
