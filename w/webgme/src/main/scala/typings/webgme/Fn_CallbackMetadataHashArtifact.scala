package typings.webgme

import typings.webgme.GmeClassesNs.Artifact
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashArtifact extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[Artifact] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[Artifact]): Unit = js.native
}

