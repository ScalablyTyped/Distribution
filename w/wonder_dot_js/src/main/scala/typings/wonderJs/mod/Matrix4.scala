package typings.wonderJs.mod

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "Matrix4")
@js.native
class Matrix4 ()
  extends typings.wonderJs.matrix4Mod.Matrix4 {
  def this(mat: Float32Array) = this()
}
/* static members */
object Matrix4 {
  
  @JSImport("wonder.js/dist/es2015", "Matrix4")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): typings.wonderJs.matrix4Mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.wonderJs.matrix4Mod.Matrix4]
  @scala.inline
  def create(mat: Float32Array): typings.wonderJs.matrix4Mod.Matrix4 = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(mat.asInstanceOf[js.Any]).asInstanceOf[typings.wonderJs.matrix4Mod.Matrix4]
}
