package typings.universalAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("universal-analytics", JSImport.Namespace)
  @js.native
  def apply(accountID: String): Visitor = js.native
  @JSImport("universal-analytics", JSImport.Namespace)
  @js.native
  def apply(accountID: String, uuid: String): Visitor = js.native
  @JSImport("universal-analytics", JSImport.Namespace)
  @js.native
  def apply(accountID: String, uuid: String, options: VisitorOptions): Visitor = js.native
  @JSImport("universal-analytics", JSImport.Namespace)
  @js.native
  def apply(accountID: String, uuid: VisitorOptions): Visitor = js.native
  @JSImport("universal-analytics", JSImport.Namespace)
  @js.native
  def apply(accountID: VisitorOptions): Visitor = js.native
  
  @JSImport("universal-analytics", "Visitor")
  @js.native
  class Visitor protected () extends StObject {
    def this(accountID: String) = this()
    def this(accountID: VisitorOptions) = this()
    def this(accountID: String, uuid: String) = this()
    def this(accountID: String, uuid: VisitorOptions) = this()
    def this(accountID: String, uuid: String, context: StringDictionary[js.Any]) = this()
    def this(accountID: String, uuid: VisitorOptions, context: StringDictionary[js.Any]) = this()
    def this(
      accountID: String,
      uuid: String,
      context: js.UndefOr[scala.Nothing],
      persistentParams: StringDictionary[js.Any]
    ) = this()
    def this(
      accountID: String,
      uuid: String,
      context: StringDictionary[js.Any],
      persistentParams: StringDictionary[js.Any]
    ) = this()
    def this(
      accountID: String,
      uuid: VisitorOptions,
      context: js.UndefOr[scala.Nothing],
      persistentParams: StringDictionary[js.Any]
    ) = this()
    def this(
      accountID: String,
      uuid: VisitorOptions,
      context: StringDictionary[js.Any],
      persistentParams: StringDictionary[js.Any]
    ) = this()
    
    def debug(): Visitor = js.native
    def debug(debug: Boolean): Visitor = js.native
    
    def e(category: String, action: String): Visitor = js.native
    def e(category: String, action: String, callback: Callback): Visitor = js.native
    def e(category: String, action: String, label: String): Visitor = js.native
    def e(category: String, action: String, label: String, callback: Callback): Visitor = js.native
    def e(category: String, action: String, label: String, value: String): Visitor = js.native
    def e(category: String, action: String, label: String, value: String, callback: Callback): Visitor = js.native
    def e(category: String, action: String, label: String, value: String, params: EventParams): Visitor = js.native
    def e(
      category: String,
      action: String,
      label: String,
      value: String,
      params: EventParams,
      callback: Callback
    ): Visitor = js.native
    def e(category: String, action: String, label: String, value: Double): Visitor = js.native
    def e(category: String, action: String, label: String, value: Double, callback: Callback): Visitor = js.native
    def e(category: String, action: String, label: String, value: Double, params: EventParams): Visitor = js.native
    def e(
      category: String,
      action: String,
      label: String,
      value: Double,
      params: EventParams,
      callback: Callback
    ): Visitor = js.native
    def e(params: EventParams): Visitor = js.native
    def e(params: EventParams, callback: Callback): Visitor = js.native
    
    def event(category: String, action: String): Visitor = js.native
    def event(category: String, action: String, callback: Callback): Visitor = js.native
    def event(category: String, action: String, label: String): Visitor = js.native
    def event(category: String, action: String, label: String, callback: Callback): Visitor = js.native
    def event(category: String, action: String, label: String, value: String): Visitor = js.native
    def event(category: String, action: String, label: String, value: String, callback: Callback): Visitor = js.native
    def event(category: String, action: String, label: String, value: String, params: EventParams): Visitor = js.native
    def event(
      category: String,
      action: String,
      label: String,
      value: String,
      params: EventParams,
      callback: Callback
    ): Visitor = js.native
    def event(category: String, action: String, label: String, value: Double): Visitor = js.native
    def event(category: String, action: String, label: String, value: Double, callback: Callback): Visitor = js.native
    def event(category: String, action: String, label: String, value: Double, params: EventParams): Visitor = js.native
    def event(
      category: String,
      action: String,
      label: String,
      value: Double,
      params: EventParams,
      callback: Callback
    ): Visitor = js.native
    def event(params: EventParams): Visitor = js.native
    def event(params: EventParams, callback: Callback): Visitor = js.native
    
    def exception(description: String): Visitor = js.native
    def exception(description: String, callback: Callback): Visitor = js.native
    def exception(description: String, fatal: Boolean): Visitor = js.native
    def exception(description: String, fatal: Boolean, callback: Callback): Visitor = js.native
    def exception(description: String, fatal: Boolean, params: ExceptionParams): Visitor = js.native
    def exception(description: String, fatal: Boolean, params: ExceptionParams, callback: Callback): Visitor = js.native
    def exception(description: ExceptionParams): Visitor = js.native
    def exception(description: ExceptionParams, callback: Callback): Visitor = js.native
    
    def i(price: String): Visitor = js.native
    def i(price: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: String): Visitor = js.native
    def i(price: String, quantity: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: String, sku: String): Visitor = js.native
    def i(price: String, quantity: String, sku: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: String, sku: String, name: String): Visitor = js.native
    def i(price: String, quantity: String, sku: String, name: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: String, sku: String, name: String, variation: String): Visitor = js.native
    def i(price: String, quantity: String, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: String, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def i(
      price: String,
      quantity: String,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def i(price: String, quantity: Double): Visitor = js.native
    def i(price: String, quantity: Double, callback: Callback): Visitor = js.native
    def i(price: String, quantity: Double, sku: String): Visitor = js.native
    def i(price: String, quantity: Double, sku: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: Double, sku: String, name: String): Visitor = js.native
    def i(price: String, quantity: Double, sku: String, name: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: Double, sku: String, name: String, variation: String): Visitor = js.native
    def i(price: String, quantity: Double, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def i(price: String, quantity: Double, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def i(
      price: String,
      quantity: Double,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def i(price: Double): Visitor = js.native
    def i(price: Double, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: String): Visitor = js.native
    def i(price: Double, quantity: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: String, sku: String): Visitor = js.native
    def i(price: Double, quantity: String, sku: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: String, sku: String, name: String): Visitor = js.native
    def i(price: Double, quantity: String, sku: String, name: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: String, sku: String, name: String, variation: String): Visitor = js.native
    def i(price: Double, quantity: String, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: String, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def i(
      price: Double,
      quantity: String,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def i(price: Double, quantity: Double): Visitor = js.native
    def i(price: Double, quantity: Double, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String, name: String): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String, name: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String, name: String, variation: String): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def i(price: Double, quantity: Double, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def i(
      price: Double,
      quantity: Double,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def i(price: ItemParams): Visitor = js.native
    def i(price: ItemParams, callback: Callback): Visitor = js.native
    
    def item(price: String): Visitor = js.native
    def item(price: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: String): Visitor = js.native
    def item(price: String, quantity: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: String, sku: String): Visitor = js.native
    def item(price: String, quantity: String, sku: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: String, sku: String, name: String): Visitor = js.native
    def item(price: String, quantity: String, sku: String, name: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: String, sku: String, name: String, variation: String): Visitor = js.native
    def item(price: String, quantity: String, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: String, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def item(
      price: String,
      quantity: String,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def item(price: String, quantity: Double): Visitor = js.native
    def item(price: String, quantity: Double, callback: Callback): Visitor = js.native
    def item(price: String, quantity: Double, sku: String): Visitor = js.native
    def item(price: String, quantity: Double, sku: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: Double, sku: String, name: String): Visitor = js.native
    def item(price: String, quantity: Double, sku: String, name: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: Double, sku: String, name: String, variation: String): Visitor = js.native
    def item(price: String, quantity: Double, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def item(price: String, quantity: Double, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def item(
      price: String,
      quantity: Double,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def item(price: Double): Visitor = js.native
    def item(price: Double, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: String): Visitor = js.native
    def item(price: Double, quantity: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: String, sku: String): Visitor = js.native
    def item(price: Double, quantity: String, sku: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: String, sku: String, name: String): Visitor = js.native
    def item(price: Double, quantity: String, sku: String, name: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: String, sku: String, name: String, variation: String): Visitor = js.native
    def item(price: Double, quantity: String, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: String, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def item(
      price: Double,
      quantity: String,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def item(price: Double, quantity: Double): Visitor = js.native
    def item(price: Double, quantity: Double, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String, name: String): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String, name: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String, name: String, variation: String): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String, name: String, variation: String, callback: Callback): Visitor = js.native
    def item(price: Double, quantity: Double, sku: String, name: String, variation: String, params: ItemParams): Visitor = js.native
    def item(
      price: Double,
      quantity: Double,
      sku: String,
      name: String,
      variation: String,
      params: ItemParams,
      callback: Callback
    ): Visitor = js.native
    def item(price: ItemParams): Visitor = js.native
    def item(price: ItemParams, callback: Callback): Visitor = js.native
    
    def pageview(path: String): Visitor = js.native
    def pageview(path: String, callback: Callback): Visitor = js.native
    def pageview(path: String, hostname: String): Visitor = js.native
    def pageview(path: String, hostname: String, callback: Callback): Visitor = js.native
    def pageview(path: String, hostname: String, title: String): Visitor = js.native
    def pageview(path: String, hostname: String, title: String, callback: Callback): Visitor = js.native
    def pageview(path: String, hostname: String, title: String, params: PageviewParams): Visitor = js.native
    def pageview(path: String, hostname: String, title: String, params: PageviewParams, callback: Callback): Visitor = js.native
    def pageview(path: PageviewParams): Visitor = js.native
    def pageview(path: PageviewParams, callback: Callback): Visitor = js.native
    
    def pv(path: String): Visitor = js.native
    def pv(path: String, callback: Callback): Visitor = js.native
    def pv(path: String, hostname: String): Visitor = js.native
    def pv(path: String, hostname: String, callback: Callback): Visitor = js.native
    def pv(path: String, hostname: String, title: String): Visitor = js.native
    def pv(path: String, hostname: String, title: String, callback: Callback): Visitor = js.native
    def pv(path: String, hostname: String, title: String, params: PageviewParams): Visitor = js.native
    def pv(path: String, hostname: String, title: String, params: PageviewParams, callback: Callback): Visitor = js.native
    def pv(path: PageviewParams): Visitor = js.native
    def pv(path: PageviewParams, callback: Callback): Visitor = js.native
    
    def reset(): Visitor = js.native
    
    def screenview(params: ScreenviewParams): Visitor = js.native
    def screenview(params: ScreenviewParams, callback: Callback): Visitor = js.native
    def screenview(screenName: String, appName: String): Visitor = js.native
    def screenview(screenName: String, appName: String, appVersion: String): Visitor = js.native
    def screenview(screenName: String, appName: String, appVersion: String, appId: String): Visitor = js.native
    def screenview(screenName: String, appName: String, appVersion: String, appId: String, appInstallerId: String): Visitor = js.native
    def screenview(
      screenName: String,
      appName: String,
      appVersion: String,
      appId: String,
      appInstallerId: String,
      callback: Callback
    ): Visitor = js.native
    def screenview(
      screenName: String,
      appName: String,
      appVersion: String,
      appId: String,
      appInstallerId: String,
      params: ScreenviewParams
    ): Visitor = js.native
    def screenview(
      screenName: String,
      appName: String,
      appVersion: String,
      appId: String,
      appInstallerId: String,
      params: ScreenviewParams,
      callback: Callback
    ): Visitor = js.native
    def screenview(screenName: String, appName: String, appVersion: String, appId: String, callback: Callback): Visitor = js.native
    def screenview(screenName: String, appName: String, appVersion: String, callback: Callback): Visitor = js.native
    def screenview(screenName: String, appName: String, callback: Callback): Visitor = js.native
    
    def send(): Unit = js.native
    def send(fn: js.Function3[/* error */ js.Any, /* response */ js.Any, /* body */ js.Any, Unit]): Unit = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: Double, value: js.Any): Unit = js.native
    
    def t(id: String): Visitor = js.native
    def t(id: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String): Visitor = js.native
    def t(id: String, revenue: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String, shipping: String): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, tax: String): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, tax: String, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: String,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, tax: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, tax: Double): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, tax: Double, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: String,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: String, shipping: String, tax: Double, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, tax: String): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, tax: String, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: Double,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, tax: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, tax: Double): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, tax: Double, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: Double,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: String,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: String, shipping: Double, tax: Double, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double): Visitor = js.native
    def t(id: String, revenue: Double, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, tax: String): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, tax: String, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: String,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, tax: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, tax: Double): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, tax: Double, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: String,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: Double, shipping: String, tax: Double, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, tax: String): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, tax: String, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, tax: String, callback: Callback): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, tax: Double): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, tax: Double, affiliation: String): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def t(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def t(id: String, revenue: Double, shipping: Double, tax: Double, callback: Callback): Visitor = js.native
    def t(id: TransactionParams): Visitor = js.native
    def t(id: TransactionParams, callback: Callback): Visitor = js.native
    
    def timing(category: String): Visitor = js.native
    def timing(category: String, callback: Callback): Visitor = js.native
    def timing(category: String, variable: String): Visitor = js.native
    def timing(category: String, variable: String, callback: Callback): Visitor = js.native
    def timing(category: String, variable: String, time: String): Visitor = js.native
    def timing(category: String, variable: String, time: String, callback: Callback): Visitor = js.native
    def timing(category: String, variable: String, time: String, label: String): Visitor = js.native
    def timing(category: String, variable: String, time: String, label: String, callback: Callback): Visitor = js.native
    def timing(category: String, variable: String, time: String, label: String, params: TimingParams): Visitor = js.native
    def timing(
      category: String,
      variable: String,
      time: String,
      label: String,
      params: TimingParams,
      callback: Callback
    ): Visitor = js.native
    def timing(category: String, variable: String, time: Double): Visitor = js.native
    def timing(category: String, variable: String, time: Double, callback: Callback): Visitor = js.native
    def timing(category: String, variable: String, time: Double, label: String): Visitor = js.native
    def timing(category: String, variable: String, time: Double, label: String, callback: Callback): Visitor = js.native
    def timing(category: String, variable: String, time: Double, label: String, params: TimingParams): Visitor = js.native
    def timing(
      category: String,
      variable: String,
      time: Double,
      label: String,
      params: TimingParams,
      callback: Callback
    ): Visitor = js.native
    def timing(category: TimingParams): Visitor = js.native
    def timing(category: TimingParams, callback: Callback): Visitor = js.native
    
    def transaction(id: String): Visitor = js.native
    def transaction(id: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String): Visitor = js.native
    def transaction(id: String, revenue: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, tax: String): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, tax: String, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: String,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, tax: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, tax: Double): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, tax: Double, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: String,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: String, tax: Double, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, tax: String): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, tax: String, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: Double,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, tax: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, tax: Double): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, tax: Double, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: Double,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: String,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: String, shipping: Double, tax: Double, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double): Visitor = js.native
    def transaction(id: String, revenue: Double, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, tax: String): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, tax: String, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: String,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: String,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, tax: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, tax: Double): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, tax: Double, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: String,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: String,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: String, tax: Double, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, tax: String): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, tax: String, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: String,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: String,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, tax: String, callback: Callback): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, tax: Double): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, tax: Double, affiliation: String): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: Double,
      affiliation: String,
      callback: Callback
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams
    ): Visitor = js.native
    def transaction(
      id: String,
      revenue: Double,
      shipping: Double,
      tax: Double,
      affiliation: String,
      params: TransactionParams,
      callback: Callback
    ): Visitor = js.native
    def transaction(id: String, revenue: Double, shipping: Double, tax: Double, callback: Callback): Visitor = js.native
    def transaction(id: TransactionParams): Visitor = js.native
    def transaction(id: TransactionParams, callback: Callback): Visitor = js.native
  }
  
  @JSImport("universal-analytics", "createFromSession")
  @js.native
  def createFromSession(): Visitor = js.native
  @JSImport("universal-analytics", "createFromSession")
  @js.native
  def createFromSession(session: Session): Visitor = js.native
  
  @JSImport("universal-analytics", "middleware")
  @js.native
  def middleware(tid: String): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, Unit], 
    Unit
  ] = js.native
  @JSImport("universal-analytics", "middleware")
  @js.native
  def middleware(tid: String, options: MiddlewareOptions): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, Unit], 
    Unit
  ] = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* count */ Double, Unit]
  
  @js.native
  trait EventParams
    extends /* key */ StringDictionary[js.Any] {
    
    var dp: js.UndefOr[String] = js.native
    
    /**
      * Event Action
      *
      * **Required for event hit type.**
      *
      * Specifies the event action. Must not be empty.
      *
      * Max length: 500 Bytes
      *
      * Example value: `Action`
      */
    var ea: js.UndefOr[String] = js.native
    
    /**
      * Event Category
      *
      * **Required for event hit type.**
      *
      * Specifies the event category. Must not be empty.
      *
      * Max length: 150 Bytes
      *
      * Example value: `Category`
      */
    var ec: js.UndefOr[String] = js.native
    
    /**
      * Event Label
      *
      * Specifies the event label.
      *
      * Max length: 500 Bytes
      *
      * Example value: `Label`
      */
    var el: js.UndefOr[String] = js.native
    
    /**
      * Event Value
      *
      * Specifies the event value. Values must be non-negative.
      *
      * Example value: `55`
      */
    var ev: js.UndefOr[String | Double] = js.native
    
    var p: js.UndefOr[String] = js.native
  }
  object EventParams {
    
    @scala.inline
    def apply(): EventParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventParams]
    }
    
    @scala.inline
    implicit class EventParamsMutableBuilder[Self <: EventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
      
      @scala.inline
      def setEa(value: String): Self = StObject.set(x, "ea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaUndefined: Self = StObject.set(x, "ea", js.undefined)
      
      @scala.inline
      def setEc(value: String): Self = StObject.set(x, "ec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcUndefined: Self = StObject.set(x, "ec", js.undefined)
      
      @scala.inline
      def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      @scala.inline
      def setEv(value: String | Double): Self = StObject.set(x, "ev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvUndefined: Self = StObject.set(x, "ev", js.undefined)
      
      @scala.inline
      def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
    }
  }
  
  @js.native
  trait ExceptionParams
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Exception Description
      *
      * Specifies the description of an exception.
      *
      * Max length: 150 Bytes
      *
      * Example value: `DatabaseError`
      */
    var exd: js.UndefOr[String] = js.native
    
    /**
      * Is Exception Fatal?
      *
      * Specifies whether the exception was fatal.
      */
    var exf: js.UndefOr[Boolean] = js.native
  }
  object ExceptionParams {
    
    @scala.inline
    def apply(): ExceptionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExceptionParams]
    }
    
    @scala.inline
    implicit class ExceptionParamsMutableBuilder[Self <: ExceptionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExd(value: String): Self = StObject.set(x, "exd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExdUndefined: Self = StObject.set(x, "exd", js.undefined)
      
      @scala.inline
      def setExf(value: Boolean): Self = StObject.set(x, "exf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExfUndefined: Self = StObject.set(x, "exf", js.undefined)
    }
  }
  
  @js.native
  trait ItemParams
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Item Code
      *
      * Specifies the SKU or item code.
      *
      * Max length: 500 Bytes
      *
      * Example value: `SKU47`
      */
    var ic: js.UndefOr[String] = js.native
    
    /**
      * Item Name
      *
      * **Required for item hit type.**
      *
      * Specifies the item name.
      *
      * Max length: 500 Bytes
      *
      * Example value: `Shoe`
      */
    var in: js.UndefOr[String] = js.native
    
    /**
      * Item Price
      *
      * Specifies the price for a single item / unit.
      *
      * Example value: `3.50`
      */
    var ip: js.UndefOr[String | Double] = js.native
    
    /**
      * Item Quantity
      *
      * Specifies the number of items purchased.
      *
      * Example value: `4`
      */
    var iq: js.UndefOr[String | Double] = js.native
    
    /**
      * Item Category
      *
      * Specifies the category that the item belongs to.
      *
      * Max length: 500 Bytes
      *
      * Example value: `Blue`
      */
    var iv: js.UndefOr[String] = js.native
    
    var p: js.UndefOr[String] = js.native
    
    /**
      * Transaction ID
      *
      * **Required for item hit type.**
      *
      * A unique identifier for the transaction. This value should be the same for both the Transaction
      * hit and Items hits associated to the particular transaction.
      *
      * Max length: 500 Bytes
      *
      * Example value: `OD564`
      */
    var ti: js.UndefOr[String] = js.native
  }
  object ItemParams {
    
    @scala.inline
    def apply(): ItemParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemParams]
    }
    
    @scala.inline
    implicit class ItemParamsMutableBuilder[Self <: ItemParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIc(value: String): Self = StObject.set(x, "ic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcUndefined: Self = StObject.set(x, "ic", js.undefined)
      
      @scala.inline
      def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setIp(value: String | Double): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setIq(value: String | Double): Self = StObject.set(x, "iq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIqUndefined: Self = StObject.set(x, "iq", js.undefined)
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
      
      @scala.inline
      def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setTi(value: String): Self = StObject.set(x, "ti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiUndefined: Self = StObject.set(x, "ti", js.undefined)
    }
  }
  
  @js.native
  trait MiddlewareOptions extends VisitorOptions {
    
    var cookieName: js.UndefOr[String] = js.native
  }
  object MiddlewareOptions {
    
    @scala.inline
    def apply(): MiddlewareOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareOptions]
    }
    
    @scala.inline
    implicit class MiddlewareOptionsMutableBuilder[Self <: MiddlewareOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
    }
  }
  
  @js.native
  trait PageviewParams
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Document Host Name
      *
      * Specifies the hostname from which content was hosted.
      *
      * Max length: 100 Bytes
      */
    var dh: js.UndefOr[String] = js.native
    
    /**
      * Document location URL
      *
      * Use this parameter to send the full URL (document location) of the page on which content resides.
      *
      * Max length: 2048 Bytes
      */
    var dl: js.UndefOr[String] = js.native
    
    /**
      * Document Path
      *
      * The path portion of the page URL. Should begin with '/'.
      *
      * Max length: 2048 Bytes
      */
    var dp: js.UndefOr[String] = js.native
    
    /**
      * Document Title
      *
      * The title of the page / document.
      *
      * Max length: 1500 Bytes
      */
    var dt: js.UndefOr[String] = js.native
  }
  object PageviewParams {
    
    @scala.inline
    def apply(): PageviewParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageviewParams]
    }
    
    @scala.inline
    implicit class PageviewParamsMutableBuilder[Self <: PageviewParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDh(value: String): Self = StObject.set(x, "dh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhUndefined: Self = StObject.set(x, "dh", js.undefined)
      
      @scala.inline
      def setDl(value: String): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
      
      @scala.inline
      def setDp(value: String): Self = StObject.set(x, "dp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpUndefined: Self = StObject.set(x, "dp", js.undefined)
      
      @scala.inline
      def setDt(value: String): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
    }
  }
  
  @js.native
  trait ScreenviewParams
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Application ID
      *
      * Application identifier.
      *
      * Max length: 150 Bytes
      *
      * Example value: `com.company.app`
      */
    var aid: js.UndefOr[String] = js.native
    
    /**
      * Application Installer ID
      *
      * Application installer identifier.
      *
      * Max length: 150 Bytes
      *
      * Example value: `com.platform.vending`
      */
    var aiid: js.UndefOr[String] = js.native
    
    /**
      * Application Name
      *
      * Specifies the application name. This field is required for any hit that has app related data
      * (i.e., app version, app ID, or app installer ID). For hits sent to web properties, this field is optional.
      *
      * Max length: 100 Bytes
      *
      * Example value: `My App`
      */
    var an: js.UndefOr[String] = js.native
    
    /**
      * Application Version
      *
      * Specifies the application version.
      *
      * Max length: 100 Bytes
      *
      * Example value: `1.2`
      */
    var av: js.UndefOr[String] = js.native
    
    /**
      * Screen Name
      *
      * This parameter is optional on web properties, and required on mobile properties for screenview hits,
      * where it is used for the 'Screen Name' of the screenview hit.
      *
      * Max length: 2048 Bytes
      *
      * Example value: `High Scores`
      */
    var cd: js.UndefOr[String] = js.native
  }
  object ScreenviewParams {
    
    @scala.inline
    def apply(): ScreenviewParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScreenviewParams]
    }
    
    @scala.inline
    implicit class ScreenviewParamsMutableBuilder[Self <: ScreenviewParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAid(value: String): Self = StObject.set(x, "aid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAidUndefined: Self = StObject.set(x, "aid", js.undefined)
      
      @scala.inline
      def setAiid(value: String): Self = StObject.set(x, "aiid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAiidUndefined: Self = StObject.set(x, "aiid", js.undefined)
      
      @scala.inline
      def setAn(value: String): Self = StObject.set(x, "an", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnUndefined: Self = StObject.set(x, "an", js.undefined)
      
      @scala.inline
      def setAv(value: String): Self = StObject.set(x, "av", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvUndefined: Self = StObject.set(x, "av", js.undefined)
      
      @scala.inline
      def setCd(value: String): Self = StObject.set(x, "cd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdUndefined: Self = StObject.set(x, "cd", js.undefined)
    }
  }
  
  @js.native
  trait Session extends StObject {
    
    /**
      * Client ID
      */
    var cid: js.UndefOr[String] = js.native
  }
  object Session {
    
    @scala.inline
    def apply(): Session = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    }
  }
  
  @js.native
  trait TimingParams
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * User timing category
      *
      * **Required for timing hit type.**
      *
      * Specifies the user timing category.
      *
      * Max length: 150 Bytes
      *
      * Example value: `category`
      */
    var utc: js.UndefOr[String] = js.native
    
    /**
      * User timing label
      *
      * Specifies the user timing label.
      *
      * Max length: 500 Bytes
      *
      * Example value: `label`
      */
    var utl: js.UndefOr[String] = js.native
    
    /**
      * User timing time
      *
      * **Required for timing hit type.**
      *
      * Specifies the user timing value. The value is in milliseconds.
      *
      * Example value: `123`
      */
    var utt: js.UndefOr[String | Double] = js.native
    
    /**
      * User timing variable name
      *
      * **Required for timing hit type.**
      *
      * Specifies the user timing variable.
      *
      * Max length: 500 Bytes
      *
      * Example value: `lookup`
      */
    var utv: js.UndefOr[String] = js.native
  }
  object TimingParams {
    
    @scala.inline
    def apply(): TimingParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimingParams]
    }
    
    @scala.inline
    implicit class TimingParamsMutableBuilder[Self <: TimingParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUtc(value: String): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
      
      @scala.inline
      def setUtl(value: String): Self = StObject.set(x, "utl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtlUndefined: Self = StObject.set(x, "utl", js.undefined)
      
      @scala.inline
      def setUtt(value: String | Double): Self = StObject.set(x, "utt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUttUndefined: Self = StObject.set(x, "utt", js.undefined)
      
      @scala.inline
      def setUtv(value: String): Self = StObject.set(x, "utv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtvUndefined: Self = StObject.set(x, "utv", js.undefined)
    }
  }
  
  @js.native
  trait TransactionParams
    extends /* key */ StringDictionary[js.Any] {
    
    var p: js.UndefOr[String] = js.native
    
    /**
      * Transaction Affiliation
      *
      * Specifies the affiliation or store name.
      *
      * Max length: 500 Bytes
      *
      * Example value: `Member`
      */
    var ta: js.UndefOr[String] = js.native
    
    /**
      * Transaction ID
      *
      * **Required for transaction hit type.**
      *
      *
      * A unique identifier for the transaction. This value should be the same for both the Transaction
      * hit and Items hits associated to the particular transaction.
      *
      * Max length: 500 Bytes
      *
      * Example value: `OD564`
      */
    var ti: js.UndefOr[String] = js.native
    
    /**
      * Transaction Revenue
      *
      * Specifies the total revenue associated with the transaction. This value should include any
      * shipping or tax costs.
      *
      * Example value: `15.47`
      */
    var tr: js.UndefOr[String | Double] = js.native
    
    /**
      * Transaction Shipping
      *
      * Specifies the total shipping cost of the transaction.
      *
      * Example value: `3.50`
      */
    var ts: js.UndefOr[String | Double] = js.native
    
    /**
      * Transaction Tax
      *
      * Specifies the total tax of the transaction.
      *
      * Example value: `11.20`
      */
    var tt: js.UndefOr[String | Double] = js.native
  }
  object TransactionParams {
    
    @scala.inline
    def apply(): TransactionParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionParams]
    }
    
    @scala.inline
    implicit class TransactionParamsMutableBuilder[Self <: TransactionParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setTa(value: String): Self = StObject.set(x, "ta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaUndefined: Self = StObject.set(x, "ta", js.undefined)
      
      @scala.inline
      def setTi(value: String): Self = StObject.set(x, "ti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiUndefined: Self = StObject.set(x, "ti", js.undefined)
      
      @scala.inline
      def setTr(value: String | Double): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      @scala.inline
      def setTs(value: String | Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      @scala.inline
      def setTt(value: String | Double): Self = StObject.set(x, "tt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtUndefined: Self = StObject.set(x, "tt", js.undefined)
    }
  }
  
  @js.native
  trait VisitorOptions extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.native
    
    /**
      * Client ID
      */
    var cid: js.UndefOr[String] = js.native
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var enableBatching: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var hostname: js.UndefOr[String] = js.native
    
    var https: js.UndefOr[Boolean] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var requestOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var strictCidFormat: js.UndefOr[Boolean] = js.native
    
    /**
      * Tracking ID
      */
    var tid: js.UndefOr[String] = js.native
    
    /**
      * User ID
      */
    var uid: js.UndefOr[String] = js.native
  }
  object VisitorOptions {
    
    @scala.inline
    def apply(): VisitorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisitorOptions]
    }
    
    @scala.inline
    implicit class VisitorOptionsMutableBuilder[Self <: VisitorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setEnableBatching(value: Boolean): Self = StObject.set(x, "enableBatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableBatchingUndefined: Self = StObject.set(x, "enableBatching", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRequestOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
      
      @scala.inline
      def setStrictCidFormat(value: Boolean): Self = StObject.set(x, "strictCidFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictCidFormatUndefined: Self = StObject.set(x, "strictCidFormat", js.undefined)
      
      @scala.inline
      def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
