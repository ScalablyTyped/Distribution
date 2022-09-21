package typings.yaDisk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meta {
  
  @JSImport("ya-disk", "meta")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(token: String, path: String): js.Promise[Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Resource]]
  inline def add(token: String, path: String, props: Record[String, String | Double]): js.Promise[Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Resource]]
  
  inline def get(token: String, path: String): js.Promise[Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Resource]]
  inline def get(token: String, path: String, props: GetProps): js.Promise[Resource] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Resource]]
}
