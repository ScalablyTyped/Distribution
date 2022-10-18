package typings.wordpressComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithFallbackStylesMod {
  
  @JSImport("@wordpress/components/higher-order/with-fallback-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer V> ? react.react.ComponentType<std.Omit<V, keyof FSP>> : never */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapNodeToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrappedComponent */ ComponentType[Any], 
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentType<any> extends react.react.ComponentType<infer V> ? react.react.ComponentType<std.Omit<V, keyof FSP>> : never */ js.Any
  ]]
}
