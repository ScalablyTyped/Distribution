package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Group extends StObject {
  
  def group(config: Any): Unit = js.native
  def group(config: Any, target: String): Unit = js.native
  def group(config: Any, target: Double): Unit = js.native
  
  def ungroup(mode: Boolean): Unit = js.native
}
object Group {
  
  inline def apply: Group = ^.asInstanceOf[js.Dynamic].selectDynamic("Group").asInstanceOf[Group]
}
