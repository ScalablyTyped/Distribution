package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideResolveFeature[T1 /* <: js.Function */, T2 /* <: js.Function */] extends js.Object {
  
  var provide: T1 = js.native
  
  var resolve: T2 = js.native
}
object ProvideResolveFeature {
  
  @scala.inline
  def apply[T1 /* <: js.Function */, T2 /* <: js.Function */](provide: T1, resolve: T2): ProvideResolveFeature[T1, T2] = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideResolveFeature[T1, T2]]
  }
  
  @scala.inline
  implicit class ProvideResolveFeatureOps[Self <: ProvideResolveFeature[_, _], T1 /* <: js.Function */, T2 /* <: js.Function */] (val x: Self with (ProvideResolveFeature[T1, T2])) extends AnyVal {
    
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
    def setProvide(value: T1): Self = this.set("provide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: T2): Self = this.set("resolve", value.asInstanceOf[js.Any])
  }
}
