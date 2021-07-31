package typings.twoJs.mod

import typings.twoJs.mod.Utils.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "RadialGradient")
@js.native
class RadialGradient protected ()
  extends StObject
     with _Color {
  def this(x: Double, y: Double, radius: Double, stops: js.Array[Stop]) = this()
  def this(x: Double, y: Double, radius: Double, stops: js.Array[Stop], fx: Double) = this()
  def this(x: Double, y: Double, radius: Double, stops: js.Array[Stop], fx: Double, fy: Double) = this()
  def this(x: Double, y: Double, radius: Double, stops: js.Array[Stop], fx: Unit, fy: Double) = this()
  
  var center: Vector = js.native
  
  var focal: Vector = js.native
  
  var radius: Double = js.native
  
  var spread: String = js.native
  
  var stops: Collection[Stop] = js.native
}
