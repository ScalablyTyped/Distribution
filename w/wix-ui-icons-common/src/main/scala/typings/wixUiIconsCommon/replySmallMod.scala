package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/ReplySmall", JSImport.Default)
  @js.native
  val default: FC[ReplySmallProps] = js.native
  
  trait ReplySmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ReplySmallProps {
    
    inline def apply(): ReplySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplySmallProps]
    }
    
    extension [Self <: ReplySmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ReplySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `replySmallMod.foo` */
  override def _to: FC[ReplySmallProps] = default
}
