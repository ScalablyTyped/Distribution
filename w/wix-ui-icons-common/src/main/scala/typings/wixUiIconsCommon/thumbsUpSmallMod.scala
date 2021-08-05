package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbsUpSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ThumbsUpSmall", JSImport.Default)
  @js.native
  val default: SFC[ThumbsUpSmallProps] = js.native
  
  trait ThumbsUpSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ThumbsUpSmallProps {
    
    inline def apply(): ThumbsUpSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpSmallProps]
    }
    
    extension [Self <: ThumbsUpSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ThumbsUpSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `thumbsUpSmallMod.foo` */
  override def _to: SFC[ThumbsUpSmallProps] = default
}
