package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceProviderFeature[PR] extends js.Object {
  
  def getProviders(): js.Array[PR] = js.native
}
object WorkspaceProviderFeature {
  
  @scala.inline
  def apply[PR](getProviders: () => js.Array[PR]): WorkspaceProviderFeature[PR] = {
    val __obj = js.Dynamic.literal(getProviders = js.Any.fromFunction0(getProviders))
    __obj.asInstanceOf[WorkspaceProviderFeature[PR]]
  }
  
  @scala.inline
  implicit class WorkspaceProviderFeatureOps[Self <: WorkspaceProviderFeature[_], PR] (val x: Self with WorkspaceProviderFeature[PR]) extends AnyVal {
    
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
    def setGetProviders(value: () => js.Array[PR]): Self = this.set("getProviders", js.Any.fromFunction0(value))
  }
}
