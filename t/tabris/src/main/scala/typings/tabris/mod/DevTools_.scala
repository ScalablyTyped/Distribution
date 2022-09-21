package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "DevTools")
@js.native
/**
  * The `devTools` object provides methods that can assist in App development.
  */
/* private */ open class DevTools_ () extends NativeObject {
  
  /**
    * Hides the developer tools UI if currently visible. Note that this can cause a re-layout since the
    * [`contentView`](./ContentView.md) grows.
    */
  def hideUi(): Unit = js.native
  
  /**
    * Returns `true` if the developer tools UI is currently visible.
    */
  def isUiVisible(): Boolean = js.native
  
  /**
    * Shows the developer tools UI if available and not already visible. Returns `true` if the UI is now
    * visible. Returns `false` if the UI can not be shown [because `EnableDeveloperConsole` is not set to
    * `true` in `config.xml`](../build.md#preferences).
    * Note this causes a re-layout since the [`contentView`](./ContentView.md) shrinks.
    */
  def showUi(): Boolean = js.native
}
