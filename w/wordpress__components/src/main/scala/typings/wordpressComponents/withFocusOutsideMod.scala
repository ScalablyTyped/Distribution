package typings.wordpressComponents

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFocusOutsideMod {
  
  @JSImport("@wordpress/components/higher-order/with-focus-outside", JSImport.Default)
  @js.native
  def default[T /* <: HFOComponent[_, _] */](wrapped: T): ComponentType[_] = js.native
  
  @js.native
  trait HFOComponent[P, S] extends ComponentClass[P, S]
}
