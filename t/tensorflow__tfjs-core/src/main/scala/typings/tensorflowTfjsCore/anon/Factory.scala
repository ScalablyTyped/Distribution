package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distBackendsBackendMod.KernelBackend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory extends StObject {
  
  def factory(): KernelBackend | js.Promise[KernelBackend]
  
  var priority: Double
}
object Factory {
  
  inline def apply(factory: () => KernelBackend | js.Promise[KernelBackend], priority: Double): Factory = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Factory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Factory] (val x: Self) extends AnyVal {
    
    inline def setFactory(value: () => KernelBackend | js.Promise[KernelBackend]): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
