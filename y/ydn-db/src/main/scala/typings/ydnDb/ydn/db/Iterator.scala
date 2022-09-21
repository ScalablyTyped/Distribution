package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator extends StObject {
  
  def getKey(): Any = js.native
  
  def getPrimaryKey(): Any = js.native
  
  def join(peer_store_name: String): Any = js.native
  def join(peer_store_name: String, peer_field_name: String): Any = js.native
  def join(peer_store_name: String, peer_field_name: String, value: Any): Any = js.native
  def join(peer_store_name: String, peer_field_name: Unit, value: Any): Any = js.native
  
  def reset(): Iterator = js.native
  
  def restrict(peer_field_name: String, value: Any): Any = js.native
  
  def resume(key: Any, index_key: Any): Iterator = js.native
  
  def reverse(key: Any, index_key: Any): Iterator = js.native
}
