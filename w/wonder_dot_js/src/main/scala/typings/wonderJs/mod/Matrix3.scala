package typings.wonderJs.mod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Matrix3")
@js.native
class Matrix3 ()
  extends typings.wonderJs.matrix3Mod.Matrix3 {
  def this(mat: Float32Array) = this()
}
/* static members */
object Matrix3 {
  
  @JSImport("wonder.js/dist/es2015", "Matrix3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.matrix3Mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.matrix3Mod.Matrix3]
  inline def create(mat: Float32Array): typings.wonderJs.matrix3Mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.matrix3Mod.Matrix3]
}
