package typings.three

import typings.three.groupMod.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webxr/WebXRController", JSImport.Namespace)
@js.native
object webXRControllerMod extends js.Object {
  @js.native
  class WebXRController () extends js.Object {
    def disconnect(inputSource: js.Object): this.type = js.native
    def dispatchEvent(event: js.Object): this.type = js.native
    def getGripSpace(): Group = js.native
    def getTargetRaySpace(): Group = js.native
    def update(inputSource: js.Object, frame: js.Object, referenceSpace: String): this.type = js.native
  }
  
}

