package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupStore extends StObject {
  
  def group(config: obj): Unit = js.native
  def group(config: obj, target: String): Unit = js.native
  
  def ungroup(): Unit = js.native
}
object GroupStore {
  
  inline def apply: GroupStore = ^.asInstanceOf[js.Dynamic].selectDynamic("GroupStore").asInstanceOf[GroupStore]
}
