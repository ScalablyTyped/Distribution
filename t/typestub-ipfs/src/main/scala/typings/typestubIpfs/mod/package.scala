package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def createNode(options: typings.typestubIpfs.mod.Options): typings.typestubIpfs.mod.IPFS = typings.typestubIpfs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(options.asInstanceOf[js.Any]).asInstanceOf[typings.typestubIpfs.mod.IPFS]

type Big = js.Any

type CID = js.Any

type Callback[T] = js.Function2[/* error */ typings.std.Error, /* result */ js.UndefOr[T], scala.Unit]

type DAGLink = js.Any

type DAGLinkRef = typings.typestubIpfs.mod.DAGLink | js.Any

type DAGNode = js.Any

type FileContent = js.Object | typings.std.Blob | java.lang.String

type KeyType = java.lang.String | typings.node.Buffer | typings.typestubIpfs.mod.CID | js.Any

type Multihash = js.Any | java.lang.String

type Obj = typings.std.BufferSource | js.Object

type PeerId = js.Any
