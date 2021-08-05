package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArchiveSmall", JSImport.Default)
  @js.native
  val default: SFC[ArchiveSmallProps] = js.native
  
  trait ArchiveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ArchiveSmallProps {
    
    inline def apply(): ArchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveSmallProps]
    }
    
    extension [Self <: ArchiveSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ArchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `archiveSmallMod.foo` */
  override def _to: SFC[ArchiveSmallProps] = default
}
