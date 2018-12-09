package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NameMetadataHash extends js.Object {
  def apply(name: webgmeLib.GmeCommonNs.Name, metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def apply(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    size: scala.Double
  ): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def apply(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    size: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  def apply(objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def apply(
    objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
}

