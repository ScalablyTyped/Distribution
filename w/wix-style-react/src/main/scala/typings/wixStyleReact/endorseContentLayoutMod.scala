package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endorseContentLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/EndorseContentLayout", JSImport.Default)
  @js.native
  val default: SFC[EndorseContentLayoutProps] = js.native
  
  trait EndorseContentLayoutProps extends StObject {
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var head: js.UndefOr[ReactNode] = js.undefined
    
    var primaryCta: js.UndefOr[ReactNode] = js.undefined
    
    var secondaryCta: js.UndefOr[ReactNode] = js.undefined
  }
  object EndorseContentLayoutProps {
    
    @scala.inline
    def apply(): EndorseContentLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndorseContentLayoutProps]
    }
    
    @scala.inline
    implicit class EndorseContentLayoutPropsMutableBuilder[Self <: EndorseContentLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHead(value: ReactNode): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setPrimaryCta(value: ReactNode): Self = StObject.set(x, "primaryCta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryCtaUndefined: Self = StObject.set(x, "primaryCta", js.undefined)
      
      @scala.inline
      def setSecondaryCta(value: ReactNode): Self = StObject.set(x, "secondaryCta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryCtaUndefined: Self = StObject.set(x, "secondaryCta", js.undefined)
    }
  }
  
  type _To = SFC[EndorseContentLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `endorseContentLayoutMod.foo` */
  override def _to: SFC[EndorseContentLayoutProps] = default
}
