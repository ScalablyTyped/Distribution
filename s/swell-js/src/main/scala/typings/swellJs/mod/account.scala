package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object account {
  
  @JSImport("swell-js", "account")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(input: CreateAccountInput): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def createAddress(input: AddressWithContact): js.Promise[AddressWithContact] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAddress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AddressWithContact]]
  
  inline def createCard(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCard")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def deleteAddress(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAddress")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def deleteCard(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCard")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def get(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Any]]
  
  inline def getAddresses(param0: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddresses")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def getOrder(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrder")().asInstanceOf[js.Promise[Any]]
  inline def getOrder(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrder")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def listAddresses(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAddresses")().asInstanceOf[js.Promise[Any]]
  
  inline def listCards(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("listCards")().asInstanceOf[js.Promise[Any]]
  
  inline def listOrders(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("listOrders")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def login(user: String, password: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def logout(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[js.Promise[Any]]
  
  inline def recover(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("recover")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def update(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def updateAddress(id: String, data: Address): js.Promise[AddressWithContact] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAddress")(id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AddressWithContact]]
  
  inline def updateCard(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCard")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
