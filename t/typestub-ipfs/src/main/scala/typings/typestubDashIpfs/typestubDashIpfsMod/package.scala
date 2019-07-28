package typings.typestubDashIpfs

import typings.node.Buffer
import typings.std.Blob
import typings.std.BufferSource
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typestubDashIpfsMod {
  type Big = js.Any
  type CID = js.Any
  type Callback[T] = js.Function2[/* error */ Error, /* result */ js.UndefOr[T], Unit]
  type DAGLink = js.Any
  type DAGLinkRef = DAGLink | js.Any
  type DAGNode = js.Any
  type FileContent = js.Object | Blob | String
  type KeyType = String | Buffer | CID | js.Any
  type Multihash = js.Any | String
  type Obj = BufferSource | js.Object
  type PeerId = js.Any
}
