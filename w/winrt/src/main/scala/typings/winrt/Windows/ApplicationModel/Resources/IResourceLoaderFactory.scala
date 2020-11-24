package typings.winrt.Windows.ApplicationModel.Resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResourceLoaderFactory extends js.Object {
  
  def createResourceLoaderByName(name: String): ResourceLoader = js.native
}
object IResourceLoaderFactory {
  
  @scala.inline
  def apply(createResourceLoaderByName: String => ResourceLoader): IResourceLoaderFactory = {
    val __obj = js.Dynamic.literal(createResourceLoaderByName = js.Any.fromFunction1(createResourceLoaderByName))
    __obj.asInstanceOf[IResourceLoaderFactory]
  }
  
  @scala.inline
  implicit class IResourceLoaderFactoryOps[Self <: IResourceLoaderFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateResourceLoaderByName(value: String => ResourceLoader): Self = this.set("createResourceLoaderByName", js.Any.fromFunction1(value))
  }
}
