package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instagramSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/InstagramSmall", JSImport.Default)
  @js.native
  val default: SFC[InstagramSmallProps] = js.native
  
  trait InstagramSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object InstagramSmallProps {
    
    inline def apply(): InstagramSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstagramSmallProps]
    }
    
    extension [Self <: InstagramSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[InstagramSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `instagramSmallMod.foo` */
  override def _to: SFC[InstagramSmallProps] = default
}
