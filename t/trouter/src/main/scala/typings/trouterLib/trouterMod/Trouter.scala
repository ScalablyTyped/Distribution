package typings
package trouterLib.trouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trouter[T] extends js.Object {
  def add(method: HTTPMethod, pattern: java.lang.String, handlers: T*): this.type
  def all(pattern: java.lang.String, handlers: T*): this.type
  def connect(pattern: java.lang.String, handlers: T*): this.type
  def delete(pattern: java.lang.String, handlers: T*): this.type
  def find(method: HTTPMethod, url: java.lang.String): FindResult[T]
  def get(pattern: java.lang.String, handlers: T*): this.type
  def head(pattern: java.lang.String, handlers: T*): this.type
  def options(pattern: java.lang.String, handlers: T*): this.type
  def patch(pattern: java.lang.String, handlers: T*): this.type
  def post(pattern: java.lang.String, handlers: T*): this.type
  def put(pattern: java.lang.String, handlers: T*): this.type
  def trace(pattern: java.lang.String, handlers: T*): this.type
  def use(pattern: java.lang.String, handlers: T*): this.type
}

object Trouter {
  @scala.inline
  def apply[T](
    add: (HTTPMethod, java.lang.String, /* repeated */ T) => Trouter[T],
    all: (java.lang.String, /* repeated */ T) => Trouter[T],
    connect: (java.lang.String, /* repeated */ T) => Trouter[T],
    delete: (java.lang.String, /* repeated */ T) => Trouter[T],
    find: (HTTPMethod, java.lang.String) => FindResult[T],
    get: (java.lang.String, /* repeated */ T) => Trouter[T],
    head: (java.lang.String, /* repeated */ T) => Trouter[T],
    options: (java.lang.String, /* repeated */ T) => Trouter[T],
    patch: (java.lang.String, /* repeated */ T) => Trouter[T],
    post: (java.lang.String, /* repeated */ T) => Trouter[T],
    put: (java.lang.String, /* repeated */ T) => Trouter[T],
    trace: (java.lang.String, /* repeated */ T) => Trouter[T],
    use: (java.lang.String, /* repeated */ T) => Trouter[T]
  ): Trouter[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), all = js.Any.fromFunction2(all), connect = js.Any.fromFunction2(connect), delete = js.Any.fromFunction2(delete), find = js.Any.fromFunction2(find), get = js.Any.fromFunction2(get), head = js.Any.fromFunction2(head), options = js.Any.fromFunction2(options), patch = js.Any.fromFunction2(patch), post = js.Any.fromFunction2(post), put = js.Any.fromFunction2(put), trace = js.Any.fromFunction2(trace), use = js.Any.fromFunction2(use))
  
    __obj.asInstanceOf[Trouter[T]]
  }
}

