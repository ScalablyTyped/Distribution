package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ComposeSmall", JSImport.Default)
  @js.native
  val default: SFC[ComposeSmallProps] = js.native
  
  trait ComposeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ComposeSmallProps {
    
    @scala.inline
    def apply(): ComposeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeSmallProps]
    }
    
    @scala.inline
    implicit class ComposeSmallPropsMutableBuilder[Self <: ComposeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ComposeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `composeSmallMod.foo` */
  override def _to: SFC[ComposeSmallProps] = default
}
