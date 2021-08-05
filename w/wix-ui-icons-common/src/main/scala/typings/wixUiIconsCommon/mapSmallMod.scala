package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MapSmall", JSImport.Default)
  @js.native
  val default: SFC[MapSmallProps] = js.native
  
  trait MapSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object MapSmallProps {
    
    inline def apply(): MapSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapSmallProps]
    }
    
    extension [Self <: MapSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MapSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `mapSmallMod.foo` */
  override def _to: SFC[MapSmallProps] = default
}
