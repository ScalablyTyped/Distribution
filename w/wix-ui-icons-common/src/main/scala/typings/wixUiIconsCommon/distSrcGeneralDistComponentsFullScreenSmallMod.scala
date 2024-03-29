package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFullScreenSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FullScreenSmall", JSImport.Default)
  @js.native
  val default: FC[FullScreenSmallProps] = js.native
  
  trait FullScreenSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FullScreenSmallProps {
    
    inline def apply(): FullScreenSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FullScreenSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FullScreenSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FullScreenSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFullScreenSmallMod.foo` */
  override def _to: FC[FullScreenSmallProps] = default
}
