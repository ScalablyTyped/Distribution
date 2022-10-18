package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsThumbsUpMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ThumbsUp", JSImport.Default)
  @js.native
  val default: FC[ThumbsUpProps] = js.native
  
  trait ThumbsUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbsUpProps {
    
    inline def apply(): ThumbsUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbsUpProps]
    }
    
    extension [Self <: ThumbsUpProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ThumbsUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsThumbsUpMod.foo` */
  override def _to: FC[ThumbsUpProps] = default
}
