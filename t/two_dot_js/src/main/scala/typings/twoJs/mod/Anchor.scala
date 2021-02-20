package typings.twoJs.mod

import typings.twoJs.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "Anchor")
@js.native
class Anchor protected () extends Vector {
  def this(x: Double, y: Double, lx: Double, ly: Double, rx: Double, ry: Double, command: String) = this()
  def this(x: Double, y: Double, lx: Double, ly: Double, rx: Double, ry: Double, command: Commands) = this()
  
  var command: Commands | String = js.native
  
  var controls: js.UndefOr[Left] = js.native
  
  def ignore(): this.type = js.native
  
  def listen(): this.type = js.native
}
object Anchor {
  
  /* static member */
  @JSImport("two.js", "Anchor.AppendCurveProperties")
  @js.native
  def AppendCurveProperties(): Unit = js.native
}
