package typings.wordpressCustomizeBrowser.containerMod

import typings.jquery.JQuery.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerDeferred extends js.Object {
  
  var embedded: Deferred[_, _, _] = js.native
}
object ContainerDeferred {
  
  @scala.inline
  def apply(embedded: Deferred[_, _, _]): ContainerDeferred = {
    val __obj = js.Dynamic.literal(embedded = embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerDeferred]
  }
  
  @scala.inline
  implicit class ContainerDeferredOps[Self <: ContainerDeferred] (val x: Self) extends AnyVal {
    
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
    def setEmbedded(value: Deferred[_, _, _]): Self = this.set("embedded", value.asInstanceOf[js.Any])
  }
}
