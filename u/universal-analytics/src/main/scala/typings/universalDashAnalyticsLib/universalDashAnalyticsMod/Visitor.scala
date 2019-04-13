package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-analytics", "Visitor")
@js.native
class Visitor protected () extends js.Object {
  def this(accountID: java.lang.String) = this()
  def this(accountID: VisitorOptions) = this()
  def this(accountID: java.lang.String, uuid: java.lang.String) = this()
  def this(accountID: java.lang.String, uuid: VisitorOptions) = this()
  def this(accountID: java.lang.String, uuid: java.lang.String, context: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(accountID: java.lang.String, uuid: VisitorOptions, context: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(accountID: java.lang.String, uuid: java.lang.String, context: org.scalablytyped.runtime.StringDictionary[js.Any], persistentParams: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def this(accountID: java.lang.String, uuid: VisitorOptions, context: org.scalablytyped.runtime.StringDictionary[js.Any], persistentParams: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  def debug(): Visitor = js.native
  def debug(debug: scala.Boolean): Visitor = js.native
  def e(category: java.lang.String, action: java.lang.String): Visitor = js.native
  def e(category: java.lang.String, action: java.lang.String, callback: Callback): Visitor = js.native
  def e(category: java.lang.String, action: java.lang.String, label: java.lang.String): Visitor = js.native
  def e(category: java.lang.String, action: java.lang.String, label: java.lang.String, callback: Callback): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String
  ): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String,
    params: EventParams
  ): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String,
    params: EventParams,
    callback: Callback
  ): Visitor = js.native
  def e(category: java.lang.String, action: java.lang.String, label: java.lang.String, value: scala.Double): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: scala.Double,
    params: EventParams
  ): Visitor = js.native
  def e(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: scala.Double,
    params: EventParams,
    callback: Callback
  ): Visitor = js.native
  def e(params: EventParams): Visitor = js.native
  def e(params: EventParams, callback: Callback): Visitor = js.native
  def event(category: java.lang.String, action: java.lang.String): Visitor = js.native
  def event(category: java.lang.String, action: java.lang.String, callback: Callback): Visitor = js.native
  def event(category: java.lang.String, action: java.lang.String, label: java.lang.String): Visitor = js.native
  def event(category: java.lang.String, action: java.lang.String, label: java.lang.String, callback: Callback): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String
  ): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String,
    params: EventParams
  ): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: java.lang.String,
    params: EventParams,
    callback: Callback
  ): Visitor = js.native
  def event(category: java.lang.String, action: java.lang.String, label: java.lang.String, value: scala.Double): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: scala.Double,
    params: EventParams
  ): Visitor = js.native
  def event(
    category: java.lang.String,
    action: java.lang.String,
    label: java.lang.String,
    value: scala.Double,
    params: EventParams,
    callback: Callback
  ): Visitor = js.native
  def event(params: EventParams): Visitor = js.native
  def event(params: EventParams, callback: Callback): Visitor = js.native
  def exception(description: java.lang.String): Visitor = js.native
  def exception(description: java.lang.String, callback: Callback): Visitor = js.native
  def exception(description: java.lang.String, fatal: scala.Boolean): Visitor = js.native
  def exception(description: java.lang.String, fatal: scala.Boolean, callback: Callback): Visitor = js.native
  def exception(description: java.lang.String, fatal: scala.Boolean, params: ExceptionParams): Visitor = js.native
  def exception(description: java.lang.String, fatal: scala.Boolean, params: ExceptionParams, callback: Callback): Visitor = js.native
  def exception(description: ExceptionParams): Visitor = js.native
  def exception(description: ExceptionParams, callback: Callback): Visitor = js.native
  def i(price: java.lang.String): Visitor = js.native
  def i(price: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: java.lang.String, quantity: java.lang.String): Visitor = js.native
  def i(price: java.lang.String, quantity: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: java.lang.String, quantity: java.lang.String, sku: java.lang.String): Visitor = js.native
  def i(price: java.lang.String, quantity: java.lang.String, sku: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: java.lang.String, quantity: java.lang.String, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def i(price: java.lang.String, quantity: scala.Double): Visitor = js.native
  def i(price: java.lang.String, quantity: scala.Double, callback: Callback): Visitor = js.native
  def i(price: java.lang.String, quantity: scala.Double, sku: java.lang.String): Visitor = js.native
  def i(price: java.lang.String, quantity: scala.Double, sku: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: java.lang.String, quantity: scala.Double, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def i(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def i(price: scala.Double): Visitor = js.native
  def i(price: scala.Double, callback: Callback): Visitor = js.native
  def i(price: scala.Double, quantity: java.lang.String): Visitor = js.native
  def i(price: scala.Double, quantity: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: scala.Double, quantity: java.lang.String, sku: java.lang.String): Visitor = js.native
  def i(price: scala.Double, quantity: java.lang.String, sku: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: scala.Double, quantity: java.lang.String, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def i(price: scala.Double, quantity: scala.Double): Visitor = js.native
  def i(price: scala.Double, quantity: scala.Double, callback: Callback): Visitor = js.native
  def i(price: scala.Double, quantity: scala.Double, sku: java.lang.String): Visitor = js.native
  def i(price: scala.Double, quantity: scala.Double, sku: java.lang.String, callback: Callback): Visitor = js.native
  def i(price: scala.Double, quantity: scala.Double, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def i(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def i(price: ItemParams): Visitor = js.native
  def i(price: ItemParams, callback: Callback): Visitor = js.native
  def item(price: java.lang.String): Visitor = js.native
  def item(price: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: java.lang.String, quantity: java.lang.String): Visitor = js.native
  def item(price: java.lang.String, quantity: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: java.lang.String, quantity: java.lang.String, sku: java.lang.String): Visitor = js.native
  def item(price: java.lang.String, quantity: java.lang.String, sku: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: java.lang.String, quantity: java.lang.String, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def item(price: java.lang.String, quantity: scala.Double): Visitor = js.native
  def item(price: java.lang.String, quantity: scala.Double, callback: Callback): Visitor = js.native
  def item(price: java.lang.String, quantity: scala.Double, sku: java.lang.String): Visitor = js.native
  def item(price: java.lang.String, quantity: scala.Double, sku: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: java.lang.String, quantity: scala.Double, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def item(
    price: java.lang.String,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def item(price: scala.Double): Visitor = js.native
  def item(price: scala.Double, callback: Callback): Visitor = js.native
  def item(price: scala.Double, quantity: java.lang.String): Visitor = js.native
  def item(price: scala.Double, quantity: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: scala.Double, quantity: java.lang.String, sku: java.lang.String): Visitor = js.native
  def item(price: scala.Double, quantity: java.lang.String, sku: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: scala.Double, quantity: java.lang.String, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: java.lang.String,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def item(price: scala.Double, quantity: scala.Double): Visitor = js.native
  def item(price: scala.Double, quantity: scala.Double, callback: Callback): Visitor = js.native
  def item(price: scala.Double, quantity: scala.Double, sku: java.lang.String): Visitor = js.native
  def item(price: scala.Double, quantity: scala.Double, sku: java.lang.String, callback: Callback): Visitor = js.native
  def item(price: scala.Double, quantity: scala.Double, sku: java.lang.String, name: java.lang.String): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams
  ): Visitor = js.native
  def item(
    price: scala.Double,
    quantity: scala.Double,
    sku: java.lang.String,
    name: java.lang.String,
    variation: java.lang.String,
    params: ItemParams,
    callback: Callback
  ): Visitor = js.native
  def item(price: ItemParams): Visitor = js.native
  def item(price: ItemParams, callback: Callback): Visitor = js.native
  def pageview(path: java.lang.String): Visitor = js.native
  def pageview(path: java.lang.String, callback: Callback): Visitor = js.native
  def pageview(path: java.lang.String, hostname: java.lang.String): Visitor = js.native
  def pageview(path: java.lang.String, hostname: java.lang.String, callback: Callback): Visitor = js.native
  def pageview(path: java.lang.String, hostname: java.lang.String, title: java.lang.String): Visitor = js.native
  def pageview(path: java.lang.String, hostname: java.lang.String, title: java.lang.String, callback: Callback): Visitor = js.native
  def pageview(
    path: java.lang.String,
    hostname: java.lang.String,
    title: java.lang.String,
    params: PageviewParams
  ): Visitor = js.native
  def pageview(
    path: java.lang.String,
    hostname: java.lang.String,
    title: java.lang.String,
    params: PageviewParams,
    callback: Callback
  ): Visitor = js.native
  def pageview(path: PageviewParams): Visitor = js.native
  def pageview(path: PageviewParams, callback: Callback): Visitor = js.native
  def pv(path: java.lang.String): Visitor = js.native
  def pv(path: java.lang.String, callback: Callback): Visitor = js.native
  def pv(path: java.lang.String, hostname: java.lang.String): Visitor = js.native
  def pv(path: java.lang.String, hostname: java.lang.String, callback: Callback): Visitor = js.native
  def pv(path: java.lang.String, hostname: java.lang.String, title: java.lang.String): Visitor = js.native
  def pv(path: java.lang.String, hostname: java.lang.String, title: java.lang.String, callback: Callback): Visitor = js.native
  def pv(
    path: java.lang.String,
    hostname: java.lang.String,
    title: java.lang.String,
    params: PageviewParams
  ): Visitor = js.native
  def pv(
    path: java.lang.String,
    hostname: java.lang.String,
    title: java.lang.String,
    params: PageviewParams,
    callback: Callback
  ): Visitor = js.native
  def pv(path: PageviewParams): Visitor = js.native
  def pv(path: PageviewParams, callback: Callback): Visitor = js.native
  def reset(): Visitor = js.native
  def screenview(params: ScreenviewParams): Visitor = js.native
  def screenview(params: ScreenviewParams, callback: Callback): Visitor = js.native
  def screenview(screenName: java.lang.String, appName: java.lang.String): Visitor = js.native
  def screenview(screenName: java.lang.String, appName: java.lang.String, appVersion: java.lang.String): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    appId: java.lang.String
  ): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    appId: java.lang.String,
    appInstallerId: java.lang.String
  ): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    appId: java.lang.String,
    appInstallerId: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    appId: java.lang.String,
    appInstallerId: java.lang.String,
    params: ScreenviewParams
  ): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    appId: java.lang.String,
    appInstallerId: java.lang.String,
    params: ScreenviewParams,
    callback: Callback
  ): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    appId: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def screenview(
    screenName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def screenview(screenName: java.lang.String, appName: java.lang.String, callback: Callback): Visitor = js.native
  def send(): scala.Unit = js.native
  def send(fn: js.Function3[/* error */ js.Any, /* response */ js.Any, /* body */ js.Any, scala.Unit]): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: scala.Double, value: js.Any): scala.Unit = js.native
  def t(id: java.lang.String): Visitor = js.native
  def t(id: java.lang.String, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String, tax: java.lang.String): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String, tax: scala.Double): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double, tax: java.lang.String): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double, tax: scala.Double): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String, tax: java.lang.String): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String, tax: scala.Double): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: scala.Double): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: scala.Double, callback: Callback): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: scala.Double, tax: java.lang.String): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(id: java.lang.String, revenue: scala.Double, shipping: scala.Double, tax: scala.Double): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def t(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def t(id: TransactionParams): Visitor = js.native
  def t(id: TransactionParams, callback: Callback): Visitor = js.native
  def timing(category: java.lang.String): Visitor = js.native
  def timing(category: java.lang.String, callback: Callback): Visitor = js.native
  def timing(category: java.lang.String, variable: java.lang.String): Visitor = js.native
  def timing(category: java.lang.String, variable: java.lang.String, callback: Callback): Visitor = js.native
  def timing(category: java.lang.String, variable: java.lang.String, time: java.lang.String): Visitor = js.native
  def timing(category: java.lang.String, variable: java.lang.String, time: java.lang.String, callback: Callback): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: java.lang.String,
    label: java.lang.String
  ): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: java.lang.String,
    label: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: java.lang.String,
    label: java.lang.String,
    params: TimingParams
  ): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: java.lang.String,
    label: java.lang.String,
    params: TimingParams,
    callback: Callback
  ): Visitor = js.native
  def timing(category: java.lang.String, variable: java.lang.String, time: scala.Double): Visitor = js.native
  def timing(category: java.lang.String, variable: java.lang.String, time: scala.Double, callback: Callback): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: scala.Double,
    label: java.lang.String
  ): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: scala.Double,
    label: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: scala.Double,
    label: java.lang.String,
    params: TimingParams
  ): Visitor = js.native
  def timing(
    category: java.lang.String,
    variable: java.lang.String,
    time: scala.Double,
    label: java.lang.String,
    params: TimingParams,
    callback: Callback
  ): Visitor = js.native
  def timing(category: TimingParams): Visitor = js.native
  def timing(category: TimingParams, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String): Visitor = js.native
  def transaction(id: java.lang.String, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String, tax: java.lang.String): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: java.lang.String, tax: scala.Double): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: java.lang.String,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double, tax: java.lang.String): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: java.lang.String, shipping: scala.Double, tax: scala.Double): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: java.lang.String,
    shipping: scala.Double,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String, tax: java.lang.String): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: java.lang.String, tax: scala.Double): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: java.lang.String,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: scala.Double): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: scala.Double, callback: Callback): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: scala.Double, tax: java.lang.String): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: java.lang.String, revenue: scala.Double, shipping: scala.Double, tax: scala.Double): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    affiliation: java.lang.String,
    params: TransactionParams,
    callback: Callback
  ): Visitor = js.native
  def transaction(
    id: java.lang.String,
    revenue: scala.Double,
    shipping: scala.Double,
    tax: scala.Double,
    callback: Callback
  ): Visitor = js.native
  def transaction(id: TransactionParams): Visitor = js.native
  def transaction(id: TransactionParams, callback: Callback): Visitor = js.native
}

