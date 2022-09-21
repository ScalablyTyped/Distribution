package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/CommentFillSmall", JSImport.Default)
  @js.native
  val default: FC[CommentFillSmallProps] = js.native
  
  trait CommentFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CommentFillSmallProps {
    
    inline def apply(): CommentFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentFillSmallProps]
    }
    
    extension [Self <: CommentFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CommentFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentFillSmallMod.foo` */
  override def _to: FC[CommentFillSmallProps] = default
}
