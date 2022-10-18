package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCafe extends StObject {
  
  /**
    * Stops the TestCafe server. Forcibly closes all connections and pending test runs immediately.
    */
  def close(): js.Promise[Unit]
  
  /**
    * Creates a remote browser connection.
    */
  def createBrowserConnection(): js.Promise[BrowserConnection]
  
  /**
    * Creates the live mode test runner that is used to configure and launch test tasks.
    */
  def createLiveModeRunner(): Runner
  
  /**
    * Creates the test runner that is used to configure and launch test tasks.
    */
  def createRunner(): Runner
}
object TestCafe {
  
  inline def apply(
    close: () => js.Promise[Unit],
    createBrowserConnection: () => js.Promise[BrowserConnection],
    createLiveModeRunner: () => Runner,
    createRunner: () => Runner
  ): TestCafe = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), createBrowserConnection = js.Any.fromFunction0(createBrowserConnection), createLiveModeRunner = js.Any.fromFunction0(createLiveModeRunner), createRunner = js.Any.fromFunction0(createRunner))
    __obj.asInstanceOf[TestCafe]
  }
  
  extension [Self <: TestCafe](x: Self) {
    
    inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCreateBrowserConnection(value: () => js.Promise[BrowserConnection]): Self = StObject.set(x, "createBrowserConnection", js.Any.fromFunction0(value))
    
    inline def setCreateLiveModeRunner(value: () => Runner): Self = StObject.set(x, "createLiveModeRunner", js.Any.fromFunction0(value))
    
    inline def setCreateRunner(value: () => Runner): Self = StObject.set(x, "createRunner", js.Any.fromFunction0(value))
  }
}
