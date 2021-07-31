package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Folder", JSImport.Default)
  @js.native
  val default: SFC[FolderProps] = js.native
  
  trait FolderProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object FolderProps {
    
    @scala.inline
    def apply(): FolderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderProps]
    }
    
    @scala.inline
    implicit class FolderPropsMutableBuilder[Self <: FolderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FolderProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderMod.foo` */
  override def _to: SFC[FolderProps] = default
}
