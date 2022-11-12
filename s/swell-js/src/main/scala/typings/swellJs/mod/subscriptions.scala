package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptions {
  
  @JSImport("swell-js", "subscriptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addItem(id: String, input: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def create(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def list(): js.Promise[ListResult[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ListResult[Any]]]
  
  inline def removeItem(id: String, itemId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(id.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(id: String, input: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def updateItem(id: String, itemId: String, input: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(id.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
