package typings.wordpressElement

import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.global.JSX.Element
import typings.wordpressElement.anon.Children
import typings.wordpressElement.wordpressElementStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesRawHtmlMod {
  
  @JSImport("@wordpress/element/build-types/raw-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(param0: RawHTMLProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type RawHTMLProps = Children & ComponentPropsWithoutRef[div]
}
