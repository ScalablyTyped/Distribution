package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsStripMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Strip", JSImport.Default)
  @js.native
  val default: FC[StripProps] = js.native
  
  trait StripProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StripProps {
    
    inline def apply(): StripProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StripProps]
    }
    
    extension [Self <: StripProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StripProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsStripMod.foo` */
  override def _to: FC[StripProps] = default
}
