package typings.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("wonder.js/dist/es2015/structure/Point", "Point")
  @js.native
  class Point () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Point {
    
    @JSImport("wonder.js/dist/es2015/structure/Point", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Point]
    inline def create(x: Double): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[Point]
    inline def create(x: Double, y: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def create(x: Unit, y: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point]
  }
}
