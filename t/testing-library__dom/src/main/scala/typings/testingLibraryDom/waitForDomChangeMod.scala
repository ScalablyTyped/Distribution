package typings.testingLibraryDom

import typings.testingLibraryDom.waitForMod.waitForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForDomChangeMod {
  
  @JSImport("@testing-library/dom/types/wait-for-dom-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitForDomChange(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDomChange")().asInstanceOf[js.Promise[js.Any]]
  inline def waitForDomChange(options: waitForOptions): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForDomChange")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
