package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ObjectHashes extends js.Object {
  def apply(objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): stdLib.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def apply(
    objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
}

