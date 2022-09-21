package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsStretchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Stretch", JSImport.Default)
  @js.native
  val default: FC[StretchProps] = js.native
  
  trait StretchProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StretchProps {
    
    inline def apply(): StretchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StretchProps]
    }
    
    extension [Self <: StretchProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StretchProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsStretchMod.foo` */
  override def _to: FC[StretchProps] = default
}
