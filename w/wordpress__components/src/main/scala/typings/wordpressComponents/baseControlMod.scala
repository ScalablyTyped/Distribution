package typings.wordpressComponents

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.baseControlMod.BaseControl.Props
import typings.wordpressComponents.baseControlMod.BaseControl.VisualLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseControlMod {
  
  object default {
    
    @JSImport("@wordpress/components/base-control", JSImport.Default)
    @js.native
    def apply(props: Props): Element = js.native
    
    @JSImport("@wordpress/components/base-control", "default.VisualLabel")
    @js.native
    def VisualLabel(props: VisualLabelProps): Element = js.native
  }
  
  object BaseControl {
    
    @js.native
    trait ControlProps extends StObject {
      
      /**
        * The class that will be added with `"components-base-control"` to
        * the classes of the wrapper div. If undefined, only
        * `"components-base-control"` is used.
        */
      var className: js.UndefOr[String] = js.native
      
      /**
        * If this property is added, a help text will be generated using help
        * property as the content.
        */
      var help: js.UndefOr[ReactNode] = js.native
      
      /**
        * If true, the label will only be visible to screen readers.
        */
      var hideLabelFromVision: js.UndefOr[Boolean] = js.native
      
      /**
        * If this property is added, a label will be generated using label
        * property as the content.
        */
      var label: js.UndefOr[ReactNode] = js.native
    }
    object ControlProps {
      
      @scala.inline
      def apply(): ControlProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ControlProps]
      }
      
      @scala.inline
      implicit class ControlPropsMutableBuilder[Self <: ControlProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setHelp(value: ReactNode): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
        
        @scala.inline
        def setHideLabelFromVision(value: Boolean): Self = StObject.set(x, "hideLabelFromVision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideLabelFromVisionUndefined: Self = StObject.set(x, "hideLabelFromVision", js.undefined)
        
        @scala.inline
        def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      }
    }
    
    @js.native
    trait Props extends ControlProps {
      
      /**
        * The content to be displayed within the BaseControl.
        */
      var children: ReactNode = js.native
      
      /**
        * The id of the element to which labels and help text are being
        * generated. That element should be passed as a child.
        */
      var id: String = js.native
    }
    object Props {
      
      @scala.inline
      def apply(id: String): Props = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait VisualLabelProps extends StObject {
      
      var children: ReactNode = js.native
      
      var className: js.UndefOr[String] = js.native
    }
    object VisualLabelProps {
      
      @scala.inline
      def apply(): VisualLabelProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[VisualLabelProps]
      }
      
      @scala.inline
      implicit class VisualLabelPropsMutableBuilder[Self <: VisualLabelProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      }
    }
  }
}
