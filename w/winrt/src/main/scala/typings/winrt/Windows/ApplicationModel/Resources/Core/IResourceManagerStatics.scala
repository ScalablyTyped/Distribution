package typings.winrt.Windows.ApplicationModel.Resources.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceManagerStatics extends js.Object {
  
  var current: ResourceManager = js.native
  
  def isResourceReference(resourceReference: String): Boolean = js.native
}
object IResourceManagerStatics {
  
  @scala.inline
  def apply(current: ResourceManager, isResourceReference: String => Boolean): IResourceManagerStatics = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], isResourceReference = js.Any.fromFunction1(isResourceReference))
    __obj.asInstanceOf[IResourceManagerStatics]
  }
  
  @scala.inline
  implicit class IResourceManagerStaticsOps[Self <: IResourceManagerStatics] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: ResourceManager): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsResourceReference(value: String => Boolean): Self = this.set("isResourceReference", js.Any.fromFunction1(value))
  }
}
