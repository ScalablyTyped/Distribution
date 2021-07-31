package typings.testingLibraryDom

import typings.testingLibraryDom.waitForMod.waitForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForElementMod {
  
  @JSImport("@testing-library/dom/types/wait-for-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def waitForElement[T](callback: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  @scala.inline
  def waitForElement[T](callback: js.Function0[T], options: waitForOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElement")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
