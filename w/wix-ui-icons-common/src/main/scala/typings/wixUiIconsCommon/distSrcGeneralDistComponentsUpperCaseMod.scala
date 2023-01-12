package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsUpperCaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UpperCase", JSImport.Default)
  @js.native
  val default: FC[UpperCaseProps] = js.native
  
  trait UpperCaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UpperCaseProps {
    
    inline def apply(): UpperCaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpperCaseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpperCaseProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UpperCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsUpperCaseMod.foo` */
  override def _to: FC[UpperCaseProps] = default
}
