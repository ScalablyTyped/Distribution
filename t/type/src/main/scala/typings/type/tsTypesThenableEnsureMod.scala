package typings.`type`

import typings.`type`.tsTypesEnsureMod.EnsureBaseOptions
import typings.`type`.tsTypesEnsureMod.EnsureDefault
import typings.`type`.tsTypesEnsureMod.EnsureFunction
import typings.`type`.tsTypesEnsureMod.EnsureIsOptional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsTypesThenableEnsureMod {
  
  @JSImport("type/ts-types/thenable/ensure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: Any): js.Promise[T] | ThenableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T] | ThenableObject]
  inline def default[T](
    value: Any,
    options: (EnsureBaseOptions & EnsureIsOptional & (EnsureDefault[js.Promise[T] | ThenableObject])) | EnsureBaseOptions
  ): js.Promise[T] | ThenableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T] | ThenableObject]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait ThenableObject extends StObject {
    
    def `then`(args: Any*): Any
    @JSName("then")
    var then_Original: EnsureFunction
  }
  object ThenableObject {
    
    inline def apply(`then`: EnsureFunction): ThenableObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThenableObject]
    }
    
    extension [Self <: ThenableObject](x: Self) {
      
      inline def setThen(value: EnsureFunction): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    }
  }
}
