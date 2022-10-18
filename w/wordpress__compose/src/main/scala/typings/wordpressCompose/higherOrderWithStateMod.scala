package typings.wordpressCompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithStateMod {
  
  @JSImport("@wordpress/compose/higher-order/with-state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default[SP /* <: js.Object */](
    initialState: /* import warning: importer.ImportType#apply Failed type conversion: {[ k in keyof SP ]: SP[k]} */ js.Any
  ): js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentClass<std.Omit<U, keyof SP | 'setState'>, SP> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer U> ? react.react.ComponentClass<std.Omit<U, keyof SP | 'setState'>, SP> : never */ js.Any
  ]]
}
