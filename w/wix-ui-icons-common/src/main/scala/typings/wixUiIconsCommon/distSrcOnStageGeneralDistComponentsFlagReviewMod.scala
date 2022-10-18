package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageGeneralDistComponentsFlagReviewMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/FlagReview", JSImport.Default)
  @js.native
  val default: FC[FlagReviewProps] = js.native
  
  trait FlagReviewProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagReviewProps {
    
    inline def apply(): FlagReviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagReviewProps]
    }
    
    extension [Self <: FlagReviewProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagReviewProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageGeneralDistComponentsFlagReviewMod.foo` */
  override def _to: FC[FlagReviewProps] = default
}
