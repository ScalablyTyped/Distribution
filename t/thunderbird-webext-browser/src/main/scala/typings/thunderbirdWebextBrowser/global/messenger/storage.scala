package typings.thunderbirdWebextBrowser.global.messenger

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.storage.StorageArea
import typings.thunderbirdWebextBrowser.messenger.storage.StorageAreaSync
import typings.thunderbirdWebextBrowser.messenger.storage.StorageChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  @JSGlobal("messenger.storage.local")
  @js.native
  val local: StorageArea = js.native
  
  @JSGlobal("messenger.storage.managed")
  @js.native
  val managed: StorageArea = js.native
  
  @JSGlobal("messenger.storage.onChanged")
  @js.native
  val onChanged: WebExtEvent[
    js.Function2[/* changes */ StringDictionary[StorageChange], /* areaName */ String, Unit]
  ] = js.native
  
  @JSGlobal("messenger.storage.sync")
  @js.native
  val sync: StorageAreaSync = js.native
}
