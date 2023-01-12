package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsFlagFillXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/FlagFillXSmall", JSImport.Default)
  @js.native
  val default: FC[FlagFillXSmallProps] = js.native
  
  trait FlagFillXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagFillXSmallProps {
    
    inline def apply(): FlagFillXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagFillXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagFillXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagFillXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsFlagFillXSmallMod.foo` */
  override def _to: FC[FlagFillXSmallProps] = default
}
