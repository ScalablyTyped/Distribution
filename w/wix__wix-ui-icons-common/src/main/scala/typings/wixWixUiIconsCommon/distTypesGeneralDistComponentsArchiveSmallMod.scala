package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsArchiveSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ArchiveSmall", JSImport.Default)
  @js.native
  val default: FC[ArchiveSmallProps] = js.native
  
  trait ArchiveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArchiveSmallProps {
    
    inline def apply(): ArchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArchiveSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsArchiveSmallMod.foo` */
  override def _to: FC[ArchiveSmallProps] = default
}
