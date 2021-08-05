package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SearchSmall", JSImport.Default)
  @js.native
  val default: SFC[SearchSmallProps] = js.native
  
  trait SearchSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SearchSmallProps {
    
    inline def apply(): SearchSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSmallProps]
    }
    
    extension [Self <: SearchSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SearchSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchSmallMod.foo` */
  override def _to: SFC[SearchSmallProps] = default
}
