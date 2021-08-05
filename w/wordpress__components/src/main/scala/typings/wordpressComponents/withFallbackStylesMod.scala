package typings.wordpressComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.std.HTMLDivElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFallbackStylesMod {
  
  @JSImport("@wordpress/components/higher-order/with-fallback-styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[js.Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof FSP */ String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mapNodeToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* wrappedComponent */ ComponentType[js.Any], 
    ComponentType[Omit[js.Any, /* keyof FSP */ String]]
  ]]
}
