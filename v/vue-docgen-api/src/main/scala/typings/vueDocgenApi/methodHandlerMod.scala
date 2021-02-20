package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.Function
import typings.vueInbrowserCompilerUtils.typesMod.BlockTag
import typings.vueInbrowserCompilerUtils.typesMod.MethodDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object methodHandlerMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers/methodHandler", JSImport.Default)
  @js.native
  def default(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers/methodHandler", "setMethodDescriptor")
  @js.native
  def setMethodDescriptor(methodDescriptor: MethodDescriptor, method: NodePath[Function, _], jsDocTags: js.Array[BlockTag]): MethodDescriptor = js.native
}
