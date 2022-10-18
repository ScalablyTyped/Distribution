package typings.wonderJs

import typings.wonderJs.distEs2015MathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015MathVector4Mod {
  
  @JSImport("wonder.js/dist/es2015/math/Vector4", "Vector4")
  @js.native
  open class Vector4 () extends StObject {
    def this(x: Any, y: Any, z: Any, w: Any) = this()
    
    /* protected */ def copyHelper(vector4: Vector4): Any = js.native
    
    def dot(v: Vector4): Double = js.native
    
    def isEqual(v: Vector4): Boolean = js.native
    
    def lengthManhattan(): Any = js.native
    
    def multiplyScalar(scalar: Double): this.type = js.native
    
    def normalize(): Vector4 = js.native
    
    def set(x: Double, y: Double, z: Double, w: Double): Unit = js.native
    
    def toVector3(): Vector3 = js.native
    
    var values: js.typedarray.Float32Array = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Vector4 {
    
    @JSImport("wonder.js/dist/es2015/math/Vector4", "Vector4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Any]
    inline def create(x: Any, y: Any, z: Any, w: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
