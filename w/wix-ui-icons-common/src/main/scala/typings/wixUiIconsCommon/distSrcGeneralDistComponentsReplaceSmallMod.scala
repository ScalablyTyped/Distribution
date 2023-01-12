package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsReplaceSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ReplaceSmall", JSImport.Default)
  @js.native
  val default: FC[ReplaceSmallProps] = js.native
  
  trait ReplaceSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ReplaceSmallProps {
    
    inline def apply(): ReplaceSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ReplaceSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsReplaceSmallMod.foo` */
  override def _to: FC[ReplaceSmallProps] = default
}
