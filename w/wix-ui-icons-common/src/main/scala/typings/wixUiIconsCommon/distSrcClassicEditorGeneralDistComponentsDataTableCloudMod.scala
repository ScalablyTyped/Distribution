package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsDataTableCloudMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/DataTableCloud", JSImport.Default)
  @js.native
  val default: FC[DataTableCloudProps] = js.native
  
  trait DataTableCloudProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataTableCloudProps {
    
    inline def apply(): DataTableCloudProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableCloudProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableCloudProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataTableCloudProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsDataTableCloudMod.foo` */
  override def _to: FC[DataTableCloudProps] = default
}
