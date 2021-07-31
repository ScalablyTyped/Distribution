package typings.wonderJs

import typings.wonderJs.matrix4Mod.Matrix4
import typings.wonderJs.vector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quaternionMod {
  
  @JSImport("wonder.js/dist/es2015/math/Quaternion", "Quaternion")
  @js.native
  class Quaternion () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, z: Double) = this()
    def this(x: Double, y: Unit, z: Double) = this()
    def this(x: Unit, y: Double, z: Double) = this()
    def this(x: Unit, y: Unit, z: Double) = this()
    def this(x: Double, y: Double, z: Double, w: Double) = this()
    def this(x: Double, y: Double, z: Unit, w: Double) = this()
    def this(x: Double, y: Unit, z: Double, w: Double) = this()
    def this(x: Double, y: Unit, z: Unit, w: Double) = this()
    def this(x: Unit, y: Double, z: Double, w: Double) = this()
    def this(x: Unit, y: Double, z: Unit, w: Double) = this()
    def this(x: Unit, y: Unit, z: Double, w: Double) = this()
    def this(x: Unit, y: Unit, z: Unit, w: Double) = this()
    
    def conjugate(): this.type = js.native
    
    def getEulerAngles(): js.Any = js.native
    
    def invert(): this.type = js.native
    
    def length(): js.Any = js.native
    
    def multiply(rhs1: Quaternion, rhs2: Quaternion): js.Any = js.native
    def multiply(rhs: Quaternion): js.Any = js.native
    
    def multiplyVector3(vector: Vector3): Vector3 = js.native
    
    def normalize(): this.type = js.native
    
    def set(x: Double, y: Double, z: Double, w: Double): Unit = js.native
    
    def setFromAxisAngle(angle: Double, axis: Vector3): this.type = js.native
    
    def setFromEulerAngles(eulerAngles: Vector3): this.type = js.native
    
    def setFromMatrix(matrix: Matrix4): this.type = js.native
    
    def slerp(left: Quaternion, right: Quaternion, amount: Double): Quaternion = js.native
    
    def sub(quat: Quaternion): this.type = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
  /* static members */
  object Quaternion {
    
    @JSImport("wonder.js/dist/es2015/math/Quaternion", "Quaternion")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double): Quaternion = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any]).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Double, z: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Double, z: Double, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Double, z: Unit, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Unit, z: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Unit, z: Double, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Double, y: Unit, z: Unit, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Double, z: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Double, z: Double, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Double, z: Unit, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Unit, z: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Unit, z: Double, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
    @scala.inline
    def create(x: Unit, y: Unit, z: Unit, w: Double): Quaternion = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Quaternion]
  }
}
