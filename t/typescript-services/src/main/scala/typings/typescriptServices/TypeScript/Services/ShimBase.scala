package typings.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShimBase extends IShim {
  
  var factory: js.Any = js.native
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
