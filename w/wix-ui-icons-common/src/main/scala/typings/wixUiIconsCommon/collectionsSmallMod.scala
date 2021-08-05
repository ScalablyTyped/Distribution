package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/CollectionsSmall", JSImport.Default)
  @js.native
  val default: SFC[CollectionsSmallProps] = js.native
  
  trait CollectionsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CollectionsSmallProps {
    
    inline def apply(): CollectionsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionsSmallProps]
    }
    
    extension [Self <: CollectionsSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CollectionsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `collectionsSmallMod.foo` */
  override def _to: SFC[CollectionsSmallProps] = default
}
