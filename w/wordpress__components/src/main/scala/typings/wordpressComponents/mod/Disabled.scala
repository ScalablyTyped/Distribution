package typings.wordpressComponents.mod

import typings.react.mod.Consumer
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.disabledMod.Disabled.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disabled {
  
  inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/components", "Disabled.Consumer")
  @js.native
  def Consumer: typings.react.mod.Consumer[Boolean] = js.native
  inline def Consumer_=(x: Consumer[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
}
