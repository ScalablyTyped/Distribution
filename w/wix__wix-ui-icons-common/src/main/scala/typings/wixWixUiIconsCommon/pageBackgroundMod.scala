package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageBackgroundMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/PageBackground", JSImport.Default)
  @js.native
  val default: FC[PageBackgroundProps] = js.native
  
  trait PageBackgroundProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PageBackgroundProps {
    
    inline def apply(): PageBackgroundProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageBackgroundProps]
    }
    
    extension [Self <: PageBackgroundProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PageBackgroundProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageBackgroundMod.foo` */
  override def _to: FC[PageBackgroundProps] = default
}
