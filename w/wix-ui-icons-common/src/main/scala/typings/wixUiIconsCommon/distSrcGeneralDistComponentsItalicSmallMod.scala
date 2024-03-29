package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsItalicSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ItalicSmall", JSImport.Default)
  @js.native
  val default: FC[ItalicSmallProps] = js.native
  
  trait ItalicSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ItalicSmallProps {
    
    inline def apply(): ItalicSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItalicSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItalicSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ItalicSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsItalicSmallMod.foo` */
  override def _to: FC[ItalicSmallProps] = default
}
