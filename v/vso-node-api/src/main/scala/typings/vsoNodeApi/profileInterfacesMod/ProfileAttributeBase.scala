package typings.vsoNodeApi.profileInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileAttributeBase[T] extends js.Object {
  
  var descriptor: AttributeDescriptor = js.native
  
  var revision: Double = js.native
  
  var timeStamp: Date = js.native
  
  var value: T = js.native
}
object ProfileAttributeBase {
  
  @scala.inline
  def apply[T](descriptor: AttributeDescriptor, revision: Double, timeStamp: Date, value: T): ProfileAttributeBase[T] = {
    val __obj = js.Dynamic.literal(descriptor = descriptor.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAttributeBase[T]]
  }
  
  @scala.inline
  implicit class ProfileAttributeBaseOps[Self <: ProfileAttributeBase[_], T] (val x: Self with ProfileAttributeBase[T]) extends AnyVal {
    
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
    def setDescriptor(value: AttributeDescriptor): Self = this.set("descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Date): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
