package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.Core.Node
import typings.webgme.GmeClasses.LibraryInfo
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.ResultCallback
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

