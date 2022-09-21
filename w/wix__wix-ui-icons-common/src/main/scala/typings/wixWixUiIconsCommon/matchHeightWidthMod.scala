package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matchHeightWidthMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/MatchHeight_Width", JSImport.Default)
  @js.native
  val default: FC[MatchHeightWidthProps] = js.native
  
  trait MatchHeightWidthProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MatchHeightWidthProps {
    
    inline def apply(): MatchHeightWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchHeightWidthProps]
    }
    
    extension [Self <: MatchHeightWidthProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MatchHeightWidthProps]
  
  /* This means you don't have to write `default`, but can instead just say `matchHeightWidthMod.foo` */
  override def _to: FC[MatchHeightWidthProps] = default
}
