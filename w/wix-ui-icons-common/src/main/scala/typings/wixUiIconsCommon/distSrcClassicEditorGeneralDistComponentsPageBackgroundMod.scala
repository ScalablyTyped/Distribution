package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsPageBackgroundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/PageBackground", JSImport.Default)
  @js.native
  val default: FC[PageBackgroundProps] = js.native
  
  trait PageBackgroundProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PageBackgroundProps {
    
    inline def apply(): PageBackgroundProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageBackgroundProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageBackgroundProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PageBackgroundProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsPageBackgroundMod.foo` */
  override def _to: FC[PageBackgroundProps] = default
}
