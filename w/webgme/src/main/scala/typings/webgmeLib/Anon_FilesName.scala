package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FilesName extends js.Object {
  def apply(files: ScalablyTyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] | js.Promise[java.lang.String] = js.native
  def apply(
    files: ScalablyTyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
}

