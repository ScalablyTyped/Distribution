package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getValueOrTextContentMod {
  
  @JSImport("@testing-library/user-event/dist/types/document/getValueOrTextContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValueOrTextContent[T /* <: Element | Null */](element: T): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueOrTextContent")(element.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
