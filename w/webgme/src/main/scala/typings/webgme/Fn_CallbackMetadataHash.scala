package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHash extends js.Object {
  def apply(name: Name, metadataHash: MetadataHash): js.Promise[MetadataHash] = js.native
  def apply(name: Name, metadataHash: MetadataHash, size: Double): js.Promise[MetadataHash] = js.native
  def apply(name: Name, metadataHash: MetadataHash, size: Double, callback: ResultCallback[MetadataHash]): Unit = js.native
  def apply(objectHashes: StringDictionary[String]): js.Promise[MetadataHash] = js.native
  def apply(objectHashes: StringDictionary[String], callback: ResultCallback[MetadataHash]): Unit = js.native
}

