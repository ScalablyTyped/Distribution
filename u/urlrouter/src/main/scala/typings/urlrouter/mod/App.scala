package typings.urlrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  def all(urlpattern: String, handler: HttpHandler): Unit
  def checkout(urlpattern: String, handler: HttpHandler): Unit
  def copy(urlpattern: String, handler: HttpHandler): Unit
  def delete(urlpattern: String, handler: HttpHandler): Unit
  // https://github.com/visionmedia/node-methods/blob/master/index.js
  def get(urlpattern: String, handler: HttpHandler): Unit
  def head(urlpattern: String, handler: HttpHandler): Unit
  def lock(urlpattern: String, handler: HttpHandler): Unit
  def `m-search`(urlpattern: String, handler: HttpHandler): Unit
  def merge(urlpattern: String, handler: HttpHandler): Unit
  def mkactivity(urlpattern: String, handler: HttpHandler): Unit
  def mkcol(urlpattern: String, handler: HttpHandler): Unit
  def move(urlpattern: String, handler: HttpHandler): Unit
  def notify(urlpattern: String, handler: HttpHandler): Unit
  def options(urlpattern: String, handler: HttpHandler): Unit
  def patch(urlpattern: String, handler: HttpHandler): Unit
  def post(urlpattern: String, handler: HttpHandler): Unit
  def propfind(urlpattern: String, handler: HttpHandler): Unit
  def proppatch(urlpattern: String, handler: HttpHandler): Unit
  def put(urlpattern: String, handler: HttpHandler): Unit
  def redirect(urlpattern: String, to: String): Unit
  def report(urlpattern: String, handler: HttpHandler): Unit
  def search(urlpattern: String, handler: HttpHandler): Unit
  def subscribe(urlpattern: String, handler: HttpHandler): Unit
  def trace(urlpattern: String, handler: HttpHandler): Unit
  def unlock(urlpattern: String, handler: HttpHandler): Unit
  def unsubscribe(urlpattern: String, handler: HttpHandler): Unit
}

object App {
  @scala.inline
  def apply(
    all: (String, HttpHandler) => Unit,
    checkout: (String, HttpHandler) => Unit,
    copy: (String, HttpHandler) => Unit,
    delete: (String, HttpHandler) => Unit,
    get: (String, HttpHandler) => Unit,
    head: (String, HttpHandler) => Unit,
    lock: (String, HttpHandler) => Unit,
    `m-search`: (String, HttpHandler) => Unit,
    merge: (String, HttpHandler) => Unit,
    mkactivity: (String, HttpHandler) => Unit,
    mkcol: (String, HttpHandler) => Unit,
    move: (String, HttpHandler) => Unit,
    notify: (String, HttpHandler) => Unit,
    options: (String, HttpHandler) => Unit,
    patch: (String, HttpHandler) => Unit,
    post: (String, HttpHandler) => Unit,
    propfind: (String, HttpHandler) => Unit,
    proppatch: (String, HttpHandler) => Unit,
    put: (String, HttpHandler) => Unit,
    redirect: (String, String) => Unit,
    report: (String, HttpHandler) => Unit,
    search: (String, HttpHandler) => Unit,
    subscribe: (String, HttpHandler) => Unit,
    trace: (String, HttpHandler) => Unit,
    unlock: (String, HttpHandler) => Unit,
    unsubscribe: (String, HttpHandler) => Unit
  ): App = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction2(all), checkout = js.Any.fromFunction2(checkout), copy = js.Any.fromFunction2(copy), delete = js.Any.fromFunction2(delete), get = js.Any.fromFunction2(get), head = js.Any.fromFunction2(head), lock = js.Any.fromFunction2(lock), merge = js.Any.fromFunction2(merge), mkactivity = js.Any.fromFunction2(mkactivity), mkcol = js.Any.fromFunction2(mkcol), move = js.Any.fromFunction2(move), notify = js.Any.fromFunction2(notify), options = js.Any.fromFunction2(options), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), propfind = js.Any.fromFunction2(propfind), proppatch = js.Any.fromFunction2(proppatch), put = js.Any.fromFunction2(put), redirect = js.Any.fromFunction2(redirect), report = js.Any.fromFunction2(report), search = js.Any.fromFunction2(search), subscribe = js.Any.fromFunction2(subscribe), trace = js.Any.fromFunction2(trace), unlock = js.Any.fromFunction2(unlock), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.updateDynamic("m-search")(js.Any.fromFunction2(`m-search`))
    __obj.asInstanceOf[App]
  }
}

