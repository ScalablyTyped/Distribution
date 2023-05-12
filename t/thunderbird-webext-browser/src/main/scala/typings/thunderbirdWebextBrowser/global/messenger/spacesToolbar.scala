package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.spacesToolbar.ButtonProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacesToolbar {
  
  @JSGlobal("messenger.spacesToolbar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addButton(id: String, properties: ButtonProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addButton")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def removeButton(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeButton")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def updateButton(id: String, properties: ButtonProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateButton")(id.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
