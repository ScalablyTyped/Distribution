package typings.testingLibraryUserEvent

import typings.std.Document
import typings.std.ShadowRoot
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActiveElementMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/focus/getActiveElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveElement(document: Document): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(document.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def getActiveElement(document: ShadowRoot): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElement")(document.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def getActiveElementOrBody(document: Document): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveElementOrBody")(document.asInstanceOf[js.Any]).asInstanceOf[Element]
}
