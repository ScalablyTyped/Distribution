package typings.wordpressComponents.mod

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.iconMod.Icon.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  // tslint:disable-next-line:no-unnecessary-generics
  inline def apply[P](props: Props[P]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@wordpress/components", "Icon")
  @js.native
  val ^ : js.Any = js.native
}
