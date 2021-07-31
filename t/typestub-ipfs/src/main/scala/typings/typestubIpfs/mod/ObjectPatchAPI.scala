package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPatchAPI extends StObject {
  
  def addLink(multihash: Multihash, link: DAGLink): js.Promise[js.Any] = js.native
  def addLink(multihash: Multihash, link: DAGLink, callback: Callback[js.Any]): Unit = js.native
  def addLink(multihash: Multihash, link: DAGLink, options: GetObjectOptions): js.Promise[js.Any] = js.native
  def addLink(multihash: Multihash, link: DAGLink, options: GetObjectOptions, callback: Callback[js.Any]): Unit = js.native
  
  def appendData(multihash: Multihash, data: js.Any): js.Promise[js.Any] = js.native
  def appendData(multihash: Multihash, data: js.Any, callback: Callback[js.Any]): Unit = js.native
  def appendData(multihash: Multihash, data: js.Any, options: GetObjectOptions): js.Promise[js.Any] = js.native
  def appendData(multihash: Multihash, data: js.Any, options: GetObjectOptions, callback: Callback[js.Any]): Unit = js.native
  
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef): js.Promise[js.Any] = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, callback: Callback[js.Any]): Unit = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, options: GetObjectOptions): js.Promise[js.Any] = js.native
  def rmLink(multihash: Multihash, linkRef: DAGLinkRef, options: GetObjectOptions, callback: Callback[js.Any]): Unit = js.native
  
  def setData(multihash: Multihash, data: js.Any): js.Promise[js.Any] = js.native
  def setData(multihash: Multihash, data: js.Any, callback: Callback[js.Any]): Unit = js.native
  def setData(multihash: Multihash, data: js.Any, options: GetObjectOptions): js.Promise[js.Any] = js.native
  def setData(multihash: Multihash, data: js.Any, options: GetObjectOptions, callback: Callback[js.Any]): Unit = js.native
}
