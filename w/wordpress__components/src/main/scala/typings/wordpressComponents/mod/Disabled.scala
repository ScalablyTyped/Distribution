package typings.wordpressComponents.mod

import typings.react.mod.Consumer
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.disabledMod.Disabled.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Disabled {
  
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  def apply(props: Props): Element = js.native
  @JSImport("@wordpress/components", "Disabled")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/components", "Disabled.Consumer")
  @js.native
  def Consumer: typings.react.mod.Consumer[Boolean] = js.native
  @scala.inline
  def Consumer_=(x: Consumer[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Consumer")(x.asInstanceOf[js.Any])
}
