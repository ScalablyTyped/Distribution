package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageReactionsDistComponentsSmileyXSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/reactions/dist/components/SmileyXSmall", JSImport.Default)
  @js.native
  val default: FC[SmileyXSmallProps] = js.native
  
  trait SmileyXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SmileyXSmallProps {
    
    inline def apply(): SmileyXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmileyXSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SmileyXSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SmileyXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageReactionsDistComponentsSmileyXSmallMod.foo` */
  override def _to: FC[SmileyXSmallProps] = default
}
