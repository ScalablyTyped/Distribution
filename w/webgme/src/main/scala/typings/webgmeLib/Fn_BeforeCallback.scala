package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BeforeCallback extends js.Object {
  def apply(before: scala.Double, number: scala.Double): js.Promise[webgmeLib.GmeStorageNs.CommitObject] = js.native
  def apply(
    before: scala.Double,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitObject]
  ): scala.Unit = js.native
  def apply(before: webgmeLib.GmeStorageNs.CommitHash, number: scala.Double): js.Promise[webgmeLib.GmeStorageNs.CommitObject] = js.native
  def apply(
    before: webgmeLib.GmeStorageNs.CommitHash,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitObject]
  ): scala.Unit = js.native
}

