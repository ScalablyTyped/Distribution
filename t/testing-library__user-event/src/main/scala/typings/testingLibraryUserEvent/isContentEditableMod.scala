package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.prepareDocumentMod.global.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isContentEditableMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/edit/isContentEditable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContentEditable(node: Node): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentEditable")(node.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def isContentEditable(element: Element): /* is @testing-library/user-event.anon.HTMLElementcontenteditabl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContentEditable")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @testing-library/user-event.anon.HTMLElementcontenteditabl */ Boolean]
}
