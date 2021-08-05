package typings.vscodeLanguageclient.clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvideResolveFeature[T1 /* <: js.Function */, T2 /* <: js.Function */] extends StObject {
  
  var provide: T1
  
  var resolve: T2
}
object ProvideResolveFeature {
  
  inline def apply[T1 /* <: js.Function */, T2 /* <: js.Function */](provide: T1, resolve: T2): ProvideResolveFeature[T1, T2] = {
    val __obj = js.Dynamic.literal(provide = provide.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvideResolveFeature[T1, T2]]
  }
  
  extension [Self <: ProvideResolveFeature[?, ?], T1 /* <: js.Function */, T2 /* <: js.Function */](x: Self & (ProvideResolveFeature[T1, T2])) {
    
    inline def setProvide(value: T1): Self = StObject.set(x, "provide", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: T2): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
  }
}
