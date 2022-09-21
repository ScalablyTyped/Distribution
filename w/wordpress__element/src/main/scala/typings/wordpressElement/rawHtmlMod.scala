package typings.wordpressElement

import typings.react.mod.ComponentPropsWithoutRef
import typings.react.mod.global.JSX.Element
import typings.wordpressElement.anon.Children
import typings.wordpressElement.wordpressElementStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawHtmlMod {
  
  @JSImport("@wordpress/element/build-types/raw-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasChildrenProps: RawHTMLProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type RawHTMLProps = Children & ComponentPropsWithoutRef[div]
}
