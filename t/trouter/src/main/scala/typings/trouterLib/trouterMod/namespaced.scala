package typings
package trouterLib.trouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trouter", JSImport.Namespace)
@js.native
class namespaced[T] () extends Trouter[T] {
  /* CompleteClass */
  override def add(method: trouterLib.trouterMod.TrouterNs.HTTPMethod, pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def all(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def connect(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def delete(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def find(method: trouterLib.trouterMod.TrouterNs.HTTPMethod, url: java.lang.String): trouterLib.trouterMod.TrouterNs.FindResult[T] = js.native
  /* CompleteClass */
  override def get(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def head(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def options(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def patch(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def post(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def put(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def trace(pattern: java.lang.String, handlers: T*): this.type = js.native
  /* CompleteClass */
  override def use(pattern: java.lang.String, handlers: T*): this.type = js.native
}

