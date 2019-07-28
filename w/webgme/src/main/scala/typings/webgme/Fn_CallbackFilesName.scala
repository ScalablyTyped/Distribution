package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.BlobsNs.ObjectBlob
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackFilesName extends js.Object {
  def apply(files: StringDictionary[ObjectBlob]): js.Promise[js.Array[MetadataHash]] = js.native
  def apply(files: StringDictionary[ObjectBlob], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}

