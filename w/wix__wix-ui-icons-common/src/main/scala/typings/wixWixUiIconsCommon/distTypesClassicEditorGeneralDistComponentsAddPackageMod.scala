package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorGeneralDistComponentsAddPackageMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/AddPackage", JSImport.Default)
  @js.native
  val default: FC[AddPackageProps] = js.native
  
  trait AddPackageProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddPackageProps {
    
    inline def apply(): AddPackageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddPackageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddPackageProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddPackageProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorGeneralDistComponentsAddPackageMod.foo` */
  override def _to: FC[AddPackageProps] = default
}
