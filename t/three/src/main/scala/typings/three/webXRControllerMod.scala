package typings.three

import typings.three.anon.Type
import typings.three.groupMod.Group
import typings.three.webXRMod.XRFrame
import typings.three.webXRMod.XRInputSource
import typings.three.webXRMod.XRReferenceSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRControllerMod {
  
  @JSImport("three/src/renderers/webxr/WebXRController", "WebXRController")
  @js.native
  class WebXRController () extends StObject {
    
    def disconnect(inputSource: XRInputSource): this.type = js.native
    
    def dispatchEvent(event: Type): this.type = js.native
    
    def getGripSpace(): Group = js.native
    
    def getTargetRaySpace(): Group = js.native
    
    def update(inputSource: XRInputSource, frame: XRFrame, referenceSpace: XRReferenceSpace): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.three.threeStrings.disconnected
    - typings.three.threeStrings.connected
    - typings.three.threeStrings.end
    - typings.three.threeStrings.select
    - typings.three.threeStrings.selectstart
    - typings.three.threeStrings.selectend
    - typings.three.threeStrings.squeeze
    - typings.three.threeStrings.squeezestart
    - typings.three.threeStrings.squeezeend
    - typings.three.threeStrings.inputsourceschange
  */
  trait XRControllerEventType extends StObject
  object XRControllerEventType {
    
    @scala.inline
    def connected: typings.three.threeStrings.connected = "connected".asInstanceOf[typings.three.threeStrings.connected]
    
    @scala.inline
    def disconnected: typings.three.threeStrings.disconnected = "disconnected".asInstanceOf[typings.three.threeStrings.disconnected]
    
    @scala.inline
    def end: typings.three.threeStrings.end = "end".asInstanceOf[typings.three.threeStrings.end]
    
    @scala.inline
    def inputsourceschange: typings.three.threeStrings.inputsourceschange = "inputsourceschange".asInstanceOf[typings.three.threeStrings.inputsourceschange]
    
    @scala.inline
    def select: typings.three.threeStrings.select = "select".asInstanceOf[typings.three.threeStrings.select]
    
    @scala.inline
    def selectend: typings.three.threeStrings.selectend = "selectend".asInstanceOf[typings.three.threeStrings.selectend]
    
    @scala.inline
    def selectstart: typings.three.threeStrings.selectstart = "selectstart".asInstanceOf[typings.three.threeStrings.selectstart]
    
    @scala.inline
    def squeeze: typings.three.threeStrings.squeeze = "squeeze".asInstanceOf[typings.three.threeStrings.squeeze]
    
    @scala.inline
    def squeezeend: typings.three.threeStrings.squeezeend = "squeezeend".asInstanceOf[typings.three.threeStrings.squeezeend]
    
    @scala.inline
    def squeezestart: typings.three.threeStrings.squeezestart = "squeezestart".asInstanceOf[typings.three.threeStrings.squeezestart]
  }
}
