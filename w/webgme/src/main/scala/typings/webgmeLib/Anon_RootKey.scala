package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_RootKey extends js.Object {
  def apply(rootKey: java.lang.String, paths: js.Array[java.lang.String]): js.Promise[webgmeLib.GmeStorageNs.ErrorOnlyCallback] = js.native
  def apply(
    rootKey: java.lang.String,
    paths: js.Array[java.lang.String],
    callback: webgmeLib.GmeStorageNs.ErrorOnlyCallback
  ): scala.Unit = js.native
}

