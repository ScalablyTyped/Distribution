package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payment {
  
  @JSImport("swell-js", "payment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createElements(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElements")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def tokenize(input: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
