package typings
package atUirouterCoreLib.libCommonCoreservicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $QLike extends js.Object {
  def all(promises: ScalablyTyped.runtime.StringDictionary[stdLib.Promise[_]]): stdLib.Promise[_] = js.native
  def all(promises: js.Array[stdLib.Promise[_]]): stdLib.Promise[js.Array[_]] = js.native
  def defer(): $QLikeDeferred = js.native
  def reject[T](reason: js.Any): stdLib.Promise[T] = js.native
  def when[T](): stdLib.Promise[T] = js.native
  def when[T](value: T): stdLib.Promise[T] = js.native
  def when[T](value: stdLib.PromiseLike[T]): stdLib.Promise[T] = js.native
}

