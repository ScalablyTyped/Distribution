package typings.useDarkMode

import typings.std.HTMLElement
import typings.std.Window
import typings.std.WindowLocalStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-dark-mode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): DarkMode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[DarkMode]
  @scala.inline
  def default(initialState: Boolean): DarkMode = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any]).asInstanceOf[DarkMode]
  @scala.inline
  def default(initialState: Boolean, config: DarkModeConfig): DarkMode = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[DarkMode]
  @scala.inline
  def default(initialState: Unit, config: DarkModeConfig): DarkMode = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialState.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[DarkMode]
  
  trait DarkMode extends StObject {
    
    def disable(): Unit
    
    def enable(): Unit
    
    def toggle(): Unit
    
    val value: Boolean
  }
  object DarkMode {
    
    @scala.inline
    def apply(disable: () => Unit, enable: () => Unit, toggle: () => Unit, value: Boolean): DarkMode = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), toggle = js.Any.fromFunction0(toggle), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DarkMode]
    }
    
    @scala.inline
    implicit class DarkModeMutableBuilder[Self <: DarkMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DarkModeConfig extends StObject {
    
    var classNameDark: js.UndefOr[String] = js.undefined
    
    // A className to set "dark mode". Default = "dark-mode".
    var classNameLight: js.UndefOr[String] = js.undefined
    
    // A className to set "light mode". Default = "light-mode".
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    // A storage provider. Default = `localStorage`.
    var global: js.UndefOr[Window] = js.undefined
    
    // The element to apply the className. Default = `document.body`
    var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    // Overide the default className handler with a custom callback.
    var storageKey: js.UndefOr[String] = js.undefined
    
    // Specify the `localStorage` key. Default = "darkMode". Sewt to `null` to disable persistent storage.
    var storageProvider: js.UndefOr[WindowLocalStorage] = js.undefined
  }
  object DarkModeConfig {
    
    @scala.inline
    def apply(): DarkModeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DarkModeConfig]
    }
    
    @scala.inline
    implicit class DarkModeConfigMutableBuilder[Self <: DarkModeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassNameDark(value: String): Self = StObject.set(x, "classNameDark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameDarkUndefined: Self = StObject.set(x, "classNameDark", js.undefined)
      
      @scala.inline
      def setClassNameLight(value: String): Self = StObject.set(x, "classNameLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameLightUndefined: Self = StObject.set(x, "classNameLight", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setGlobal(value: Window): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* val */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
      
      @scala.inline
      def setStorageProvider(value: WindowLocalStorage): Self = StObject.set(x, "storageProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageProviderUndefined: Self = StObject.set(x, "storageProvider", js.undefined)
    }
  }
}
