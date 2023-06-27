package typings.webix.mod

import typings.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexLayout extends StObject {
  
  @JSName("$getSize")
  def $getSize(): js.Array[Any] = js.native
  @JSName("$getSize")
  def $getSize(dx: Double): js.Array[Any] = js.native
  @JSName("$getSize")
  def $getSize(dx: Double, dy: Double): js.Array[Any] = js.native
  @JSName("$getSize")
  def $getSize(dx: Unit, dy: Double): js.Array[Any] = js.native
  
  def render(): Unit = js.native
}
object FlexLayout {
  
  inline def apply: FlexLayout = ^.asInstanceOf[js.Dynamic].selectDynamic("FlexLayout").asInstanceOf[FlexLayout]
}
