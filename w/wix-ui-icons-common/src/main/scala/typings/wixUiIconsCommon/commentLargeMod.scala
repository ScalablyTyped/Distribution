package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/CommentLarge", JSImport.Default)
  @js.native
  val default: FC[CommentLargeProps] = js.native
  
  trait CommentLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CommentLargeProps {
    
    inline def apply(): CommentLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentLargeProps]
    }
    
    extension [Self <: CommentLargeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CommentLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentLargeMod.foo` */
  override def _to: FC[CommentLargeProps] = default
}
