package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsBlockCommentsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/BlockComments", JSImport.Default)
  @js.native
  val default: FC[BlockCommentsProps] = js.native
  
  trait BlockCommentsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BlockCommentsProps {
    
    inline def apply(): BlockCommentsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockCommentsProps]
    }
    
    extension [Self <: BlockCommentsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BlockCommentsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsBlockCommentsMod.foo` */
  override def _to: FC[BlockCommentsProps] = default
}
