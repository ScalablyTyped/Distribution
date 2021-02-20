package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FolderSmall", JSImport.Default)
  @js.native
  val default: SFC[FolderSmallProps] = js.native
  
  @js.native
  trait FolderSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FolderSmallProps {
    
    @scala.inline
    def apply(): FolderSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderSmallProps]
    }
    
    @scala.inline
    implicit class FolderSmallPropsMutableBuilder[Self <: FolderSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FolderSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderSmallMod.foo` */
  override def _to: SFC[FolderSmallProps] = default
}
