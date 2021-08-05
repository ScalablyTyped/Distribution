package typings.webdriverio

import typings.webdriverio.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragAndDropMod {
  
  @JSImport("webdriverio/build/commands/element/dragAndDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: js.Any): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def default(target: js.Any, hasDuration: Duration): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], hasDuration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
}
