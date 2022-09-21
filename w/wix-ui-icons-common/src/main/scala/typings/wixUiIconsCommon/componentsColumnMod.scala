package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsColumnMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Column", JSImport.Default)
  @js.native
  val default: FC[ColumnProps] = js.native
  
  trait ColumnProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ColumnProps {
    
    inline def apply(): ColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps]
    }
    
    extension [Self <: ColumnProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ColumnProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsColumnMod.foo` */
  override def _to: FC[ColumnProps] = default
}
