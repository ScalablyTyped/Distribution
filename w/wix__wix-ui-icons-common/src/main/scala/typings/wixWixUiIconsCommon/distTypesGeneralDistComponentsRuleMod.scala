package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRuleMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Rule", JSImport.Default)
  @js.native
  val default: FC[RuleProps] = js.native
  
  trait RuleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RuleProps {
    
    inline def apply(): RuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RuleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRuleMod.foo` */
  override def _to: FC[RuleProps] = default
}
