package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsFlagReviewMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/FlagReview", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagReviewProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagReviewProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsFlagReviewMod.foo` */
  override def _to: FC[FlagReviewProps] = default
}
