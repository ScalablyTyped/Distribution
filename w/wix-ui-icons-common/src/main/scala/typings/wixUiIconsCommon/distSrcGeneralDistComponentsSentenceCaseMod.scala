package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsSentenceCaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SentenceCase", JSImport.Default)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SentenceCaseProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SentenceCaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsSentenceCaseMod.foo` */
  override def _to: FC[SentenceCaseProps] = default
}
