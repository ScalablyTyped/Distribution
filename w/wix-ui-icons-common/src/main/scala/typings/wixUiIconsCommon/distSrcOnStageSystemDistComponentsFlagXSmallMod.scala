package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcOnStageSystemDistComponentsFlagXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/system/dist/components/FlagXSmall", JSImport.Default)
  @js.native
  val default: FC[FlagXSmallProps] = js.native
  
  trait FlagXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagXSmallProps {
    
    inline def apply(): FlagXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcOnStageSystemDistComponentsFlagXSmallMod.foo` */
  override def _to: FC[FlagXSmallProps] = default
}
