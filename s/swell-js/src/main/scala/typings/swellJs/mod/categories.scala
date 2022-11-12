package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categories {
  
  @JSImport("swell-js", "categories")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def list(input: js.Object): js.Promise[ListResult[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ListResult[Any]]]
}
