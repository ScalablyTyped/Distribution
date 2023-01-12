package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsDataTableLinkedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/DataTableLinked", JSImport.Default)
  @js.native
  val default: FC[DataTableLinkedProps] = js.native
  
  trait DataTableLinkedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataTableLinkedProps {
    
    inline def apply(): DataTableLinkedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataTableLinkedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTableLinkedProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataTableLinkedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsDataTableLinkedMod.foo` */
  override def _to: FC[DataTableLinkedProps] = default
}
