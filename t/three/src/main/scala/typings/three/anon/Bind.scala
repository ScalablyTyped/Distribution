package typings.three.anon

import typings.three.srcCoreUniformsGroupMod.UniformsGroup
import typings.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bind extends StObject {
  
  def bind(uniformsGroup: UniformsGroup, program: WebGLProgram): Unit
  
  def dispose(): Unit
  
  def update(uniformsGroup: UniformsGroup, program: WebGLProgram): Unit
}
object Bind {
  
  inline def apply(
    bind: (UniformsGroup, WebGLProgram) => Unit,
    dispose: () => Unit,
    update: (UniformsGroup, WebGLProgram) => Unit
  ): Bind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2(bind), dispose = js.Any.fromFunction0(dispose), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Bind]
  }
  
  extension [Self <: Bind](x: Self) {
    
    inline def setBind(value: (UniformsGroup, WebGLProgram) => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (UniformsGroup, WebGLProgram) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
