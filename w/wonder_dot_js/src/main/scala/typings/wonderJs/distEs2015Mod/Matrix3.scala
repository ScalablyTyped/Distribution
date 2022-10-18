package typings.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Matrix3")
@js.native
open class Matrix3 ()
  extends typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3 {
  def this(mat: js.typedarray.Float32Array) = this()
}
/* static members */
object Matrix3 {
  
  @JSImport("wonder.js/dist/es2015", "Matrix3")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(): typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3]
  inline def create(mat: js.typedarray.Float32Array): typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.distEs2015MathMatrix3Mod.Matrix3]
}
