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
    all: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    checkout: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    copy: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    delete: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    get: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    head: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    lock: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    `m-search`: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    merge: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    mkactivity: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    mkcol: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    move: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    notify: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    options: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    patch: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    post: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    propfind: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    proppatch: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    put: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    redirect: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    report: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    search: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    subscribe: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    trace: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    unlock: js.Function2[java.lang.String, HttpHandler, scala.Unit],
    unsubscribe: js.Function2[java.lang.String, HttpHandler, scala.Unit]
  ): App = {
    val __obj = js.Dynamic.literal(all = all, checkout = checkout, copy = copy, delete = delete, get = get, head = head, lock = lock, merge = merge, mkactivity = mkactivity, mkcol = mkcol, move = move, notify = notify, options = options, patch = patch, post = post, propfind = propfind, proppatch = proppatch, put = put, redirect = redirect, report = report, search = search, subscribe = subscribe, trace = trace, unlock = unlock, unsubscribe = unsubscribe)
    __obj.updateDynamic("m-search")(`m-search`)
    __obj.asInstanceOf[App]
  }
}

