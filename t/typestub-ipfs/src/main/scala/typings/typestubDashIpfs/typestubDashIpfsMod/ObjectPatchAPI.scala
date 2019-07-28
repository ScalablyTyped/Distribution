package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPatchAPI extends js.Object {
  def addLink(multihash: Multihash, link: DAGLink): js.Promise[_] = js.native
  def addLink(multihash: Multihash, link: DAGLink, callback: Callback[_]): Unit = js.native
  def addLink(multihash: Multihash, link: DAGLink, options: GetObjectOptions): js.Promise[_] = js.native
  def addLink(multihash: Multihash, link: DAGLink, options: GetObjectOptions, callback: Callback[_]): Unit = js.native
  def appendData(multihash: Multihash, data: js.Any): js.Promise[_] = js.native
  def appendData(multihash: Multihash, data: js.Any, callback: Callback[_]): Unit = js.native
  def appendData(multihash: Multihash, data: js.Any, options: GetObjectOptions): js.Promise[_] = js.native
  def appendData(multihash: Multihash, data: js.Any, options: GetObjectOptions, callback: Callback[_]): Unit = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef): js.Promise[_] = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, callback: Callback[_]): Unit = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, options: GetObjectOptions): js.Promise[_] = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, options: GetObjectOptions, callback: Callback[_]): Unit = js.native
  def setData(multihash: Multihash, data: js.Any): js.Promise[_] = js.native
  def setData(multihash: Multihash, data: js.Any, callback: Callback[_]): Unit = js.native
  def setData(multihash: Multihash, data: js.Any, options: GetObjectOptions): js.Promise[_] = js.native
  def setData(multihash: Multihash, data: js.Any, options: GetObjectOptions, callback: Callback[_]): Unit = js.native
}

