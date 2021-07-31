package typings.wixUiCore.srcComponentsVideoTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventEmitter extends StObject {
  
  def emit(event: String, args: js.Any*): Boolean = js.native
  
  def off(event: String): this.type = js.native
  def off(event: String, fn: js.Function): this.type = js.native
  def off(event: String, fn: js.Function, context: js.Any): this.type = js.native
  def off(event: String, fn: js.Function, context: js.Any, once: Boolean): this.type = js.native
  def off(event: String, fn: js.Function, context: Unit, once: Boolean): this.type = js.native
  def off(event: String, fn: Unit, context: js.Any): this.type = js.native
  def off(event: String, fn: Unit, context: js.Any, once: Boolean): this.type = js.native
  def off(event: String, fn: Unit, context: Unit, once: Boolean): this.type = js.native
  
  def on(event: String, fn: js.Function): this.type = js.native
  def on(event: String, fn: js.Function, context: js.Any): this.type = js.native
  
  def once(event: String, fn: js.Function): this.type = js.native
  def once(event: String, fn: js.Function, context: js.Any): this.type = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(event: String): this.type = js.native
}
