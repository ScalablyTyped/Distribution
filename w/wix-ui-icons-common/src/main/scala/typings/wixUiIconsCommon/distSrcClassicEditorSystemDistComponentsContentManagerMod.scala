package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsContentManagerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/ContentManager", JSImport.Default)
  @js.native
  val default: FC[ContentManagerProps] = js.native
  
  trait ContentManagerProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ContentManagerProps {
    
    inline def apply(): ContentManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentManagerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentManagerProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ContentManagerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsContentManagerMod.foo` */
  override def _to: FC[ContentManagerProps] = default
}
