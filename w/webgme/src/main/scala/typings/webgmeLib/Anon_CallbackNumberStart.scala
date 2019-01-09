package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackNumberStart extends js.Object {
  def apply(start: webgmeLib.GmeCommonNs.ProjectStart, number: scala.Double): js.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
  def apply(
    start: webgmeLib.GmeCommonNs.ProjectStart,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
}

