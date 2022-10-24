package typings.wixStyleReact

import typings.protractor.mod.ElementFinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsProtractorHelpersMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/protractor-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disableCSSAnimation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableCSSAnimation")().asInstanceOf[Unit]
  
  inline def hasAttribute(elementFinder: Any, attributeName: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAttribute")(elementFinder.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasClass(element: Any, className: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClass")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isFocused(element: ElementFinder): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocused")(element.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
