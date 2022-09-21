package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoBoldSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/VideoBoldSmall", JSImport.Default)
  @js.native
  val default: FC[VideoBoldSmallProps] = js.native
  
  trait VideoBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VideoBoldSmallProps {
    
    inline def apply(): VideoBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoBoldSmallProps]
    }
    
    extension [Self <: VideoBoldSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VideoBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `videoBoldSmallMod.foo` */
  override def _to: FC[VideoBoldSmallProps] = default
}
