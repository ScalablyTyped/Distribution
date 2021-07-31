package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object newFolderSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/NewFolderSmall", JSImport.Default)
  @js.native
  val default: SFC[NewFolderSmallProps] = js.native
  
  trait NewFolderSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object NewFolderSmallProps {
    
    @scala.inline
    def apply(): NewFolderSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewFolderSmallProps]
    }
    
    @scala.inline
    implicit class NewFolderSmallPropsMutableBuilder[Self <: NewFolderSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[NewFolderSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `newFolderSmallMod.foo` */
  override def _to: SFC[NewFolderSmallProps] = default
}
