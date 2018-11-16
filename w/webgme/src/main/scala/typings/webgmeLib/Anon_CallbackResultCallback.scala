package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackResultCallback extends js.Object {
  /** On success the promise will be resolved with Object.module:Storage~CommitHash> result. */
  def apply(): stdLib.Promise[webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeStorageNs.CommitHash]] = js.native
  /** On success the callback will run with Object.module:Storage~CommitHash result. */
  def apply(
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeStorageNs.CommitHash]]
  ): scala.Unit = js.native
}

