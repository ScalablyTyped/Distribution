package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenerySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ScenerySmall", JSImport.Default)
  @js.native
  val default: FC[ScenerySmallProps] = js.native
  
  trait ScenerySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ScenerySmallProps {
    
    inline def apply(): ScenerySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScenerySmallProps]
    }
    
    extension [Self <: ScenerySmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ScenerySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `scenerySmallMod.foo` */
  override def _to: FC[ScenerySmallProps] = default
}
