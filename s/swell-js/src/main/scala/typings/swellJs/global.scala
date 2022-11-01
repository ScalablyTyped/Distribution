package typings.swellJs

import typings.swellJs.mod.Address
import typings.swellJs.mod.AddressWithContact
import typings.swellJs.mod.CartInput
import typings.swellJs.mod.CartOption
import typings.swellJs.mod.Cart_
import typings.swellJs.mod.CreateAccountInput
import typings.swellJs.mod.InitOptions
import typings.swellJs.mod.Order
import typings.swellJs.mod.Product
import typings.swellJs.mod.Query
import typings.swellJs.mod.SearchQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object swell {
    
    @JSGlobal("swell")
    @js.native
    val ^ : js.Any = js.native
    
    object account {
      
      @JSGlobal("swell.account")
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
    
    object attributes {
      
      @JSGlobal("swell.attributes")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def list(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    }
    
    object card {
      
      @JSGlobal("swell.card")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createToken(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def validateCVC(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCVC")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def validateExpiry(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateExpiry")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def validateNumber(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object cart {
      
      @JSGlobal("swell.cart")
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
    
    object categories {
      
      @JSGlobal("swell.categories")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def list(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    }
    
    object currency {
      
      @JSGlobal("swell.currency")
      @js.native
      val ^ : js.Any = js.native
      
      inline def format(input: Double, format: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def list(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[Any]]
      
      inline def select(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
    }
    
    inline def get(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def init(storeId: String, publicKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(storeId: String, publicKey: String, options: InitOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object locale {
      
      @JSGlobal("swell.locale")
      @js.native
      val ^ : js.Any = js.native
      
      inline def select(locale: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
    }
    
    object payment {
      
      @JSGlobal("swell.payment")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createElements(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElements")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def tokenize(input: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    inline def post(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    object products {
      
      @JSGlobal("swell.products")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(productId: String): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(productId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
      
      inline def list(input: Query): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
      inline def list(input: SearchQuery): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
      
      inline def variation(productId: String, options: CartOption): js.Promise[Product] = (^.asInstanceOf[js.Dynamic].applyDynamic("variation")(productId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Product]]
    }
    
    inline def put(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    object settings {
      
      @JSGlobal("swell.settings")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getfunction(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getfunction")().asInstanceOf[js.Promise[Any]]
      
      inline def loadfunction(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadfunction")().asInstanceOf[js.Promise[Any]]
      
      inline def menus(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("menus")().asInstanceOf[js.Promise[Any]]
      inline def menus(input: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("menus")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def payments(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("payments")().asInstanceOf[js.Promise[Any]]
    }
    
    object subscriptions {
      
      @JSGlobal("swell.subscriptions")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addItem(id: String, input: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def create(input: js.Object): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def get(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def list(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[Any]]
      
      inline def removeItem(id: String, itemId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(id.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def update(id: String, input: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def updateItem(id: String, itemId: String, input: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(id.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    }
  }
}
