package typings.thunderbirdWebextBrowser.global.browser

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.storage.StorageArea
import typings.thunderbirdWebextBrowser.browser.storage.StorageAreaSync
import typings.thunderbirdWebextBrowser.browser.storage.StorageChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSGlobal("browser.storage.local")
  @js.native
  val local: StorageArea = js.native
  
  @JSGlobal("browser.storage.managed")
  @js.native
  val managed: StorageArea = js.native
  
  @JSGlobal("browser.storage.onChanged")
  @js.native
  val onChanged: WebExtEvent[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ] = js.native
  
  @JSGlobal("browser.storage.sync")
  @js.native
  val sync: StorageAreaSync = js.native
}
