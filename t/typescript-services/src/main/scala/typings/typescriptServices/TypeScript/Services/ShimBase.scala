package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShimBase
  extends StObject
     with IShim {
  
  var factory: js.Any
}
object ShimBase {
  
  @scala.inline
  def apply(dispose: js.Any => Unit, factory: js.Any): ShimBase = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose), factory = factory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShimBase]
  }
  
  @scala.inline
  implicit class ShimBaseMutableBuilder[Self <: ShimBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactory(value: js.Any): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
  }
}
