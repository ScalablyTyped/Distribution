package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.wordpressComponents.buttonMod.Button.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/button", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Button {
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.wordpressComponents.buttonMod.Button.BaseProps because var conflicts: className, disabled. Inlined isDefault, isPrimary, isSecondary, isTertiary, isDestructive, isLarge, isSmall, isToggled, isBusy, isLink */ @js.native
    trait AnchorProps
      extends HTMLProps[HTMLAnchorElement]
         with Props {
      
      /**
        * Indicates activity while a action is being performed.
        */
      var isBusy: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a default button style.
        * @deprecated use `isSecondary`
        */
      var isDefault: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a red text-based button style to indicate destructive
        * behavior.
        */
      var isDestructive: js.UndefOr[Boolean] = js.native
      
      /**
        * Increases the size of the button.
        */
      var isLarge: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a button with an anchor style.
        */
      var isLink: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a primary button style.
        */
      var isPrimary: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a default button style.
        */
      var isSecondary: js.UndefOr[Boolean] = js.native
      
      /**
        * Decreases the size of the button.
        */
      var isSmall: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a text-based button style.
        */
      var isTertiary: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a toggled button style.
        */
      var isToggled: js.UndefOr[Boolean] = js.native
    }
    object AnchorProps {
      
      @scala.inline
      def apply(): AnchorProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AnchorProps]
      }
      
      @scala.inline
      implicit class AnchorPropsMutableBuilder[Self <: AnchorProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsBusyUndefined: Self = StObject.set(x, "isBusy", js.undefined)
        
        @scala.inline
        def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        @scala.inline
        def setIsDestructive(value: Boolean): Self = StObject.set(x, "isDestructive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDestructiveUndefined: Self = StObject.set(x, "isDestructive", js.undefined)
        
        @scala.inline
        def setIsLarge(value: Boolean): Self = StObject.set(x, "isLarge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLargeUndefined: Self = StObject.set(x, "isLarge", js.undefined)
        
        @scala.inline
        def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
        
        @scala.inline
        def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
        
        @scala.inline
        def setIsSecondary(value: Boolean): Self = StObject.set(x, "isSecondary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSecondaryUndefined: Self = StObject.set(x, "isSecondary", js.undefined)
        
        @scala.inline
        def setIsSmall(value: Boolean): Self = StObject.set(x, "isSmall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSmallUndefined: Self = StObject.set(x, "isSmall", js.undefined)
        
        @scala.inline
        def setIsTertiary(value: Boolean): Self = StObject.set(x, "isTertiary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsTertiaryUndefined: Self = StObject.set(x, "isTertiary", js.undefined)
        
        @scala.inline
        def setIsToggled(value: Boolean): Self = StObject.set(x, "isToggled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsToggledUndefined: Self = StObject.set(x, "isToggled", js.undefined)
      }
    }
    
    @js.native
    trait BaseProps extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      var disabled: js.UndefOr[Boolean] = js.native
      
      /**
        * Indicates activity while a action is being performed.
        */
      var isBusy: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a default button style.
        * @deprecated use `isSecondary`
        */
      var isDefault: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a red text-based button style to indicate destructive
        * behavior.
        */
      var isDestructive: js.UndefOr[Boolean] = js.native
      
      /**
        * Increases the size of the button.
        */
      var isLarge: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a button with an anchor style.
        */
      var isLink: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a primary button style.
        */
      var isPrimary: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a default button style.
        */
      var isSecondary: js.UndefOr[Boolean] = js.native
      
      /**
        * Decreases the size of the button.
        */
      var isSmall: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a text-based button style.
        */
      var isTertiary: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a toggled button style.
        */
      var isToggled: js.UndefOr[Boolean] = js.native
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
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsBusyUndefined: Self = StObject.set(x, "isBusy", js.undefined)
        
        @scala.inline
        def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        @scala.inline
        def setIsDestructive(value: Boolean): Self = StObject.set(x, "isDestructive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDestructiveUndefined: Self = StObject.set(x, "isDestructive", js.undefined)
        
        @scala.inline
        def setIsLarge(value: Boolean): Self = StObject.set(x, "isLarge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLargeUndefined: Self = StObject.set(x, "isLarge", js.undefined)
        
        @scala.inline
        def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
        
        @scala.inline
        def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
        
        @scala.inline
        def setIsSecondary(value: Boolean): Self = StObject.set(x, "isSecondary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSecondaryUndefined: Self = StObject.set(x, "isSecondary", js.undefined)
        
        @scala.inline
        def setIsSmall(value: Boolean): Self = StObject.set(x, "isSmall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSmallUndefined: Self = StObject.set(x, "isSmall", js.undefined)
        
        @scala.inline
        def setIsTertiary(value: Boolean): Self = StObject.set(x, "isTertiary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsTertiaryUndefined: Self = StObject.set(x, "isTertiary", js.undefined)
        
        @scala.inline
        def setIsToggled(value: Boolean): Self = StObject.set(x, "isToggled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsToggledUndefined: Self = StObject.set(x, "isToggled", js.undefined)
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.wordpressComponents.buttonMod.Button.BaseProps because var conflicts: className, disabled. Inlined isDefault, isPrimary, isSecondary, isTertiary, isDestructive, isLarge, isSmall, isToggled, isBusy, isLink */ @js.native
    trait ButtonProps
      extends HTMLProps[HTMLButtonElement]
         with Props {
      
      @JSName("href")
      var href_ButtonProps: js.UndefOr[scala.Nothing] = js.native
      
      /**
        * Indicates activity while a action is being performed.
        */
      var isBusy: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a default button style.
        * @deprecated use `isSecondary`
        */
      var isDefault: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a red text-based button style to indicate destructive
        * behavior.
        */
      var isDestructive: js.UndefOr[Boolean] = js.native
      
      /**
        * Increases the size of the button.
        */
      var isLarge: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a button with an anchor style.
        */
      var isLink: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a primary button style.
        */
      var isPrimary: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a default button style.
        */
      var isSecondary: js.UndefOr[Boolean] = js.native
      
      /**
        * Decreases the size of the button.
        */
      var isSmall: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a text-based button style.
        */
      var isTertiary: js.UndefOr[Boolean] = js.native
      
      /**
        * Renders a toggled button style.
        */
      var isToggled: js.UndefOr[Boolean] = js.native
    }
    object ButtonProps {
      
      @scala.inline
      def apply(): ButtonProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ButtonProps]
      }
      
      @scala.inline
      implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIsBusy(value: Boolean): Self = StObject.set(x, "isBusy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsBusyUndefined: Self = StObject.set(x, "isBusy", js.undefined)
        
        @scala.inline
        def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
        
        @scala.inline
        def setIsDestructive(value: Boolean): Self = StObject.set(x, "isDestructive", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsDestructiveUndefined: Self = StObject.set(x, "isDestructive", js.undefined)
        
        @scala.inline
        def setIsLarge(value: Boolean): Self = StObject.set(x, "isLarge", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLargeUndefined: Self = StObject.set(x, "isLarge", js.undefined)
        
        @scala.inline
        def setIsLink(value: Boolean): Self = StObject.set(x, "isLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsLinkUndefined: Self = StObject.set(x, "isLink", js.undefined)
        
        @scala.inline
        def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
        
        @scala.inline
        def setIsSecondary(value: Boolean): Self = StObject.set(x, "isSecondary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSecondaryUndefined: Self = StObject.set(x, "isSecondary", js.undefined)
        
        @scala.inline
        def setIsSmall(value: Boolean): Self = StObject.set(x, "isSmall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsSmallUndefined: Self = StObject.set(x, "isSmall", js.undefined)
        
        @scala.inline
        def setIsTertiary(value: Boolean): Self = StObject.set(x, "isTertiary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsTertiaryUndefined: Self = StObject.set(x, "isTertiary", js.undefined)
        
        @scala.inline
        def setIsToggled(value: Boolean): Self = StObject.set(x, "isToggled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsToggledUndefined: Self = StObject.set(x, "isToggled", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.wordpressComponents.buttonMod.Button.AnchorProps
      - typings.wordpressComponents.buttonMod.Button.ButtonProps
    */
    trait Props extends StObject
    object Props {
      
      @scala.inline
      def AnchorProps(): typings.wordpressComponents.buttonMod.Button.AnchorProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.wordpressComponents.buttonMod.Button.AnchorProps]
      }
      
      @scala.inline
      def ButtonProps(): typings.wordpressComponents.buttonMod.Button.ButtonProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.wordpressComponents.buttonMod.Button.ButtonProps]
      }
    }
  }
}
