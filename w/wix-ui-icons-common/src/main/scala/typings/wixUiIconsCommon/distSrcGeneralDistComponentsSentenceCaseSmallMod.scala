package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSentenceCaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SentenceCaseSmall", JSImport.Default)
  @js.native
  val default: FC[SentenceCaseSmallProps] = js.native
  
  trait SentenceCaseSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SentenceCaseSmallProps {
    
    inline def apply(): SentenceCaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentenceCaseSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentenceCaseSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SentenceCaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSentenceCaseSmallMod.foo` */
  override def _to: FC[SentenceCaseSmallProps] = default
}
