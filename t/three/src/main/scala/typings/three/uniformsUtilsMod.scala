package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniformsUtilsMod {
  
  @JSImport("three/src/renderers/shaders/UniformsUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cloneUniforms(uniforms_src: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneUniforms")(uniforms_src.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def mergeUniforms(uniforms: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
