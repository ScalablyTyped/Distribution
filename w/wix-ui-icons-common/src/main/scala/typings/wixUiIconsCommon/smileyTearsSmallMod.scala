package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smileyTearsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/SmileyTearsSmall", JSImport.Default)
  @js.native
  val default: FC[SmileyTearsSmallProps] = js.native
  
  trait SmileyTearsSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SmileyTearsSmallProps {
    
    inline def apply(): SmileyTearsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmileyTearsSmallProps]
    }
    
    extension [Self <: SmileyTearsSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SmileyTearsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `smileyTearsSmallMod.foo` */
  override def _to: FC[SmileyTearsSmallProps] = default
}
