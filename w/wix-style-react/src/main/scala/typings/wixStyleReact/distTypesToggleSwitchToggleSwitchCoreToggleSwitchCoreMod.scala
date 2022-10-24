package typings.wixStyleReact

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.Checked
import typings.wixStyleReact.anon.FocusVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleSwitchToggleSwitchCoreToggleSwitchCoreMod {
  
  @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitchCore/ToggleSwitchCore", JSImport.Default)
  @js.native
  open class default () extends ToggleSwitchCore
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitchCore/ToggleSwitchCore", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitchCore/ToggleSwitchCore", "default.defaultProps")
    @js.native
    def defaultProps: Checked = js.native
    inline def defaultProps_=(x: Checked): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitchCore/ToggleSwitchCore", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ToggleSwitchCore extends PureComponent[ToggleSwitchCoreProps, ToggleSwitchCoreState, Any] {
    
    /* private */ var focusedByMouse: Any = js.native
    
    /* private */ val handleBlur: Any = js.native
    
    /* private */ val handleFocus: Any = js.native
    
    /* private */ val handleKeyDown: Any = js.native
    
    /* private */ val handleMouseDown: Any = js.native
    
    @JSName("state")
    var state_ToggleSwitchCore: FocusVisible = js.native
  }
  
  trait ToggleSwitchCoreProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var checkedIcon: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var styles: js.UndefOr[ToggleSwitchCoreStyles] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var uncheckedIcon: js.UndefOr[ReactNode] = js.undefined
  }
  object ToggleSwitchCoreProps {
    
    inline def apply(): ToggleSwitchCoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSwitchCoreProps]
    }
    
    extension [Self <: ToggleSwitchCoreProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedIcon(value: ReactNode): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
      
      inline def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStyles(value: ToggleSwitchCoreStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setUncheckedIcon(value: ReactNode): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
      
      inline def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    }
  }
  
  trait ToggleSwitchCoreState extends StObject {
    
    var focus: Boolean
    
    var focusVisible: Boolean
  }
  object ToggleSwitchCoreState {
    
    inline def apply(focus: Boolean, focusVisible: Boolean): ToggleSwitchCoreState = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleSwitchCoreState]
    }
    
    extension [Self <: ToggleSwitchCoreState](x: Self) {
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    }
  }
  
  trait ToggleSwitchCoreStyles extends StObject {
    
    var knob: js.UndefOr[CSSProperties] = js.undefined
    
    var knobIcon: js.UndefOr[CSSProperties] = js.undefined
    
    var root: js.UndefOr[CSSProperties] = js.undefined
    
    var track: js.UndefOr[CSSProperties] = js.undefined
  }
  object ToggleSwitchCoreStyles {
    
    inline def apply(): ToggleSwitchCoreStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToggleSwitchCoreStyles]
    }
    
    extension [Self <: ToggleSwitchCoreStyles](x: Self) {
      
      inline def setKnob(value: CSSProperties): Self = StObject.set(x, "knob", value.asInstanceOf[js.Any])
      
      inline def setKnobIcon(value: CSSProperties): Self = StObject.set(x, "knobIcon", value.asInstanceOf[js.Any])
      
      inline def setKnobIconUndefined: Self = StObject.set(x, "knobIcon", js.undefined)
      
      inline def setKnobUndefined: Self = StObject.set(x, "knob", js.undefined)
      
      inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTrack(value: CSSProperties): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
      
      inline def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
    }
  }
}
