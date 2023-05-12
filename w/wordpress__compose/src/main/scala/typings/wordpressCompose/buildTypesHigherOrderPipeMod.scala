package typings.wordpressCompose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHigherOrderPipeMod {
  
  @JSImport("@wordpress/compose/build-types/higher-order/pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Composes multiple higher-order components into a single higher-order component. Performs left-to-right function
    * composition, where each successive invocation is supplied the return value of the previous.
    *
    * This is inspired by `lodash`'s `flow` function.
    *
    * @see https://docs-lodash.com/v4/flow/
    */
  inline def default(funcs: js.Function*): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def basePipe(): js.Function1[/* repeated */ js.Function, js.Function1[/* repeated */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("basePipe")().asInstanceOf[js.Function1[/* repeated */ js.Function, js.Function1[/* repeated */ Any, Any]]]
  inline def basePipe(reverse: Boolean): js.Function1[/* repeated */ js.Function, js.Function1[/* repeated */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("basePipe")(reverse.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Function, js.Function1[/* repeated */ Any, Any]]]
}
