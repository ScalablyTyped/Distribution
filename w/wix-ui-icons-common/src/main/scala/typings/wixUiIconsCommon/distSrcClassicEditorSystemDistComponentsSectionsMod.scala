package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsSectionsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/Sections", JSImport.Default)
  @js.native
  val default: FC[SectionsProps] = js.native
  
  trait SectionsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SectionsProps {
    
    inline def apply(): SectionsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SectionsProps]
    }
    
    extension [Self <: SectionsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SectionsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsSectionsMod.foo` */
  override def _to: FC[SectionsProps] = default
}
