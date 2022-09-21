package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsColumnBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/ColumnBold", JSImport.Default)
  @js.native
  val default: FC[ColumnBoldProps] = js.native
  
  trait ColumnBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ColumnBoldProps {
    
    inline def apply(): ColumnBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnBoldProps]
    }
    
    extension [Self <: ColumnBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ColumnBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsColumnBoldMod.foo` */
  override def _to: FC[ColumnBoldProps] = default
}
