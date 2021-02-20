package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator extends StObject {
  
  def getKey(): js.Any = js.native
  
  def getPrimaryKey(): js.Any = js.native
  
  def join(peer_store_name: String): js.Any = js.native
  def join(peer_store_name: String, peer_field_name: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
  def join(peer_store_name: String, peer_field_name: String): js.Any = js.native
  def join(peer_store_name: String, peer_field_name: String, value: js.Any): js.Any = js.native
  
  def reset(): Iterator = js.native
  
  def restrict(peer_field_name: String, value: js.Any): js.Any = js.native
  
  def resume(key: js.Any, index_key: js.Any): Iterator = js.native
  
  def reverse(key: js.Any, index_key: js.Any): Iterator = js.native
}
