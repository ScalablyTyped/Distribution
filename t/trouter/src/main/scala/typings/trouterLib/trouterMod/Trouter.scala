package typings
package trouterLib.trouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trouter[T] extends js.Object {
  def add(method: HTTPMethod, pattern: java.lang.String, handlers: T*): this.type = js.native
  def add(method: HTTPMethod, pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def all(pattern: java.lang.String, handlers: T*): this.type = js.native
  def all(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def connect(pattern: java.lang.String, handlers: T*): this.type = js.native
  def connect(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def delete(pattern: java.lang.String, handlers: T*): this.type = js.native
  def delete(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def find(method: HTTPMethod, url: java.lang.String): FindResult[T] = js.native
  def get(pattern: java.lang.String, handlers: T*): this.type = js.native
  def get(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def head(pattern: java.lang.String, handlers: T*): this.type = js.native
  def head(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def options(pattern: java.lang.String, handlers: T*): this.type = js.native
  def options(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def patch(pattern: java.lang.String, handlers: T*): this.type = js.native
  def patch(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def post(pattern: java.lang.String, handlers: T*): this.type = js.native
  def post(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def put(pattern: java.lang.String, handlers: T*): this.type = js.native
  def put(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def trace(pattern: java.lang.String, handlers: T*): this.type = js.native
  def trace(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
  def use(pattern: java.lang.String, handlers: T*): this.type = js.native
  def use(pattern: stdLib.RegExp, handlers: T*): this.type = js.native
}

