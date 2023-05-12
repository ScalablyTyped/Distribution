package typings.vueCompilerSfc.mod

import typings.babelTypes.mod.Node
import typings.babelTypes.mod.ObjectPattern_
import typings.babelTypes.mod.Program_
import typings.magicString.mod.default
import typings.std.Record
import typings.std.Set
import typings.vueCompilerCore.mod.BindingMetadata
import typings.vueCompilerSfc.anon.PartialSFCScriptCompileOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/compiler-sfc", "ScriptCompileContext")
@js.native
open class ScriptCompileContext protected ()
  extends StObject
     with TypeResolveContext {
  def this(descriptor: SFCDescriptor, options: PartialSFCScriptCompileOp) = this()
  
  var bindingMetadata: BindingMetadata = js.native
  
  /**
    * to be exposed on compiled script block for HMR cache busting
    */
  var deps: js.UndefOr[Set[String]] = js.native
  
  var descriptor: SFCDescriptor = js.native
  
  var emitIdentifier: js.UndefOr[String] = js.native
  
  var emitsRuntimeDecl: js.UndefOr[Node] = js.native
  
  var emitsTypeDecl: js.UndefOr[Node] = js.native
  
  var endOffset: js.UndefOr[Double] = js.native
  
  def error(msg: String, node: Node): scala.Nothing = js.native
  def error(msg: String, node: Node, scope: TypeScope): scala.Nothing = js.native
  
  var filename: String = js.native
  
  def getString(node: Node): String = js.native
  def getString(node: Node, scriptSetup: Boolean): String = js.native
  
  var globalScopes: js.UndefOr[js.Array[TypeScope]] = js.native
  
  var hasDefaultExportName: Boolean = js.native
  
  var hasDefaultExportRender: Boolean = js.native
  
  var hasDefineEmitCall: Boolean = js.native
  
  var hasDefineExposeCall: Boolean = js.native
  
  var hasDefineModelCall: Boolean = js.native
  
  var hasDefineOptionsCall: Boolean = js.native
  
  var hasDefinePropsCall: Boolean = js.native
  
  var hasDefineSlotsCall: Boolean = js.native
  
  def helper(key: String): String = js.native
  
  var helperImports: Set[String] = js.native
  
  var isJS: Boolean = js.native
  
  var isTS: Boolean = js.native
  
  var modelDecls: Record[String, ModelDecl] = js.native
  
  var options: PartialSFCScriptCompileOp = js.native
  
  var optionsRuntimeDecl: js.UndefOr[Node] = js.native
  
  var propsDestructureDecl: js.UndefOr[ObjectPattern_] = js.native
  
  var propsDestructureRestId: js.UndefOr[String] = js.native
  
  var propsDestructuredBindings: PropsDestructureBindings = js.native
  
  var propsIdentifier: js.UndefOr[String] = js.native
  
  var propsRuntimeDecl: js.UndefOr[Node] = js.native
  
  var propsRuntimeDefaults: js.UndefOr[Node] = js.native
  
  var propsTypeDecl: js.UndefOr[Node] = js.native
  
  var s: default = js.native
  
  var scope: js.UndefOr[TypeScope] = js.native
  
  var scriptAst: Program_ | Null = js.native
  
  var scriptSetupAst: Program_ | Null = js.native
  
  var source: String = js.native
  
  var startOffset: js.UndefOr[Double] = js.native
  
  var userImports: Record[String, ImportBinding] = js.native
}
