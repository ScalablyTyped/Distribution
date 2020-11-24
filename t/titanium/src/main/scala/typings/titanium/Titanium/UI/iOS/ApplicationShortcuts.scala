package typings.titanium.Titanium.UI.iOS

import typings.titanium.ShortcutParams
import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Home screen quick actions API is for adding shortcuts to your app icon that anticipate and accelerate a
  * user's interaction with your app.
  * @deprecated Use [Titanium.UI.Shortcut](Titanium.UI.Shortcut) instead.
  */
@js.native
trait ApplicationShortcuts extends Proxy {
  
  /**
    * Creates a new dynamic application shortcut item.
    */
  def addDynamicShortcut(params: ShortcutParams): Unit = js.native
  
  /**
    * Returns true or false depending if the provided shortcut object already exists.
    */
  def dynamicShortcutExists(identifier: String): Boolean = js.native
  
  /**
    * Gets the dynamic application shortcut item identified by the `identifier`.
    */
  def getDynamicShortcut(identifier: String): ShortcutParams = js.native
  
  /**
    * Returns an array of the application shortcuts created dynamically.
    */
  def listDynamicShortcuts(): js.Array[ShortcutParams] = js.native
  
  /**
    * Returns an array of the application shortcuts listed in your tiapp.xml file.
    */
  def listStaticShortcuts(): js.Array[ShortcutParams] = js.native
  
  /**
    * Removes all dynamically created application shortcuts.
    */
  def removeAllDynamicShortcuts(): Unit = js.native
  
  /**
    * Removes the dynamic application shortcut item identified by the `identifier`.
    */
  def removeDynamicShortcut(identifier: String): Unit = js.native
}
