package typings.vueRuntimeCore.mod

import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyPublicProperties extends StObject {
  
  @JSName("$children")
  var $children: js.Array[LegacyPublicProperties] = js.native
  
  @JSName("$delete")
  def $delete(target: js.Object, key: String): Unit = js.native
  
  @JSName("$destroy")
  def $destroy(): Unit = js.native
  
  @JSName("$listeners")
  var $listeners: Record[String, js.Function | js.Array[js.Function]] = js.native
  
  @JSName("$mount")
  def $mount(): this.type = js.native
  @JSName("$mount")
  def $mount(el: String): this.type = js.native
  @JSName("$mount")
  def $mount(el: Element): this.type = js.native
  
  @JSName("$off")
  def $off(): this.type = js.native
  @JSName("$off")
  def $off(event: String): this.type = js.native
  @JSName("$off")
  def $off(event: String, fn: js.Function): this.type = js.native
  @JSName("$off")
  def $off(event: js.Array[String]): this.type = js.native
  @JSName("$off")
  def $off(event: js.Array[String], fn: js.Function): this.type = js.native
  @JSName("$off")
  def $off(event: Unit, fn: js.Function): this.type = js.native
  
  @JSName("$on")
  def $on(event: String, fn: js.Function): this.type = js.native
  @JSName("$on")
  def $on(event: js.Array[String], fn: js.Function): this.type = js.native
  
  @JSName("$once")
  def $once(event: String, fn: js.Function): this.type = js.native
  
  @JSName("$scopedSlots")
  var $scopedSlots: Slots = js.native
  
  @JSName("$set")
  def $set(target: js.Object, key: String, value: Any): Unit = js.native
}
