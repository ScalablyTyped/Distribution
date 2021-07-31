package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixUiCore.anon.FocusFocusVisible
import typings.wixUiCore.anon.TabIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsToggleSwitchToggleSwitchMod {
  
  @JSImport("wix-ui-core/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch")
  @js.native
  class ToggleSwitch protected ()
    extends PureComponent[ToggleSwitchProps, ToggleSwitchState, js.Any] {
    def this(props: ToggleSwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToggleSwitchProps, context: js.Any) = this()
    
    var focusedByMouse: js.Any = js.native
    
    val handleBlur: js.Any = js.native
    
    val handleFocus: js.Any = js.native
    
    val handleKeyDown: js.Any = js.native
    
    val handleMouseDown: js.Any = js.native
    
    @JSName("state")
    var state_ToggleSwitch: FocusFocusVisible = js.native
  }
  /* static members */
  object ToggleSwitch {
    
    @JSImport("wix-ui-core/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    @scala.inline
    def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/toggle-switch/ToggleSwitch", "ToggleSwitch.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ToggleSwitchProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedIcon: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var styles: js.UndefOr[ToggleSwitchStyles] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var uncheckedIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object ToggleSwitchProps {
    
    @scala.inline
    def apply(): ToggleSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSwitchProps]
    }
    
    @scala.inline
    implicit class ToggleSwitchPropsMutableBuilder[Self <: ToggleSwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedIcon(value: ReactNode): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyles(value: ToggleSwitchStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setUncheckedIcon(value: ReactNode): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    }
  }
  
  trait ToggleSwitchState extends StObject {
    
    var focus: Boolean
    
    var focusVisible: Boolean
  }
  object ToggleSwitchState {
    
    @scala.inline
    def apply(focus: Boolean, focusVisible: Boolean): ToggleSwitchState = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleSwitchState]
    }
    
    @scala.inline
    implicit class ToggleSwitchStateMutableBuilder[Self <: ToggleSwitchState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToggleSwitchStyles extends StObject {
    
    var knob: js.UndefOr[CSSProperties] = js.undefined
    
    var knobIcon: js.UndefOr[CSSProperties] = js.undefined
    
    var root: js.UndefOr[CSSProperties] = js.undefined
    
    var track: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToggleSwitchStyles {
    
    @scala.inline
    def apply(): ToggleSwitchStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSwitchStyles]
    }
    
    @scala.inline
    implicit class ToggleSwitchStylesMutableBuilder[Self <: ToggleSwitchStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKnob(value: CSSProperties): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKnobIcon(value: CSSProperties): Self = StObject.set(x, "knobIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKnobIconUndefined: Self = StObject.set(x, "knobIcon", js.undefined)
      
      @scala.inline
      def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
      
      @scala.inline
      def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTrack(value: CSSProperties): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
}
