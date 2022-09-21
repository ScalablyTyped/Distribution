package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbsUpFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ThumbsUpFilledSmall", JSImport.Default)
  @js.native
  val default: FC[ThumbsUpFilledSmallProps] = js.native
  
  trait ThumbsUpFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbsUpFilledSmallProps {
    
    inline def apply(): ThumbsUpFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpFilledSmallProps]
    }
    
    extension [Self <: ThumbsUpFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThumbsUpFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `thumbsUpFilledSmallMod.foo` */
  override def _to: FC[ThumbsUpFilledSmallProps] = default
}
