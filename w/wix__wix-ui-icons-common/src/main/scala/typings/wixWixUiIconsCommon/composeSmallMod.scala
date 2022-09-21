package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ComposeSmall", JSImport.Default)
  @js.native
  val default: FC[ComposeSmallProps] = js.native
  
  trait ComposeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ComposeSmallProps {
    
    inline def apply(): ComposeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeSmallProps]
    }
    
    extension [Self <: ComposeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ComposeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `composeSmallMod.foo` */
  override def _to: FC[ComposeSmallProps] = default
}
