package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsComposeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Compose", JSImport.Default)
  @js.native
  val default: FC[ComposeProps] = js.native
  
  trait ComposeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ComposeProps {
    
    inline def apply(): ComposeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComposeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComposeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ComposeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsComposeMod.foo` */
  override def _to: FC[ComposeProps] = default
}
