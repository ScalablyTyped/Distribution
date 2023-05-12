package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsFolderAddSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/FolderAddSmall", JSImport.Default)
  @js.native
  val default: FC[FolderAddSmallProps] = js.native
  
  trait FolderAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FolderAddSmallProps {
    
    inline def apply(): FolderAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderAddSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FolderAddSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FolderAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsFolderAddSmallMod.foo` */
  override def _to: FC[FolderAddSmallProps] = default
}
