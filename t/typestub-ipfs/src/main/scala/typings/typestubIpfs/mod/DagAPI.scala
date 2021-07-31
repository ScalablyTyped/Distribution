package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DagAPI extends StObject {
  
  def get(cid: String): js.Promise[js.Any] = js.native
  def get(cid: String, callback: Callback[js.Any]): Unit = js.native
  def get(cid: String, path: String): js.Promise[js.Any] = js.native
  def get(cid: String, path: String, callback: Callback[js.Any]): Unit = js.native
  def get(cid: String, path: String, options: js.Any): js.Promise[js.Any] = js.native
  def get(cid: String, path: String, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  def get(cid: CID): js.Promise[js.Any] = js.native
  def get(cid: CID, callback: Callback[js.Any]): Unit = js.native
  def get(cid: CID, path: String): js.Promise[js.Any] = js.native
  def get(cid: CID, path: String, callback: Callback[js.Any]): Unit = js.native
  def get(cid: CID, path: String, options: js.Any): js.Promise[js.Any] = js.native
  def get(cid: CID, path: String, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  
  def put(dagNode: js.Any, options: js.Any): js.Promise[js.Any] = js.native
  def put(dagNode: js.Any, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  
  def tree(cid: String): js.Promise[js.Any] = js.native
  def tree(cid: String, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: String, options: js.Any): js.Promise[js.Any] = js.native
  def tree(cid: String, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: String, path: String): js.Promise[js.Any] = js.native
  def tree(cid: String, path: String, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: String, path: String, options: js.Any): js.Promise[js.Any] = js.native
  def tree(cid: String, path: String, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: CID): js.Promise[js.Any] = js.native
  def tree(cid: CID, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: CID, options: js.Any): js.Promise[js.Any] = js.native
  def tree(cid: CID, options: js.Any, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: CID, path: String): js.Promise[js.Any] = js.native
  def tree(cid: CID, path: String, callback: Callback[js.Any]): Unit = js.native
  def tree(cid: CID, path: String, options: js.Any): js.Promise[js.Any] = js.native
  def tree(cid: CID, path: String, options: js.Any, callback: Callback[js.Any]): Unit = js.native
}
