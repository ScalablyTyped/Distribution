package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControl extends StObject {
  
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.native
  
  def onAdd(map: Map): HTMLElement = js.native
  
  def onRemove(): Unit = js.native
  def onRemove(map: Map): Unit = js.native
}
