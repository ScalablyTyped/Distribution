package typings.typestubIpfs.mod

import typings.typestubIpfs.typestubIpfsStrings.`unixfs-dir`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectAPI extends StObject {
  
  def data(multihash: Multihash): js.Promise[Any] = js.native
  def data(multihash: Multihash, callback: Callback[Any]): Unit = js.native
  def data(multihash: Multihash, options: GetObjectOptions): js.Promise[Any] = js.native
  def data(multihash: Multihash, options: GetObjectOptions, callback: Callback[Any]): Unit = js.native
  
  def get(multihash: Multihash): js.Promise[Any] = js.native
  def get(multihash: Multihash, callback: Callback[Any]): Unit = js.native
  def get(multihash: Multihash, options: GetObjectOptions): js.Promise[Any] = js.native
  def get(multihash: Multihash, options: GetObjectOptions, callback: Callback[Any]): Unit = js.native
  
  def links(multihash: Multihash): js.Promise[js.Array[DAGLink]] = js.native
  def links(multihash: Multihash, callback: Callback[js.Array[DAGLink]]): Unit = js.native
  def links(multihash: Multihash, options: GetObjectOptions): js.Promise[js.Array[DAGLink]] = js.native
  def links(multihash: Multihash, options: GetObjectOptions, callback: Callback[js.Array[DAGLink]]): Unit = js.native
  
  def `new`(): js.Promise[DAGNode] = js.native
  def `new`(callback: Callback[DAGNode]): Unit = js.native
  @JSName("new")
  def new_unixfsdir(template: `unixfs-dir`, callback: Callback[DAGNode]): Unit = js.native
  
  var patch: ObjectPatchAPI = js.native
  
  def put(obj: Obj): js.Promise[Any] = js.native
  def put(obj: Obj, callback: Callback[Any]): Unit = js.native
  def put(obj: Obj, options: PutObjectOptions): js.Promise[Any] = js.native
  def put(obj: Obj, options: PutObjectOptions, callback: Callback[Any]): Unit = js.native
  
  def stat(multihash: Multihash): js.Promise[ObjectStat] = js.native
  def stat(multihash: Multihash, callback: Callback[ObjectStat]): Unit = js.native
  def stat(multihash: Multihash, options: GetObjectOptions): js.Promise[ObjectStat] = js.native
  def stat(multihash: Multihash, options: GetObjectOptions, callback: Callback[ObjectStat]): Unit = js.native
}
