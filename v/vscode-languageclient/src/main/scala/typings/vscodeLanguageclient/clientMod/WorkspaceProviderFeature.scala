package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceProviderFeature[PR] extends StObject {
  
  def getProviders(): js.Array[PR] = js.native
}
object WorkspaceProviderFeature {
  
  @scala.inline
  def apply[PR](getProviders: () => js.Array[PR]): WorkspaceProviderFeature[PR] = {
    val __obj = js.Dynamic.literal(getProviders = js.Any.fromFunction0(getProviders))
    __obj.asInstanceOf[WorkspaceProviderFeature[PR]]
  }
  
  @scala.inline
  implicit class WorkspaceProviderFeatureMutableBuilder[Self <: WorkspaceProviderFeature[_], PR] (val x: Self with WorkspaceProviderFeature[PR]) extends AnyVal {
    
    @scala.inline
    def setGetProviders(value: () => js.Array[PR]): Self = StObject.set(x, "getProviders", js.Any.fromFunction0(value))
  }
}
