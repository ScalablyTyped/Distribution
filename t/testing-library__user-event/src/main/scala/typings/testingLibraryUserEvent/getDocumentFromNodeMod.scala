package typings.testingLibraryUserEvent

import typings.std.Document
import typings.testingLibraryUserEvent.prepareDocumentMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDocumentFromNodeMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/getDocumentFromNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentFromNode(el: Node): Document | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentFromNode")(el.asInstanceOf[js.Any]).asInstanceOf[Document | Null]
}
