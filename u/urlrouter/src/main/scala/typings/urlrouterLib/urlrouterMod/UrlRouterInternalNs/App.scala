package typings
package urlrouterLib.urlrouterMod.UrlRouterInternalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  def all(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def checkout(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def copy(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def delete(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  // https://github.com/visionmedia/node-methods/blob/master/index.js
  def get(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def head(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def lock(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def `m-search`(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def merge(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def mkactivity(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def mkcol(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def move(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def notify(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def options(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def patch(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def post(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def propfind(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def proppatch(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def put(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def redirect(urlpattern: java.lang.String, to: java.lang.String): scala.Unit
  def report(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def search(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def subscribe(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def trace(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def unlock(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
  def unsubscribe(urlpattern: java.lang.String, handler: HttpHandler): scala.Unit
}

object App {
  @scala.inline
  def apply(
    all: (java.lang.String, HttpHandler) => scala.Unit,
    checkout: (java.lang.String, HttpHandler) => scala.Unit,
    copy: (java.lang.String, HttpHandler) => scala.Unit,
    delete: (java.lang.String, HttpHandler) => scala.Unit,
    get: (java.lang.String, HttpHandler) => scala.Unit,
    head: (java.lang.String, HttpHandler) => scala.Unit,
    lock: (java.lang.String, HttpHandler) => scala.Unit,
    `m-search`: (java.lang.String, HttpHandler) => scala.Unit,
    merge: (java.lang.String, HttpHandler) => scala.Unit,
    mkactivity: (java.lang.String, HttpHandler) => scala.Unit,
    mkcol: (java.lang.String, HttpHandler) => scala.Unit,
    move: (java.lang.String, HttpHandler) => scala.Unit,
    notify: (java.lang.String, HttpHandler) => scala.Unit,
    options: (java.lang.String, HttpHandler) => scala.Unit,
    patch: (java.lang.String, HttpHandler) => scala.Unit,
    post: (java.lang.String, HttpHandler) => scala.Unit,
    propfind: (java.lang.String, HttpHandler) => scala.Unit,
    proppatch: (java.lang.String, HttpHandler) => scala.Unit,
    put: (java.lang.String, HttpHandler) => scala.Unit,
    redirect: (java.lang.String, java.lang.String) => scala.Unit,
    report: (java.lang.String, HttpHandler) => scala.Unit,
    search: (java.lang.String, HttpHandler) => scala.Unit,
    subscribe: (java.lang.String, HttpHandler) => scala.Unit,
    trace: (java.lang.String, HttpHandler) => scala.Unit,
    unlock: (java.lang.String, HttpHandler) => scala.Unit,
    unsubscribe: (java.lang.String, HttpHandler) => scala.Unit
  ): App = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction2(all), checkout = js.Any.fromFunction2(checkout), copy = js.Any.fromFunction2(copy), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), head = js.Any.fromFunction2(head), lock = js.Any.fromFunction2(lock), merge = js.Any.fromFunction2(merge), mkactivity = js.Any.fromFunction2(mkactivity), mkcol = js.Any.fromFunction2(mkcol), move = js.Any.fromFunction2(move), notify = js.Any.fromFunction2(notify), options = js.Any.fromFunction2(options), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), propfind = js.Any.fromFunction2(propfind), proppatch = js.Any.fromFunction2(proppatch), put = js.Any.fromFunction2(put), redirect = js.Any.fromFunction2(redirect), report = js.Any.fromFunction2(report), search = js.Any.fromFunction2(search), subscribe = js.Any.fromFunction2(subscribe), trace = js.Any.fromFunction2(trace), unlock = js.Any.fromFunction2(unlock), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.updateDynamic("m-search")(js.Any.fromFunction2(`m-search`))
    __obj.asInstanceOf[App]
  }
}

