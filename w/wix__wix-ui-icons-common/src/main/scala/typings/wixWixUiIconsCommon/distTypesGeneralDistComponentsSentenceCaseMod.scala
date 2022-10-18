package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSentenceCaseMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SentenceCase", JSImport.Default)
  @js.native
  val default: FC[SentenceCaseProps] = js.native
  
  trait SentenceCaseProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SentenceCaseProps {
    
    inline def apply(): SentenceCaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SentenceCaseProps]
    }
    
    extension [Self <: SentenceCaseProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SentenceCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSentenceCaseMod.foo` */
  override def _to: FC[SentenceCaseProps] = default
}
