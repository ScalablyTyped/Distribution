package typings.wordpressComponents

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithFiltersMod {
  
  @JSImport("@wordpress/components/higher-order/with-filters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // prettier-ignore
  inline def default(hookName: String): js.Function1[
    /* wrapped */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrapped */ Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: any extends react.react.ComponentType<infer U> ? react.react.ComponentType<U> : never */ js.Any
  ]]
  
  inline def default_P[P](hookName: String): js.Function1[/* wrapped */ ComponentType[Any], ComponentType[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* wrapped */ ComponentType[Any], ComponentType[P]]]
}
