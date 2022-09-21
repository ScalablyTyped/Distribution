package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharing {
  
  @JSImport("webpack", "sharing")
  @js.native
  val ^ : js.Any = js.native
  
  inline def scope[T](scope: String, options: ContainerOptionsFormat[T]): Record[String, String | js.Array[String] | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scope")(scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Record[String, String | js.Array[String] | T]]
}
