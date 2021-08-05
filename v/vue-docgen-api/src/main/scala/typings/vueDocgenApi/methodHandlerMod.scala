package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.Function
import typings.vueInbrowserCompilerUtils.typesMod.BlockTag
import typings.vueInbrowserCompilerUtils.typesMod.MethodDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/methodHandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setMethodDescriptor(
    methodDescriptor: MethodDescriptor,
    method: NodePath[Function, js.Any],
    jsDocTags: js.Array[BlockTag]
  ): MethodDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("setMethodDescriptor")(methodDescriptor.asInstanceOf[js.Any], method.asInstanceOf[js.Any], jsDocTags.asInstanceOf[js.Any])).asInstanceOf[MethodDescriptor]
}
