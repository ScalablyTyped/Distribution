package typings.wordpressComponents.mod

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.selectControlMod.SelectControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectControl {
  
  @scala.inline
  def apply[T /* <: String | js.Array[String] */](// tslint:disable-next-line:no-unnecessary-generics
  props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "SelectControl")
  @js.native
  val ^ : js.Any = js.native
}
