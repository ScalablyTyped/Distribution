package typings.vueRuntimeCore.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetupContext[E] extends StObject {
  
  var attrs: Data = js.native
  
  var emit: EmitFn[E, /* keyof E */ String] = js.native
  
  def expose(): Unit = js.native
  def expose(exposed: Record[String, Any]): Unit = js.native
  
  var slots: Slots = js.native
}
