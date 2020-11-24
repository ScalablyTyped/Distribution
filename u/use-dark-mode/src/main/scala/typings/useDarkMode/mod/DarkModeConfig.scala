package typings.useDarkMode.mod

import typings.std.HTMLElement
import typings.std.Window
import typings.std.WindowLocalStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DarkModeConfig extends js.Object {
  
  var classNameDark: js.UndefOr[String] = js.native
  
   // A className to set "dark mode". Default = "dark-mode".
  var classNameLight: js.UndefOr[String] = js.native
  
   // A className to set "light mode". Default = "light-mode".
  var element: js.UndefOr[HTMLElement] = js.native
  
   // A storage provider. Default = `localStorage`.
  var global: js.UndefOr[Window] = js.native
  
   // The element to apply the className. Default = `document.body`
  var onChange: js.UndefOr[js.Function1[/* val */ js.UndefOr[Boolean], Unit]] = js.native
  
   // Overide the default className handler with a custom callback.
  var storageKey: js.UndefOr[String] = js.native
  
   // Specify the `localStorage` key. Default = "darkMode". Sewt to `null` to disable persistent storage.
  var storageProvider: js.UndefOr[WindowLocalStorage] = js.native
}
object DarkModeConfig {
  
  @scala.inline
  def apply(): DarkModeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkModeConfig]
  }
  
  @scala.inline
  implicit class DarkModeConfigOps[Self <: DarkModeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClassNameDark(value: String): Self = this.set("classNameDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameDark: Self = this.set("classNameDark", js.undefined)
    
    @scala.inline
    def setClassNameLight(value: String): Self = this.set("classNameLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameLight: Self = this.set("classNameLight", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setGlobal(value: Window): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* val */ js.UndefOr[Boolean] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
    
    @scala.inline
    def setStorageProvider(value: WindowLocalStorage): Self = this.set("storageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageProvider: Self = this.set("storageProvider", js.undefined)
  }
}
