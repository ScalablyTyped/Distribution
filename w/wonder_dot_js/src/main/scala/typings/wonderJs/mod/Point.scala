package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Point")
@js.native
open class Point ()
  extends typings.wonderJs.pointMod.Point {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
}
/* static members */
object Point {
  
  @JSImport("wonder.js/dist/es2015", "Point")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.pointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.pointMod.Point]
  inline def create(x: Double): typings.wonderJs.pointMod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.pointMod.Point]
  inline def create(x: Double, y: Double): typings.wonderJs.pointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.pointMod.Point]
  inline def create(x: Unit, y: Double): typings.wonderJs.pointMod.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typings.wonderJs.pointMod.Point]
}
