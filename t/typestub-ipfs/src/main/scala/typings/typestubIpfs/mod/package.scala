package typings.typestubIpfs.mod

import typings.node.bufferMod.global.Buffer
import typings.std.Blob
import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createNode(options: Options): IPFS = ^.asInstanceOf[js.Dynamic].applyDynamic("createNode")(options.asInstanceOf[js.Any]).asInstanceOf[IPFS]

type Big = Any

type CID = Any

type Callback[T] = js.Function2[/* error */ js.Error, /* result */ js.UndefOr[T], Unit]

type DAGLink = Any

type DAGLinkRef = DAGLink | Any

type DAGNode = Any

type FileContent = js.Object | Blob | String

type KeyType = String | Buffer | CID | Any

type Multihash = Any | String

type Obj = BufferSource | js.Object

type PeerId = Any
