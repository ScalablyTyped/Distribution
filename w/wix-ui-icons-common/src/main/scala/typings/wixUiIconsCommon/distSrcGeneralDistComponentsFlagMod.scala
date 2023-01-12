package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsFlagMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Flag", JSImport.Default)
  @js.native
  val default: FC[FlagProps] = js.native
  
  trait FlagProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagProps {
    
    inline def apply(): FlagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsFlagMod.foo` */
  override def _to: FC[FlagProps] = default
}
