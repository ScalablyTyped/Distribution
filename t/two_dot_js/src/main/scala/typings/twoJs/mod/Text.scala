package typings.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "Text")
@js.native
class Text protected () extends Object {
  def this(message: String, x: Double, y: Double) = this()
  def this(message: String, x: Double, y: Double, styles: js.Any) = this()
  
  var alignment: String = js.native
  
  var baseline: String = js.native
  
  var decoration: String = js.native
  
  var family: String = js.native
  
  var fill: Color = js.native
  
  def getBoundingClientRect(): js.Object = js.native
  def getBoundingClientRect(shallow: Boolean): js.Object = js.native
  
  var leading: Double = js.native
  
  var linewidth: Double = js.native
  
  def noFill(): this.type = js.native
  
  def noStroke(): this.type = js.native
  
  var opacity: Double = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var size: Double = js.native
  
  var stroke: Color = js.native
  
  var style: String = js.native
  
  var translation: Vector = js.native
  
  var value: String = js.native
  
  var visible: Boolean = js.native
  
  var weight: Double | String = js.native
}
object Text {
  
  /* static member */
  @JSImport("two.js", "Text.MakeObservable")
  @js.native
  def MakeObservable(obj: js.Any): js.Any = js.native
}
