package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMultipleChoicesMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/MultipleChoices", JSImport.Default)
  @js.native
  val default: FC[MultipleChoicesProps] = js.native
  
  trait MultipleChoicesProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MultipleChoicesProps {
    
    inline def apply(): MultipleChoicesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultipleChoicesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleChoicesProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MultipleChoicesProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMultipleChoicesMod.foo` */
  override def _to: FC[MultipleChoicesProps] = default
}
