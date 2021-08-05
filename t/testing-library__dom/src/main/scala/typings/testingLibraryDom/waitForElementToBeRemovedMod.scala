package typings.testingLibraryDom

import typings.testingLibraryDom.waitForMod.waitForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waitForElementToBeRemovedMod {
  
  @JSImport("@testing-library/dom/types/wait-for-element-to-be-removed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitForElementToBeRemoved[T](callback: T): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: T, options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: js.Function0[T]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForElementToBeRemoved[T](callback: js.Function0[T], options: waitForOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForElementToBeRemoved")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
