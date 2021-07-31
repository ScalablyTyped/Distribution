package typings.wordpressEditor

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressEditor.postPublishButtonMod.PostPublishButton.Props
import typings.wordpressEditor.wordpressEditorBooleans.`false`
import typings.wordpressEditor.wordpressEditorBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postPublishButtonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/post-publish-button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object PostPublishButton {
    
    trait BaseProps extends StObject {
      
      var children: js.UndefOr[scala.Nothing] = js.undefined
      
      var focusOnMount: js.UndefOr[Boolean] = js.undefined
      
      var forceIsDirty: js.UndefOr[Boolean] = js.undefined
      
      var forceIsSaving: js.UndefOr[Boolean] = js.undefined
      
      var isOpen: js.UndefOr[Boolean] = js.undefined
    }
    object BaseProps {
      
      @scala.inline
      def apply(): BaseProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseProps]
      }
      
      @scala.inline
      implicit class BasePropsMutableBuilder[Self <: BaseProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFocusOnMount(value: Boolean): Self = StObject.set(x, "focusOnMount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusOnMountUndefined: Self = StObject.set(x, "focusOnMount", js.undefined)
        
        @scala.inline
        def setForceIsDirty(value: Boolean): Self = StObject.set(x, "forceIsDirty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceIsDirtyUndefined: Self = StObject.set(x, "forceIsDirty", js.undefined)
        
        @scala.inline
        def setForceIsSaving(value: Boolean): Self = StObject.set(x, "forceIsSaving", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceIsSavingUndefined: Self = StObject.set(x, "forceIsSaving", js.undefined)
        
        @scala.inline
        def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressEditor.postPublishButtonMod.PostPublishButton.SubmitProps
      - typings.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps
    */
    trait Props extends StObject
    object Props {
      
      @scala.inline
      def SubmitProps(): typings.wordpressEditor.postPublishButtonMod.PostPublishButton.SubmitProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.wordpressEditor.postPublishButtonMod.PostPublishButton.SubmitProps]
      }
      
      @scala.inline
      def ToggleProps(onToggle: () => Unit): typings.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps = {
        val __obj = js.Dynamic.literal(isToggle = true, onToggle = js.Any.fromFunction0(onToggle))
        __obj.asInstanceOf[typings.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps]
      }
    }
    
    trait SubmitProps
      extends StObject
         with BaseProps
         with Props {
      
      var isToggle: js.UndefOr[`false`] = js.undefined
      
      var onSubmit: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object SubmitProps {
      
      @scala.inline
      def apply(): SubmitProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubmitProps]
      }
      
      @scala.inline
      implicit class SubmitPropsMutableBuilder[Self <: SubmitProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsToggle(value: `false`): Self = StObject.set(x, "isToggle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsToggleUndefined: Self = StObject.set(x, "isToggle", js.undefined)
        
        @scala.inline
        def setOnSubmit(value: () => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      }
    }
    
    trait ToggleProps
      extends StObject
         with BaseProps
         with Props {
      
      var isToggle: `true`
      
      def onToggle(): Unit
    }
    object ToggleProps {
      
      @scala.inline
      def apply(onToggle: () => Unit): ToggleProps = {
        val __obj = js.Dynamic.literal(isToggle = true, onToggle = js.Any.fromFunction0(onToggle))
        __obj.asInstanceOf[ToggleProps]
      }
      
      @scala.inline
      implicit class TogglePropsMutableBuilder[Self <: ToggleProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsToggle(value: `true`): Self = StObject.set(x, "isToggle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnToggle(value: () => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction0(value))
      }
    }
  }
}
