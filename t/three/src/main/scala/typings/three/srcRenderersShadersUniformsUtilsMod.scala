package typings.three

import typings.three.srcCoreUniformsGroupMod.UniformsGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRenderersShadersUniformsUtilsMod {
  
  @JSImport("three/src/renderers/shaders/UniformsUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cloneUniforms(uniforms_src: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneUniforms")(uniforms_src.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def cloneUniformsGroups(src: js.Array[UniformsGroup]): js.Array[UniformsGroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneUniformsGroups")(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[UniformsGroup]]
  
  inline def mergeUniforms(uniforms: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Any]
}
