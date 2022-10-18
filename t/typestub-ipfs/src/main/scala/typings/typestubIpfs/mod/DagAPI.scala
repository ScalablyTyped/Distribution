package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DagAPI extends StObject {
  
  def get(cid: String): js.Promise[Any] = js.native
  def get(cid: String, callback: Callback[Any]): Unit = js.native
  def get(cid: String, path: String): js.Promise[Any] = js.native
  def get(cid: String, path: String, callback: Callback[Any]): Unit = js.native
  def get(cid: String, path: String, options: Any): js.Promise[Any] = js.native
  def get(cid: String, path: String, options: Any, callback: Callback[Any]): Unit = js.native
  def get(cid: CID): js.Promise[Any] = js.native
  def get(cid: CID, callback: Callback[Any]): Unit = js.native
  def get(cid: CID, path: String): js.Promise[Any] = js.native
  def get(cid: CID, path: String, callback: Callback[Any]): Unit = js.native
  def get(cid: CID, path: String, options: Any): js.Promise[Any] = js.native
  def get(cid: CID, path: String, options: Any, callback: Callback[Any]): Unit = js.native
  
  def put(dagNode: Any, options: Any): js.Promise[Any] = js.native
  def put(dagNode: Any, options: Any, callback: Callback[Any]): Unit = js.native
  
  def tree(cid: String): js.Promise[Any] = js.native
  def tree(cid: String, callback: Callback[Any]): Unit = js.native
  def tree(cid: String, options: Any): js.Promise[Any] = js.native
  def tree(cid: String, options: Any, callback: Callback[Any]): Unit = js.native
  def tree(cid: String, path: String): js.Promise[Any] = js.native
  def tree(cid: String, path: String, callback: Callback[Any]): Unit = js.native
  def tree(cid: String, path: String, options: Any): js.Promise[Any] = js.native
  def tree(cid: String, path: String, options: Any, callback: Callback[Any]): Unit = js.native
  def tree(cid: CID): js.Promise[Any] = js.native
  def tree(cid: CID, callback: Callback[Any]): Unit = js.native
  def tree(cid: CID, options: Any): js.Promise[Any] = js.native
  def tree(cid: CID, options: Any, callback: Callback[Any]): Unit = js.native
  def tree(cid: CID, path: String): js.Promise[Any] = js.native
  def tree(cid: CID, path: String, callback: Callback[Any]): Unit = js.native
  def tree(cid: CID, path: String, options: Any): js.Promise[Any] = js.native
  def tree(cid: CID, path: String, options: Any, callback: Callback[Any]): Unit = js.native
}
