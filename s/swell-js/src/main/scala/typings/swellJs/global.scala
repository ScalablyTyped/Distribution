package typings.swellJs

import typings.swellJs.anon.Amazon
import typings.swellJs.anon.Apple
import typings.swellJs.anon.Gateway
import typings.swellJs.anon.Params
import typings.swellJs.mod.InitOptions
import typings.swellJs.mod.ProductQuery
import typings.swellJs.mod.ResultsResponse
import typings.swellJs.typesAttributeMod.Attribute
import typings.swellJs.typesCartMod.Cart
import typings.swellJs.typesCartMod.CartItem
import typings.swellJs.typesCategoryMod.Category
import typings.swellJs.typesContentMod.Content
import typings.swellJs.typesCurrencyMod.EnabledCurrency
import typings.swellJs.typesCurrencyMod.FormatInput
import typings.swellJs.typesCurrencyMod.SelectCurrencyReturn
import typings.swellJs.typesInvoiceMod.Invoice
import typings.swellJs.typesLocaleMod.Locale
import typings.swellJs.typesOrderMod.Order
import typings.swellJs.typesPaymentMod.Payment
import typings.swellJs.typesProductMod.FlexibleProductInput
import typings.swellJs.typesProductMod.PriceRange
import typings.swellJs.typesProductMod.Product
import typings.swellJs.typesSettingsMod.Settings
import typings.swellJs.typesShipmentRatingMod.ShipmentRating
import typings.swellJs.typesSubscriptionMod.Subscription
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
      
      inline def create(input: Account): js.Promise[Account] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Account]]
      
      inline def createAddress(input: Address): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAddress")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
      
      inline def createCard(input: Card): js.Promise[Card] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCard")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Card]]
      
      inline def deleteAddress(id: String): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAddress")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
      
      inline def deleteCard(id: String): js.Promise[Card] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteCard")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Card]]
      
      inline def get(): js.Promise[Account] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Account]]
      
      inline def getAddresses(input: js.Object): js.Promise[Address] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddresses")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Address]]
      
      inline def getCards(input: js.Object): js.Promise[js.Array[Card]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCards")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Card]]]
      
      inline def getOrder(id: String): js.Promise[Order] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrder")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Order]]
      
      inline def getOrders(): ResultsResponse[js.Promise[Order]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrders")().asInstanceOf[ResultsResponse[js.Promise[Order]]]
      
      inline def listAddresses(): js.Promise[js.Array[Address]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAddresses")().asInstanceOf[js.Promise[js.Array[Address]]]
      
      inline def listCards(): js.Promise[js.Array[Card]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listCards")().asInstanceOf[js.Promise[js.Array[Card]]]
      
      inline def listOrders(): ResultsResponse[js.Promise[Order]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listOrders")().asInstanceOf[ResultsResponse[js.Promise[Order]]]
      inline def listOrders(input: js.Object): ResultsResponse[js.Promise[Order]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listOrders")(input.asInstanceOf[js.Any]).asInstanceOf[ResultsResponse[js.Promise[Order]]]
      
      inline def login(user: String, password: String): js.Promise[Account | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Account | Null]]
      inline def login(user: String, password: PasswordTokenInput): js.Promise[Account | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("login")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Account | Null]]
      
      inline def logout(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[js.Promise[Any]]
      
      inline def recover(input: js.Object): js.Promise[Account] = ^.asInstanceOf[js.Dynamic].applyDynamic("recover")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Account]]
      
      inline def update(input: Account): js.Promise[Account] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Account]]
      
      inline def updateAddress(id: String, input: Address): js.Promise[Address] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateAddress")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Address]]
    }
    
    object attributes {
      
      @JSGlobal("swell.attributes")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(input: String): js.Promise[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Attribute]]
      
      inline def list(): js.Promise[ResultsResponse[Attribute]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Attribute]]]
      inline def list(input: js.Object): js.Promise[ResultsResponse[Attribute]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Attribute]]]
    }
    
    inline def auth(storeId: String, publicKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auth")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def auth(storeId: String, publicKey: String, options: InitOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auth")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object card {
      
      @JSGlobal("swell.card")
      @js.native
      val ^ : js.Any = js.native
      
      inline def createToken(input: InputCreateToken): js.Promise[TokenResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TokenResponse]]
      
      inline def validateCVC(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCVC")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def validateExpiry(month: String, year: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateExpiry")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def validateNumber(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    object cart {
      
      @JSGlobal("swell.cart")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addItem(input: CartItem): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def applyCoupon(input: String): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("applyCoupon")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def get(): js.Promise[Cart | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Cart | Null]]
      inline def get(input: String): js.Promise[Cart | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart | Null]]
      
      inline def getSettings(): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSettings")().asInstanceOf[js.Promise[Settings]]
      
      inline def getShippingRates(): js.Promise[js.Array[ShipmentRating]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getShippingRates")().asInstanceOf[js.Promise[js.Array[ShipmentRating]]]
      
      inline def recover(input: String): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("recover")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def removeCoupon(input: String): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCoupon")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def removeItem(input: String): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def setItems(input: js.Array[CartItem]): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("setItems")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def submitOrder(): js.Promise[Order] = ^.asInstanceOf[js.Dynamic].applyDynamic("submitOrder")().asInstanceOf[js.Promise[Order]]
      
      inline def update(input: js.Object): js.Promise[Cart] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cart]]
      
      inline def updateItem(id: String, input: CartItem): js.Promise[Cart] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Cart]]
    }
    
    object categories {
      
      @JSGlobal("swell.categories")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(input: String): js.Promise[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Category]]
      
      inline def list(): js.Promise[ResultsResponse[Category]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Category]]]
      inline def list(input: js.Object): js.Promise[ResultsResponse[Category]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Category]]]
    }
    
    object content {
      
      @JSGlobal("swell.content")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(`type`: String, id: String): js.Promise[Content | ResultsResponse[Content]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Content | ResultsResponse[Content]]]
      inline def get(`type`: String, id: String, query: js.Object): js.Promise[Content | ResultsResponse[Content]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Content | ResultsResponse[Content]]]
      
      inline def list(`type`: String): js.Promise[ResultsResponse[Content]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Content]]]
      inline def list(`type`: String, query: js.Object): js.Promise[ResultsResponse[Content]] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(`type`.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultsResponse[Content]]]
    }
    
    object currency {
      
      @JSGlobal("swell.currency")
      @js.native
      val ^ : js.Any = js.native
      
      inline def format(input: Double, format: FormatInput): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def list(): js.Promise[js.Array[EnabledCurrency]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[EnabledCurrency]]]
      
      inline def select(input: String): js.Promise[SelectCurrencyReturn] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SelectCurrencyReturn]]
      
      inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
    }
    
    inline def get(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    inline def init(storeId: String, publicKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def init(storeId: String, publicKey: String, options: InitOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object invoices {
      
      @JSGlobal("swell.invoices")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(id: String): js.Promise[Invoice] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Invoice]]
      
      inline def list(): js.Promise[ResultsResponse[Invoice]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Invoice]]]
    }
    
    object locale {
      
      @JSGlobal("swell.locale")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(): js.Promise[Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Locale]]
      
      inline def list(): js.Promise[js.Array[Locale]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[Locale]]]
      
      inline def select(locale: String): js.Promise[typings.swellJs.anon.Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.swellJs.anon.Locale]]
      
      inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
      
      inline def set(code: String): js.Promise[Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Locale]]
    }
    
    object payment {
      
      @JSGlobal("swell.payment")
      @js.native
      val ^ : js.Any = js.native
      
      inline def authenticate(id: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticate")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def authorizeGateway(input: Params): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("authorizeGateway")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def createElements(input: Apple): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createElements")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
      
      inline def createIntent(input: Gateway): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIntent")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def get(id: String): js.Promise[Payment] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Payment]]
      
      inline def handleRedirect(input: typings.swellJs.anon.Card): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleRedirect")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def methods(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")().asInstanceOf[js.Promise[js.Object]]
      
      inline def tokenize(input: Amazon): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("tokenize")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def updateIntent(input: Gateway): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateIntent")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    }
    
    inline def post(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    object products {
      
      @JSGlobal("swell.products")
      @js.native
      val ^ : js.Any = js.native
      
      inline def categories(products: FlexibleProductInput): js.Promise[ResultsResponse[Category]] = ^.asInstanceOf[js.Dynamic].applyDynamic("categories")(products.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Category]]]
      
      inline def filterableAttributeFilters(products: js.Array[Product]): js.Array[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterableAttributeFilters")(products.asInstanceOf[js.Any]).asInstanceOf[js.Array[Attribute]]
      inline def filterableAttributeFilters(products: js.Array[Product], options: js.Object): js.Array[Attribute] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterableAttributeFilters")(products.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Attribute]]
      
      inline def filters(products: FlexibleProductInput): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filters")(products.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
      
      inline def get(id: String): js.Promise[Product] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Product]]
      inline def get(id: String, input: ProductQuery): js.Promise[Product] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Product]]
      
      inline def list(): js.Promise[ResultsResponse[Product]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Product]]]
      inline def list(input: ProductQuery): js.Promise[ResultsResponse[Product]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Product]]]
      
      inline def priceRange(product: FlexibleProductInput): PriceRange = ^.asInstanceOf[js.Dynamic].applyDynamic("priceRange")(product.asInstanceOf[js.Any]).asInstanceOf[PriceRange]
      
      inline def variation(product: Product, options: js.Object): js.Promise[Product] = (^.asInstanceOf[js.Dynamic].applyDynamic("variation")(product.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Product]]
    }
    
    inline def put(url: String, query: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    object settings {
      
      @JSGlobal("swell.settings")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Settings]]
      inline def get(id: String): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Settings]]
      inline def get(id: String, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def get(id: String, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def get(id: String, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def get(id: Unit, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def get(id: Unit, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def get(id: Unit, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      
      inline def getCurrentLocale(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentLocale")().asInstanceOf[js.Promise[String]]
      
      inline def getStoreLocale(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoreLocale")().asInstanceOf[js.Promise[String]]
      
      inline def getStoreLocales(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoreLocales")().asInstanceOf[js.Promise[js.Array[String]]]
      
      inline def load(): js.Promise[Settings] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("load")().asInstanceOf[js.Promise[Settings] | Null]
      
      inline def menus(): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("menus")().asInstanceOf[js.Promise[Settings]]
      inline def menus(input: String): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("menus")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Settings]]
      
      inline def payments(): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("payments")().asInstanceOf[js.Promise[Settings]]
      inline def payments(id: String): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Settings]]
      inline def payments(id: String, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def payments(id: String, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def payments(id: String, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def payments(id: Unit, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def payments(id: Unit, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def payments(id: Unit, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("payments")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      
      inline def session(): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("session")().asInstanceOf[js.Promise[Settings]]
      inline def session(id: String): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Settings]]
      inline def session(id: String, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def session(id: String, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def session(id: String, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def session(id: Unit, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def session(id: Unit, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def session(id: Unit, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("session")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      
      inline def subscriptions(): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")().asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: String): js.Promise[Settings] = ^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: String, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: String, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: String, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: Unit, `def`: String): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: Unit, `def`: Double): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
      inline def subscriptions(id: Unit, `def`: Settings): js.Promise[Settings] = (^.asInstanceOf[js.Dynamic].applyDynamic("subscriptions")(id.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Settings]]
    }
    
    object subscriptions {
      
      @JSGlobal("swell.subscriptions")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addItem(id: String, input: js.Object): js.Promise[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("addItem")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Subscription]]
      
      inline def create(input: js.Object): js.Promise[Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Subscription]]
      
      inline def get(id: String): js.Promise[Subscription] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Subscription]]
      
      inline def list(): js.Promise[ResultsResponse[Subscription]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Subscription]]]
      
      inline def removeItem(id: String, itemId: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(id.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
      
      inline def update(id: String, input: js.Object): js.Promise[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Subscription]]
      
      inline def updateItem(id: String, itemId: String, input: Any): js.Promise[Subscription] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(id.asInstanceOf[js.Any], itemId.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Subscription]]
    }
  }
}
