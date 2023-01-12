package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFlagFindSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FlagFindSmall", JSImport.Default)
  @js.native
  val default: FC[FlagFindSmallProps] = js.native
  
  trait FlagFindSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagFindSmallProps {
    
    inline def apply(): FlagFindSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagFindSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagFindSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagFindSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFlagFindSmallMod.foo` */
  override def _to: FC[FlagFindSmallProps] = default
}
