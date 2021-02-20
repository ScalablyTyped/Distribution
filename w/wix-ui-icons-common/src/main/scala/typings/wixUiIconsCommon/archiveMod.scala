package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Archive", JSImport.Default)
  @js.native
  val default: SFC[ArchiveProps] = js.native
  
  @js.native
  trait ArchiveProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArchiveProps {
    
    @scala.inline
    def apply(): ArchiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveProps]
    }
    
    @scala.inline
    implicit class ArchivePropsMutableBuilder[Self <: ArchiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ArchiveProps]
  
  /* This means you don't have to write `default`, but can instead just say `archiveMod.foo` */
  override def _to: SFC[ArchiveProps] = default
}
