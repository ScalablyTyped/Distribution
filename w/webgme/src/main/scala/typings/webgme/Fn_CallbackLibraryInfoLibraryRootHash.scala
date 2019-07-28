package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.Node
import typings.webgme.GmeClassesNs.LibraryInfo
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackLibraryInfoLibraryRootHash extends js.Object {
  def apply(node: Node, name: Name, libraryRootHash: MetadataHash, libraryInfo: LibraryInfo): js.Promise[DataObject] = js.native
  def apply(
    node: Node,
    name: Name,
    libraryRootHash: MetadataHash,
    libraryInfo: LibraryInfo,
    callback: ResultCallback[DataObject]
  ): Unit = js.native
}

