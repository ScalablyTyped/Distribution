package typings.typescriptEventHandler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funcMod {
  
  type Action[TInput] = Func[TInput, Unit]
  
  type AsyncAction[TInput] = AsyncFunc[TInput, Unit]
  
  type AsyncFunc[TInput, TOutput] = js.Function1[/* value */ TInput, js.Promise[TOutput]]
  
  type AsyncPredicate[TInput] = AsyncFunc[TInput, Boolean]
  
  type Func[TInput, TOutput] = js.Function1[/* value */ TInput, TOutput]
  
  type Predicate[TInput] = Func[TInput, Boolean]
}
