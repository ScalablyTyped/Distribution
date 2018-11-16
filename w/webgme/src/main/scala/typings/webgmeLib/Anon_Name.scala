package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Name extends js.Object {
  def apply(name: webgmeLib.GmeCommonNs.Name, data: webgmeLib.GmeCommonNs.Payload): stdLib.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def apply(
    name: webgmeLib.GmeCommonNs.Name,
    data: webgmeLib.GmeCommonNs.Payload,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
}

