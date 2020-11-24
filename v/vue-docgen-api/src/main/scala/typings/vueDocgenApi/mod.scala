package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import typings.astTypes.nodePathMod.NodePath
import typings.babelTypes.mod.ClassDeclaration_
import typings.babelTypes.mod.File_
import typings.vueCompilerCore.mod.TemplateChildNode
import typings.vueDocgenApi.documentationMod.default
import typings.vueDocgenApi.parseMod.DocGenOptions
import typings.vueDocgenApi.parseMod.ParseOptions
import typings.vueDocgenApi.parseScriptMod.Handler
import typings.vueDocgenApi.parseTemplateMod.TemplateParserOptions
import typings.vueInbrowserCompilerUtils.typesMod.ComponentDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cleanName(name: String): String = js.native
  
  def getDefaultExample(doc: ComponentDoc): String = js.native
  
  def parse(filePath: String): js.Promise[ComponentDoc] = js.native
  def parse(filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = js.native
  def parse(filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = js.native
  
  def parseMulti(filePath: String): js.Promise[js.Array[ComponentDoc]] = js.native
  def parseMulti(filePath: String, opts: DocGenOptions): js.Promise[js.Array[ComponentDoc]] = js.native
  
  def parseSource(source: String, filePath: String): js.Promise[ComponentDoc] = js.native
  def parseSource(source: String, filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = js.native
  def parseSource(source: String, filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = js.native
  
  @js.native
  class Documentation protected () extends default {
    def this(fullFilePath: String) = this()
  }
  
  @js.native
  object ScriptHandlers extends js.Object {
    
    def classDisplayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def classMethodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def classPropHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[ClassDeclaration_, _]): js.Promise[Unit] = js.native
    
    def componentHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    val default: js.Array[Handler] = js.native
    
    def displayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, compDef: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def eventHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _], astPath: File_): js.Promise[Unit] = js.native
    
    def extendsHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[_, _],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = js.native
    
    def methodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def mixinsHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[_, _],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = js.native
    
    val preHandlers: js.Array[Handler] = js.native
    
    def propHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def slotHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def slotHandlerFunctional(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    def slotHandlerLitteral(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
  }
  
  @js.native
  object TemplateHandlers extends js.Object {
    
    val default: js.Array[
        js.Function4[
          /* documentation */ typings.vueDocgenApi.documentationMod.default, 
          /* templateAst */ TemplateChildNode, 
          /* siblings */ js.Array[TemplateChildNode], 
          /* options */ TemplateParserOptions, 
          Unit
        ]
      ] = js.native
  }
}
