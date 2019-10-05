package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.Blobs.ObjectBlob
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackFilesName extends js.Object {
  def apply(files: StringDictionary[ObjectBlob]): js.Promise[js.Array[MetadataHash]] = js.native
  def apply(files: StringDictionary[ObjectBlob], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}

