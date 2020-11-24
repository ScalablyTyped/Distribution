package typings.webxr.mod

import typings.std.Gamepad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRInputSource extends js.Object {
  
  val gamepad: js.UndefOr[Gamepad] = js.native
  
  val gripSpace: js.UndefOr[XRSpace] = js.native
  
  val hand: js.UndefOr[XRHand] = js.native
  
  val handedness: XRHandedness = js.native
  
  val profiles: js.Array[String] = js.native
  
  val targetRayMode: XRTargetRayMode = js.native
  
  val targetRaySpace: XRSpace = js.native
}
object XRInputSource {
  
  @scala.inline
  def apply(
    handedness: XRHandedness,
    profiles: js.Array[String],
    targetRayMode: XRTargetRayMode,
    targetRaySpace: XRSpace
  ): XRInputSource = {
    val __obj = js.Dynamic.literal(handedness = handedness.asInstanceOf[js.Any], profiles = profiles.asInstanceOf[js.Any], targetRayMode = targetRayMode.asInstanceOf[js.Any], targetRaySpace = targetRaySpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRInputSource]
  }
  
  @scala.inline
  implicit class XRInputSourceOps[Self <: XRInputSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHandedness(value: XRHandedness): Self = this.set("handedness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfilesVarargs(value: String*): Self = this.set("profiles", js.Array(value :_*))
    
    @scala.inline
    def setProfiles(value: js.Array[String]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRayMode(value: XRTargetRayMode): Self = this.set("targetRayMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRaySpace(value: XRSpace): Self = this.set("targetRaySpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamepad(value: Gamepad): Self = this.set("gamepad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGamepad: Self = this.set("gamepad", js.undefined)
    
    @scala.inline
    def setGripSpace(value: XRSpace): Self = this.set("gripSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGripSpace: Self = this.set("gripSpace", js.undefined)
    
    @scala.inline
    def setHand(value: XRHand): Self = this.set("hand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHand: Self = this.set("hand", js.undefined)
  }
}
