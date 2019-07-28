package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DagAPI extends js.Object {
  def get(cid: String): js.Promise[_] = js.native
  def get(cid: String, callback: Callback[_]): Unit = js.native
  def get(cid: String, path: String): js.Promise[_] = js.native
  def get(cid: String, path: String, callback: Callback[_]): Unit = js.native
  def get(cid: String, path: String, options: js.Any): js.Promise[_] = js.native
  def get(cid: String, path: String, options: js.Any, callback: Callback[_]): Unit = js.native
  def get(cid: CID): js.Promise[_] = js.native
  def get(cid: CID, callback: Callback[_]): Unit = js.native
  def get(cid: CID, path: String): js.Promise[_] = js.native
  def get(cid: CID, path: String, callback: Callback[_]): Unit = js.native
  def get(cid: CID, path: String, options: js.Any): js.Promise[_] = js.native
  def get(cid: CID, path: String, options: js.Any, callback: Callback[_]): Unit = js.native
  def put(dagNode: js.Any, options: js.Any): js.Promise[_] = js.native
  def put(dagNode: js.Any, options: js.Any, callback: Callback[_]): Unit = js.native
  def tree(cid: String): js.Promise[_] = js.native
  def tree(cid: String, callback: Callback[_]): Unit = js.native
  def tree(cid: String, options: js.Any): js.Promise[_] = js.native
  def tree(cid: String, options: js.Any, callback: Callback[_]): Unit = js.native
  def tree(cid: String, path: String): js.Promise[_] = js.native
  def tree(cid: String, path: String, callback: Callback[_]): Unit = js.native
  def tree(cid: String, path: String, options: js.Any): js.Promise[_] = js.native
  def tree(cid: String, path: String, options: js.Any, callback: Callback[_]): Unit = js.native
  def tree(cid: CID): js.Promise[_] = js.native
  def tree(cid: CID, callback: Callback[_]): Unit = js.native
  def tree(cid: CID, options: js.Any): js.Promise[_] = js.native
  def tree(cid: CID, options: js.Any, callback: Callback[_]): Unit = js.native
  def tree(cid: CID, path: String): js.Promise[_] = js.native
  def tree(cid: CID, path: String, callback: Callback[_]): Unit = js.native
  def tree(cid: CID, path: String, options: js.Any): js.Promise[_] = js.native
  def tree(cid: CID, path: String, options: js.Any, callback: Callback[_]): Unit = js.native
}

