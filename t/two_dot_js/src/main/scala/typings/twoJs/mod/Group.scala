package typings.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("two.js", "Group")
@js.native
class Group ()
  extends StObject
     with Object {
  
  def add(objects: _Object*): this.type = js.native
  def add(objects: js.Array[_Object]): this.type = js.native
  
  def addTo(group: Group): this.type = js.native
  
  var cap: String = js.native
  
  def center(): this.type = js.native
  
  var children: js.Array[_Object] = js.native
  
  var fill: Color = js.native
  
  def getBoundingClientRect(): BoundingClientRect = js.native
  def getBoundingClientRect(shallow: Boolean): BoundingClientRect = js.native
  
  var id: String = js.native
  
  var join: String = js.native
  
  var linewidth: Double = js.native
  
  var mask: Path = js.native
  
  var miter: Double = js.native
  
  def noFill(): this.type = js.native
  
  def noStroke(): this.type = js.native
  
  var opacity: Double = js.native
  
  var parent: Group = js.native
  
  def remove(objects: _Object*): this.type = js.native
  def remove(objects: js.Array[_Object]): this.type = js.native
  
  var rotation: Double = js.native
  
  var scale: Double = js.native
  
  var stroke: Color = js.native
  
  var translation: Vector = js.native
}
object Group {
  
  @JSImport("two.js", "Group")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def MakeObservable(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("MakeObservable")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
