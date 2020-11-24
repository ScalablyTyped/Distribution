package typings.webvrApi

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRPose extends js.Object {
  
  val angularAcceleration: Float32Array | Null = js.native
  
  val angularVelocity: Float32Array | Null = js.native
  
  val linearAcceleration: Float32Array | Null = js.native
  
  val linearVelocity: Float32Array | Null = js.native
  
  val orientation: Float32Array | Null = js.native
  
  val position: Float32Array | Null = js.native
  
  val timestamp: Double = js.native
}
object VRPose {
  
  @scala.inline
  def apply(timestamp: Double): VRPose = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRPose]
  }
  
  @scala.inline
  implicit class VRPoseOps[Self <: VRPose] (val x: Self) extends AnyVal {
    
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
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAcceleration(value: Float32Array): Self = this.set("angularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAccelerationNull: Self = this.set("angularAcceleration", null)
    
    @scala.inline
    def setAngularVelocity(value: Float32Array): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityNull: Self = this.set("angularVelocity", null)
    
    @scala.inline
    def setLinearAcceleration(value: Float32Array): Self = this.set("linearAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearAccelerationNull: Self = this.set("linearAcceleration", null)
    
    @scala.inline
    def setLinearVelocity(value: Float32Array): Self = this.set("linearVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearVelocityNull: Self = this.set("linearVelocity", null)
    
    @scala.inline
    def setOrientation(value: Float32Array): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = this.set("orientation", null)
    
    @scala.inline
    def setPosition(value: Float32Array): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
}
