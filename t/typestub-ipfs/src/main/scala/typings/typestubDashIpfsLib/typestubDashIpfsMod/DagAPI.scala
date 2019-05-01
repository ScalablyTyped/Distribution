package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DagAPI extends js.Object {
  def get(cid: java.lang.String): js.Promise[_] = js.native
  def get(cid: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def get(cid: java.lang.String, path: java.lang.String): js.Promise[_] = js.native
  def get(cid: java.lang.String, path: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def get(cid: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def get(cid: java.lang.String, path: java.lang.String, options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def get(cid: CID): js.Promise[_] = js.native
  def get(cid: CID, callback: Callback[_]): scala.Unit = js.native
  def get(cid: CID, path: java.lang.String): js.Promise[_] = js.native
  def get(cid: CID, path: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def get(cid: CID, path: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def get(cid: CID, path: java.lang.String, options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def put(dagNode: js.Any, options: js.Any): js.Promise[_] = js.native
  def put(dagNode: js.Any, options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: java.lang.String): js.Promise[_] = js.native
  def tree(cid: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def tree(cid: java.lang.String, options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: java.lang.String, path: java.lang.String): js.Promise[_] = js.native
  def tree(cid: java.lang.String, path: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: java.lang.String, path: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def tree(cid: java.lang.String, path: java.lang.String, options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: CID): js.Promise[_] = js.native
  def tree(cid: CID, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: CID, options: js.Any): js.Promise[_] = js.native
  def tree(cid: CID, options: js.Any, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: CID, path: java.lang.String): js.Promise[_] = js.native
  def tree(cid: CID, path: java.lang.String, callback: Callback[_]): scala.Unit = js.native
  def tree(cid: CID, path: java.lang.String, options: js.Any): js.Promise[_] = js.native
  def tree(cid: CID, path: java.lang.String, options: js.Any, callback: Callback[_]): scala.Unit = js.native
}

