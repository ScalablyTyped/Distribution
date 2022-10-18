package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCommentAddSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/CommentAddSmall", JSImport.Default)
  @js.native
  val default: FC[CommentAddSmallProps] = js.native
  
  trait CommentAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CommentAddSmallProps {
    
    inline def apply(): CommentAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentAddSmallProps]
    }
    
    extension [Self <: CommentAddSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CommentAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCommentAddSmallMod.foo` */
  override def _to: FC[CommentAddSmallProps] = default
}
