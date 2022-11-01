package typings.swellJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cart {
  
  @JSImport("swell-js", "cart")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addItem(input: CartInput): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def applyCoupon(input: String): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyCoupon")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def applyGiftcard(input: String): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyGiftcard")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def get(): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Cart_]]
  
  inline def getSettings(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[js.Promise[Any]]
  
  inline def removeCoupon(): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCoupon")().asInstanceOf[js.Promise[Cart_]]
  
  inline def removeGiftcard(itemId: String): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeGiftcard")(itemId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def removeItem(itemId: String): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(itemId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def setItems(input: js.Array[CartInput]): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("setItems")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def submitOrder(): js.Promise[Order] = ^.asInstanceOf[js.Dynamic].applyDynamic("submitOrder")().asInstanceOf[js.Promise[Order]]
  
  inline def update(input: Any): js.Promise[Cart_] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart_]]
  
  inline def updateItem(itemId: String, input: Any): js.Promise[Cart_] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(itemId.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cart_]]
}
