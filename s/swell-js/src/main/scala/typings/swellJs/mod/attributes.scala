package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributes {
  
  @JSImport("swell-js", "attributes")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def list(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
