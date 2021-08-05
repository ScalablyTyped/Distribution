package typings.wonderJs

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vector2Mod {
  
  @JSImport("wonder.js/dist/es2015/math/Vector2", "Vector2")
  @js.native
  class Vector2 () extends StObject {
    def this(x: js.Any, y: js.Any) = this()
    
    def add(v: Vector2): this.type = js.native
    
    def isEqual(v: Vector2): Boolean = js.native
    
    def mul(v: Vector2): this.type = js.native
    
    def set(x: Double, y: Double): Unit = js.native
    
    var values: Float32Array = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  /* static members */
  object Vector2 {
    
    @JSImport("wonder.js/dist/es2015/math/Vector2", "Vector2")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Vector2]
    inline def create(x: js.Any, y: js.Any): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Vector2]
  }
}
