package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPatchAPI extends StObject {
  
  def addLink(multihash: Multihash, link: DAGLink): js.Promise[Any] = js.native
  def addLink(multihash: Multihash, link: DAGLink, callback: Callback[Any]): Unit = js.native
  def addLink(multihash: Multihash, link: DAGLink, options: GetObjectOptions): js.Promise[Any] = js.native
  def addLink(multihash: Multihash, link: DAGLink, options: GetObjectOptions, callback: Callback[Any]): Unit = js.native
  
  def appendData(multihash: Multihash, data: Any): js.Promise[Any] = js.native
  def appendData(multihash: Multihash, data: Any, callback: Callback[Any]): Unit = js.native
  def appendData(multihash: Multihash, data: Any, options: GetObjectOptions): js.Promise[Any] = js.native
  def appendData(multihash: Multihash, data: Any, options: GetObjectOptions, callback: Callback[Any]): Unit = js.native
  
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef): js.Promise[Any] = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, callback: Callback[Any]): Unit = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, options: GetObjectOptions): js.Promise[Any] = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, options: GetObjectOptions, callback: Callback[Any]): Unit = js.native
  
  def setData(multihash: Multihash, data: Any): js.Promise[Any] = js.native
  def setData(multihash: Multihash, data: Any, callback: Callback[Any]): Unit = js.native
  def setData(multihash: Multihash, data: Any, options: GetObjectOptions): js.Promise[Any] = js.native
  def setData(multihash: Multihash, data: Any, options: GetObjectOptions, callback: Callback[Any]): Unit = js.native
}
