package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsSectionLayoutMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/SectionLayout", JSImport.Default)
  @js.native
  val default: FC[SectionLayoutProps] = js.native
  
  trait SectionLayoutProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SectionLayoutProps {
    
    inline def apply(): SectionLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SectionLayoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SectionLayoutProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SectionLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsSectionLayoutMod.foo` */
  override def _to: FC[SectionLayoutProps] = default
}
