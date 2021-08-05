package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteDuplicateSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteDuplicateSmall", JSImport.Default)
  @js.native
  val default: SFC[SiteDuplicateSmallProps] = js.native
  
  trait SiteDuplicateSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SiteDuplicateSmallProps {
    
    inline def apply(): SiteDuplicateSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteDuplicateSmallProps]
    }
    
    extension [Self <: SiteDuplicateSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SiteDuplicateSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteDuplicateSmallMod.foo` */
  override def _to: SFC[SiteDuplicateSmallProps] = default
}
