package typings.terraContentContainer

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContentContainerMod extends Shortcut {
  
  @JSImport("terra-content-container/lib/ContentContainer", JSImport.Default)
  @js.native
  val default: FC[ContentContainerProps] = js.native
  
  trait ContentContainerProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Whether or not the container should expanded to fill its parent element.
      */
    var fill: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The footer element to be placed within the footer area of the container.
      */
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The header element to be placed within the header area of the container.
      */
    var header: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Ref callback for the scrollable area of the content container.
      */
    var scrollRefCallback: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
  }
  object ContentContainerProps {
    
    inline def apply(): ContentContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentContainerProps]
    }
    
    extension [Self <: ContentContainerProps](x: Self) {
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setScrollRefCallback(value: Ref[HTMLDivElement]): Self = StObject.set(x, "scrollRefCallback", value.asInstanceOf[js.Any])
      
      inline def setScrollRefCallbackFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "scrollRefCallback", js.Any.fromFunction1(value))
      
      inline def setScrollRefCallbackNull: Self = StObject.set(x, "scrollRefCallback", null)
      
      inline def setScrollRefCallbackUndefined: Self = StObject.set(x, "scrollRefCallback", js.undefined)
    }
  }
  
  type _To = FC[ContentContainerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libContentContainerMod.foo` */
  override def _to: FC[ContentContainerProps] = default
}
