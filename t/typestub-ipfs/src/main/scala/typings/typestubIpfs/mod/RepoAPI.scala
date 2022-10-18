package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoAPI extends StObject {
  
  def gc(): Unit = js.native
  
  def init(bits: Double, empty: Boolean, callback: Callback[Any]): Unit = js.native
  
  def path(): String = js.native
  
  def version(callback: Callback[Any]): Unit = js.native
  def version(options: Any, callback: Callback[Any]): Unit = js.native
}
