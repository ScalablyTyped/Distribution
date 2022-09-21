package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.prepareDocumentMod.global.Node
import typings.testingLibraryUserEvent.trackValueMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWindowMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/getWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getWindow(node: Node): Window & (/* globalThis */ Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window & (/* globalThis */ Any)]
}
