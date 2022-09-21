package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDataTableBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/DataTableBold", JSImport.Default)
  @js.native
  val default: FC[DataTableBoldProps] = js.native
  
  trait DataTableBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataTableBoldProps {
    
    inline def apply(): DataTableBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableBoldProps]
    }
    
    extension [Self <: DataTableBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataTableBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsDataTableBoldMod.foo` */
  override def _to: FC[DataTableBoldProps] = default
}
