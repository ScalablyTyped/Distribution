package typings.atUirouterCore.libCommonCoreservicesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait $QLike extends js.Object {
  def all(promises: js.Array[js.Promise[_]]): js.Promise[js.Array[_]] = js.native
  def all(promises: StringDictionary[js.Promise[_]]): js.Promise[_] = js.native
  def defer(): $QLikeDeferred = js.native
  def reject[T](reason: js.Any): js.Promise[T] = js.native
  def when[T](): js.Promise[T] = js.native
  def when[T](value: T): js.Promise[T] = js.native
  def when[T](value: js.Thenable[T]): js.Promise[T] = js.native
}

