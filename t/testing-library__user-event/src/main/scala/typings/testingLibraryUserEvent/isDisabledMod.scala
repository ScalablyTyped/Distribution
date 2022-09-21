package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isDisabledMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/misc/isDisabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDisabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")().asInstanceOf[Boolean]
  inline def isDisabled(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
