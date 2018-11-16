package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_StartNumber extends js.Object {
  def apply(start: java.lang.String | webgmeLib.GmeStorageNs.CommitHash, number: scala.Double): stdLib.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
  def apply(
    start: java.lang.String | webgmeLib.GmeStorageNs.CommitHash,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
  def apply(start: js.Array[java.lang.String], number: scala.Double): stdLib.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
  def apply(
    start: js.Array[java.lang.String],
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
}

