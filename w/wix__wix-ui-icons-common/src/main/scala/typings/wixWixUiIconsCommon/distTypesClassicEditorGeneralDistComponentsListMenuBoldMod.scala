package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsListMenuBoldMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/ListMenuBold", JSImport.Default)
  @js.native
  val default: FC[ListMenuBoldProps] = js.native
  
  trait ListMenuBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ListMenuBoldProps {
    
    inline def apply(): ListMenuBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListMenuBoldProps]
    }
    
    extension [Self <: ListMenuBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ListMenuBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsListMenuBoldMod.foo` */
  override def _to: FC[ListMenuBoldProps] = default
}
