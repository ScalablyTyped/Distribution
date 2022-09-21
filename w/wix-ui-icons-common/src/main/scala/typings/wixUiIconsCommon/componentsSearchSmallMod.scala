package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSearchSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/SearchSmall", JSImport.Default)
  @js.native
  val default: FC[SearchSmallProps] = js.native
  
  trait SearchSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SearchSmallProps {
    
    inline def apply(): SearchSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSmallProps]
    }
    
    extension [Self <: SearchSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SearchSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsSearchSmallMod.foo` */
  override def _to: FC[SearchSmallProps] = default
}
