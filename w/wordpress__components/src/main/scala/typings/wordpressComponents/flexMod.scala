package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.AlignItemsProperty
import typings.csstype.mod.JustifyContentProperty
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import typings.wordpressComponents.flexMod.Flex.Props
import typings.wordpressComponents.wordpressComponentsStrings.bottom
import typings.wordpressComponents.wordpressComponentsStrings.left
import typings.wordpressComponents.wordpressComponentsStrings.right
import typings.wordpressComponents.wordpressComponentsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flexMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/flex", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Flex {
    
    @js.native
    trait FlexProps extends StObject {
      
      /**
        * Sets align-items. Top and bottom are shorthand for flex-start and flex-end respectively.
        */
      var align: js.UndefOr[AlignItemsProperty | top | bottom] = js.native
      
      /**
        * Determines the spacing in between children components. The `gap` value is a multiplier to the base value of `4`.
        */
      var gap: js.UndefOr[Double] = js.native
      
      /**
        * Reverses the flex direction.
        */
      var isReversed: js.UndefOr[Boolean] = js.native
      
      /**
        * Sets jusifty-content. Left and right are shorthand for flex-start and flex-end respectively, not the actual CSS value.
        */
      var justify: js.UndefOr[JustifyContentProperty | left | right] = js.native
    }
    object FlexProps {
      
      @scala.inline
      def apply(): FlexProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FlexProps]
      }
      
      @scala.inline
      implicit class FlexPropsMutableBuilder[Self <: FlexProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: AlignItemsProperty | top | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
        
        @scala.inline
        def setIsReversed(value: Boolean): Self = StObject.set(x, "isReversed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsReversedUndefined: Self = StObject.set(x, "isReversed", js.undefined)
        
        @scala.inline
        def setJustify(value: JustifyContentProperty | left | right): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      }
    }
    
    @js.native
    trait Props
      extends HTMLProps[HTMLDivElement]
         with FlexProps
    object Props {
      
      @scala.inline
      def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
    }
  }
}
