package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsCustomBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/CustomBold", JSImport.Default)
  @js.native
  val default: FC[CustomBoldProps] = js.native
  
  trait CustomBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CustomBoldProps {
    
    inline def apply(): CustomBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomBoldProps]
    }
    
    extension [Self <: CustomBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CustomBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsCustomBoldMod.foo` */
  override def _to: FC[CustomBoldProps] = default
}
