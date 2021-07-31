package typings.vueDocgenApi

import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.ClassDeclaration_
import typings.babelTypes.mod.File_
import typings.vueDocgenApi.parseMod.ParseOptions
import typings.vueDocgenApi.parseScriptMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptHandlersMod {
  
  @JSImport("vue-docgen-api/dist/script-handlers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-docgen-api/dist/script-handlers", JSImport.Default)
  @js.native
  val default: js.Array[Handler] = js.native
  
  @scala.inline
  def classDisplayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("classDisplayNameHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def classMethodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("classMethodHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def classPropHandler(
    documentation: typings.vueDocgenApi.documentationMod.default,
    path: NodePath[ClassDeclaration_, js.Any]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("classPropHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def componentHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("componentHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def displayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, compDef: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("displayNameHandler")(documentation.asInstanceOf[js.Any], compDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def eventHandler(
    documentation: typings.vueDocgenApi.documentationMod.default,
    path: NodePath[js.Any, js.Any],
    astPath: File_
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def extendsHandler(
    documentation: typings.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[js.Any, js.Any],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendsHandler")(documentation.asInstanceOf[js.Any], componentDefinition.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def methodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def mixinsHandler(
    documentation: typings.vueDocgenApi.documentationMod.default,
    componentDefinition: NodePath[js.Any, js.Any],
    astPath: File_,
    opt: ParseOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixinsHandler")(documentation.asInstanceOf[js.Any], componentDefinition.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("vue-docgen-api/dist/script-handlers", "preHandlers")
  @js.native
  val preHandlers: js.Array[Handler] = js.native
  
  @scala.inline
  def propHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("propHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def slotHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("slotHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def slotHandlerFunctional(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("slotHandlerFunctional")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def slotHandlerLitteral(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("slotHandlerLitteral")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
