package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvideResolveFeature[T1 /* <: js.Function */, T2 /* <: js.Function */] extends StObject {
  
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
  implicit class ProvideResolveFeatureMutableBuilder[Self <: ProvideResolveFeature[_, _], T1 /* <: js.Function */, T2 /* <: js.Function */] (val x: Self with (ProvideResolveFeature[T1, T2])) extends AnyVal {
    
    @scala.inline
    def setProvide(value: T1): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolve(value: T2): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
  }
}
