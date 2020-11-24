package typings.typeorm.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerInterface extends js.Object {
  
  def get[T](someClass: ContainedType[T]): T = js.native
}
object ContainerInterface {
  
  @scala.inline
  def apply(get: ContainedType[js.Any] => js.Any): ContainerInterface = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ContainerInterface]
  }
  
  @scala.inline
  implicit class ContainerInterfaceOps[Self <: ContainerInterface] (val x: Self) extends AnyVal {
    
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
    def setGet(value: ContainedType[js.Any] => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
  }
}
