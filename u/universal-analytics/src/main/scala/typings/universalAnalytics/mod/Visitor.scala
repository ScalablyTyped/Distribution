package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-analytics", "Visitor")
@js.native
class Visitor protected () extends js.Object {
  def this(accountID: String) = this()
  def this(accountID: VisitorOptions) = this()
  def this(accountID: String, uuid: String) = this()
  def this(accountID: String, uuid: VisitorOptions) = this()
  def this(accountID: String, uuid: String, context: StringDictionary[js.Any]) = this()
  def this(accountID: String, uuid: VisitorOptions, context: StringDictionary[js.Any]) = this()
  def this(
    accountID: String,
    uuid: String,
    context: StringDictionary[js.Any],
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

