package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object currency {
  
  @JSImport("swell-js", "currency")
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(input: Double, format: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def list(): js.Promise[ListResult[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ListResult[Any]]]
  
  inline def select(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
}
