package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object folderFindSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FolderFindSmall", JSImport.Default)
  @js.native
  val default: SFC[FolderFindSmallProps] = js.native
  
  @js.native
  trait FolderFindSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FolderFindSmallProps {
    
    @scala.inline
    def apply(): FolderFindSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FolderFindSmallProps]
    }
    
    @scala.inline
    implicit class FolderFindSmallPropsMutableBuilder[Self <: FolderFindSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FolderFindSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `folderFindSmallMod.foo` */
  override def _to: SFC[FolderFindSmallProps] = default
}
