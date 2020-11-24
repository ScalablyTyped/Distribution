package typings.wordpressComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.std.HTMLDivElement
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components/higher-order/with-fallback-styles", JSImport.Namespace)
@js.native
object withFallbackStylesMod extends js.Object {
  
  def default[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[js.Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ComponentType[_], 
    ComponentType[Omit[_, /* keyof FSP */ String]]
  ] = js.native
}
