package typings.uiBox

import typings.react.mod.ElementType
import typings.react.mod.global.JSX.Element
import typings.uiBox.boxTypesMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod {
  
  @JSImport("ui-box/dist/src/box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[E /* <: ElementType[js.Any] */](props: BoxProps[E]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
