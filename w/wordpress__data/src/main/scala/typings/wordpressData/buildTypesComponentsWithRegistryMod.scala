package typings.wordpressData

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesComponentsWithRegistryMod {
  
  @JSImport("@wordpress/data/build-types/components/with-registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Higher-order component which renders the original component with the current
    * registry context passed as its `registry` prop.
    *
    * @param {WPComponent} OriginalComponent Original component.
    *
    * @return {WPComponent} Enhanced component.
    */
  inline def default(Inner: ComponentType[Any]): js.Function1[/* props */ Any, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Inner.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ Any, Element]]
}
