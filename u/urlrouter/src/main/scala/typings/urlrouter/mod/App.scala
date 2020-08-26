package typings.urlrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App extends js.Object {
  def all(urlpattern: String, handler: HttpHandler): Unit = js.native
  def checkout(urlpattern: String, handler: HttpHandler): Unit = js.native
  def copy(urlpattern: String, handler: HttpHandler): Unit = js.native
  def delete(urlpattern: String, handler: HttpHandler): Unit = js.native
  // https://github.com/visionmedia/node-methods/blob/master/index.js
  def get(urlpattern: String, handler: HttpHandler): Unit = js.native
  def head(urlpattern: String, handler: HttpHandler): Unit = js.native
  def lock(urlpattern: String, handler: HttpHandler): Unit = js.native
  def `m-search`(urlpattern: String, handler: HttpHandler): Unit = js.native
  def merge(urlpattern: String, handler: HttpHandler): Unit = js.native
  def mkactivity(urlpattern: String, handler: HttpHandler): Unit = js.native
  def mkcol(urlpattern: String, handler: HttpHandler): Unit = js.native
  def move(urlpattern: String, handler: HttpHandler): Unit = js.native
  def notify(urlpattern: String, handler: HttpHandler): Unit = js.native
  def options(urlpattern: String, handler: HttpHandler): Unit = js.native
  def patch(urlpattern: String, handler: HttpHandler): Unit = js.native
  def post(urlpattern: String, handler: HttpHandler): Unit = js.native
  def propfind(urlpattern: String, handler: HttpHandler): Unit = js.native
  def proppatch(urlpattern: String, handler: HttpHandler): Unit = js.native
  def put(urlpattern: String, handler: HttpHandler): Unit = js.native
  def redirect(urlpattern: String, to: String): Unit = js.native
  def report(urlpattern: String, handler: HttpHandler): Unit = js.native
  def search(urlpattern: String, handler: HttpHandler): Unit = js.native
  def subscribe(urlpattern: String, handler: HttpHandler): Unit = js.native
  def trace(urlpattern: String, handler: HttpHandler): Unit = js.native
  def unlock(urlpattern: String, handler: HttpHandler): Unit = js.native
  def unsubscribe(urlpattern: String, handler: HttpHandler): Unit = js.native
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
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAll(value: (String, HttpHandler) => Unit): Self = this.set("all", js.Any.fromFunction2(value))
    @scala.inline
    def setCheckout(value: (String, HttpHandler) => Unit): Self = this.set("checkout", js.Any.fromFunction2(value))
    @scala.inline
    def setCopy(value: (String, HttpHandler) => Unit): Self = this.set("copy", js.Any.fromFunction2(value))
    @scala.inline
    def setDelete(value: (String, HttpHandler) => Unit): Self = this.set("delete", js.Any.fromFunction2(value))
    @scala.inline
    def setGet(value: (String, HttpHandler) => Unit): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setHead(value: (String, HttpHandler) => Unit): Self = this.set("head", js.Any.fromFunction2(value))
    @scala.inline
    def setLock(value: (String, HttpHandler) => Unit): Self = this.set("lock", js.Any.fromFunction2(value))
    @scala.inline
    def `setM-search`(value: (String, HttpHandler) => Unit): Self = this.set("m-search", js.Any.fromFunction2(value))
    @scala.inline
    def setMerge(value: (String, HttpHandler) => Unit): Self = this.set("merge", js.Any.fromFunction2(value))
    @scala.inline
    def setMkactivity(value: (String, HttpHandler) => Unit): Self = this.set("mkactivity", js.Any.fromFunction2(value))
    @scala.inline
    def setMkcol(value: (String, HttpHandler) => Unit): Self = this.set("mkcol", js.Any.fromFunction2(value))
    @scala.inline
    def setMove(value: (String, HttpHandler) => Unit): Self = this.set("move", js.Any.fromFunction2(value))
    @scala.inline
    def setNotify(value: (String, HttpHandler) => Unit): Self = this.set("notify", js.Any.fromFunction2(value))
    @scala.inline
    def setOptions(value: (String, HttpHandler) => Unit): Self = this.set("options", js.Any.fromFunction2(value))
    @scala.inline
    def setPatch(value: (String, HttpHandler) => Unit): Self = this.set("patch", js.Any.fromFunction2(value))
    @scala.inline
    def setPost(value: (String, HttpHandler) => Unit): Self = this.set("post", js.Any.fromFunction2(value))
    @scala.inline
    def setPropfind(value: (String, HttpHandler) => Unit): Self = this.set("propfind", js.Any.fromFunction2(value))
    @scala.inline
    def setProppatch(value: (String, HttpHandler) => Unit): Self = this.set("proppatch", js.Any.fromFunction2(value))
    @scala.inline
    def setPut(value: (String, HttpHandler) => Unit): Self = this.set("put", js.Any.fromFunction2(value))
    @scala.inline
    def setRedirect(value: (String, String) => Unit): Self = this.set("redirect", js.Any.fromFunction2(value))
    @scala.inline
    def setReport(value: (String, HttpHandler) => Unit): Self = this.set("report", js.Any.fromFunction2(value))
    @scala.inline
    def setSearch(value: (String, HttpHandler) => Unit): Self = this.set("search", js.Any.fromFunction2(value))
    @scala.inline
    def setSubscribe(value: (String, HttpHandler) => Unit): Self = this.set("subscribe", js.Any.fromFunction2(value))
    @scala.inline
    def setTrace(value: (String, HttpHandler) => Unit): Self = this.set("trace", js.Any.fromFunction2(value))
    @scala.inline
    def setUnlock(value: (String, HttpHandler) => Unit): Self = this.set("unlock", js.Any.fromFunction2(value))
    @scala.inline
    def setUnsubscribe(value: (String, HttpHandler) => Unit): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
  }
  
}

