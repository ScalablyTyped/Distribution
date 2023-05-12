package typings.swellJs

import org.scalablytyped.runtime.NumberDictionary
import typings.swellJs.anon.Amazon
import typings.swellJs.anon.Apple
import typings.swellJs.anon.End
import typings.swellJs.anon.Gateway
import typings.swellJs.anon.Params
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

object mod {
  
  @JSImport("swell-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object account {
    
    @JSImport("swell-js", "account")
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
    
    @JSImport("swell-js", "attributes")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(input: String): js.Promise[Attribute] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Attribute]]
    
    inline def list(): js.Promise[ResultsResponse[Attribute]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Attribute]]]
    inline def list(input: js.Object): js.Promise[ResultsResponse[Attribute]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Attribute]]]
  }
  
  inline def auth(storeId: String, publicKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auth")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def auth(storeId: String, publicKey: String, options: InitOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auth")(storeId.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object card {
    
    @JSImport("swell-js", "card")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createToken(input: InputCreateToken): js.Promise[TokenResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("createToken")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TokenResponse]]
    
    inline def validateCVC(code: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCVC")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def validateExpiry(month: String, year: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateExpiry")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def validateNumber(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object cart {
    
    @JSImport("swell-js", "cart")
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
    
    @JSImport("swell-js", "categories")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(input: String): js.Promise[Category] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Category]]
    
    inline def list(): js.Promise[ResultsResponse[Category]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Category]]]
    inline def list(input: js.Object): js.Promise[ResultsResponse[Category]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Category]]]
  }
  
  object content {
    
    @JSImport("swell-js", "content")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(`type`: String, id: String): js.Promise[Content | ResultsResponse[Content]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Content | ResultsResponse[Content]]]
    inline def get(`type`: String, id: String, query: js.Object): js.Promise[Content | ResultsResponse[Content]] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`type`.asInstanceOf[js.Any], id.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Content | ResultsResponse[Content]]]
    
    inline def list(`type`: String): js.Promise[ResultsResponse[Content]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultsResponse[Content]]]
    inline def list(`type`: String, query: js.Object): js.Promise[ResultsResponse[Content]] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(`type`.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResultsResponse[Content]]]
  }
  
  object currency {
    
    @JSImport("swell-js", "currency")
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
    
    @JSImport("swell-js", "invoices")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(id: String): js.Promise[Invoice] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Invoice]]
    
    inline def list(): js.Promise[ResultsResponse[Invoice]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[ResultsResponse[Invoice]]]
  }
  
  object locale {
    
    @JSImport("swell-js", "locale")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): js.Promise[Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[Locale]]
    
    inline def list(): js.Promise[js.Array[Locale]] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")().asInstanceOf[js.Promise[js.Array[Locale]]]
    
    inline def select(locale: String): js.Promise[typings.swellJs.anon.Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.swellJs.anon.Locale]]
    
    inline def selected(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("selected")().asInstanceOf[js.Promise[String]]
    
    inline def set(code: String): js.Promise[Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(code.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Locale]]
  }
  
  object payment {
    
    @JSImport("swell-js", "payment")
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
    
    @JSImport("swell-js", "products")
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
    
    @JSImport("swell-js", "settings")
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
    
    @JSImport("swell-js", "subscriptions")
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
  
  trait BaseModel extends StObject {
    
    var date_created: js.UndefOr[String] = js.undefined
    
    var date_updated: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object BaseModel {
    
    inline def apply(): BaseModel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseModel] (val x: Self) extends AnyVal {
      
      inline def setDate_created(value: String): Self = StObject.set(x, "date_created", value.asInstanceOf[js.Any])
      
      inline def setDate_createdUndefined: Self = StObject.set(x, "date_created", js.undefined)
      
      inline def setDate_updated(value: String): Self = StObject.set(x, "date_updated", value.asInstanceOf[js.Any])
      
      inline def setDate_updatedUndefined: Self = StObject.set(x, "date_updated", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait Discount extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object Discount {
    
    inline def apply(): Discount = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Discount]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Discount] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait InitOptions extends StObject {
    
    var currency: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var previewContent: js.UndefOr[Boolean] = js.undefined
    
    var session: js.UndefOr[String] = js.undefined
    
    var store: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var useCamelCase: js.UndefOr[Boolean] = js.undefined
    
    var vaultUrl: js.UndefOr[String] = js.undefined
  }
  object InitOptions {
    
    inline def apply(): InitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitOptions] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPreviewContent(value: Boolean): Self = StObject.set(x, "previewContent", value.asInstanceOf[js.Any])
      
      inline def setPreviewContentUndefined: Self = StObject.set(x, "previewContent", js.undefined)
      
      inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setStore(value: String): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseCamelCase(value: Boolean): Self = StObject.set(x, "useCamelCase", value.asInstanceOf[js.Any])
      
      inline def setUseCamelCaseUndefined: Self = StObject.set(x, "useCamelCase", js.undefined)
      
      inline def setVaultUrl(value: String): Self = StObject.set(x, "vaultUrl", value.asInstanceOf[js.Any])
      
      inline def setVaultUrlUndefined: Self = StObject.set(x, "vaultUrl", js.undefined)
    }
  }
  
  trait ProductQuery
    extends StObject
       with Query {
    
    @JSName("$filters")
    var $filters: js.UndefOr[Any] = js.undefined
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var include: js.UndefOr[js.Array[String]] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var where: js.UndefOr[js.Object] = js.undefined
  }
  object ProductQuery {
    
    inline def apply(): ProductQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductQuery] (val x: Self) extends AnyVal {
      
      inline def set$filters(value: Any): Self = StObject.set(x, "$filters", value.asInstanceOf[js.Any])
      
      inline def set$filtersUndefined: Self = StObject.set(x, "$filters", js.undefined)
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setInclude(value: js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setWhere(value: js.Object): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    }
  }
  
  trait Query extends StObject {
    
    var expand: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
  }
  object Query {
    
    inline def apply(): Query = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Query]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Query] (val x: Self) extends AnyVal {
      
      inline def setExpand(value: js.Array[String] | String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    }
  }
  
  trait ResultsResponse[T] extends StObject {
    
    var count: Double
    
    var page: Double
    
    var pages: js.UndefOr[NumberDictionary[End]] = js.undefined
    
    var results: js.Array[T]
  }
  object ResultsResponse {
    
    inline def apply[T](count: Double, page: Double, results: js.Array[T]): ResultsResponse[T] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultsResponse[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultsResponse[?], T] (val x: Self & ResultsResponse[T]) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPages(value: NumberDictionary[End]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
      
      inline def setResults(value: js.Array[T]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: T*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends / * template literal string: ${inferT}_${inferU} * / string ? / * template literal string: ${T}${Capitalize<SnakeToCamelCase<U>>} * / string : S
    }}}
    */
  type SnakeToCamelCase[S /* <: Any */] = S
  
  trait Tax extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
  }
  object Tax {
    
    inline def apply(): Tax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tax] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    }
  }
}
