package typings.wordpressComponents.mod

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.baseControlMod.BaseControl.Props
import typings.wordpressComponents.baseControlMod.BaseControl.VisualLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseControl {
  
  inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "BaseControl")
  @js.native
  val ^ : js.Any = js.native
  
  inline def VisualLabel(props: VisualLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VisualLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
