package typings.vueDocgenApi

import org.scalablytyped.runtime.Shortcut
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-docgen-api", "Documentation")
  @js.native
  class Documentation protected () extends default {
    def this(fullFilePath: String) = this()
  }
  
  object ScriptHandlers extends Shortcut {
    
    @JSImport("vue-docgen-api", "ScriptHandlers.default")
    @js.native
    val default: js.Array[Handler] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.classDisplayNameHandler")
    @js.native
    def classDisplayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.classMethodHandler")
    @js.native
    def classMethodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.classPropHandler")
    @js.native
    def classPropHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[ClassDeclaration_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.componentHandler")
    @js.native
    def componentHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.displayNameHandler")
    @js.native
    def displayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, compDef: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.eventHandler")
    @js.native
    def eventHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _], astPath: File_): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.extendsHandler")
    @js.native
    def extendsHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[_, _],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.methodHandler")
    @js.native
    def methodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.mixinsHandler")
    @js.native
    def mixinsHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[_, _],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.preHandlers")
    @js.native
    val preHandlers: js.Array[Handler] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.propHandler")
    @js.native
    def propHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.slotHandler")
    @js.native
    def slotHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.slotHandlerFunctional")
    @js.native
    def slotHandlerFunctional(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.slotHandlerLitteral")
    @js.native
    def slotHandlerLitteral(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[_, _]): js.Promise[Unit] = js.native
    
    type _To = js.Array[Handler]
    
    /* This means you don't have to write `default`, but can instead just say `ScriptHandlers.foo` */
    override def _to: js.Array[Handler] = default
  }
  
  object TemplateHandlers extends Shortcut {
    
    @JSImport("vue-docgen-api", "TemplateHandlers.default")
    @js.native
    val default: js.Array[
        js.Function4[
          /* documentation */ typings.vueDocgenApi.documentationMod.default, 
          /* templateAst */ TemplateChildNode, 
          /* siblings */ js.Array[TemplateChildNode], 
          /* options */ TemplateParserOptions, 
          Unit
        ]
      ] = js.native
    
    type _To = js.Array[
        js.Function4[
          /* documentation */ typings.vueDocgenApi.documentationMod.default, 
          /* templateAst */ TemplateChildNode, 
          /* siblings */ js.Array[TemplateChildNode], 
          /* options */ TemplateParserOptions, 
          Unit
        ]
      ]
    
    /* This means you don't have to write `default`, but can instead just say `TemplateHandlers.foo` */
    override def _to: js.Array[
        js.Function4[
          /* documentation */ typings.vueDocgenApi.documentationMod.default, 
          /* templateAst */ TemplateChildNode, 
          /* siblings */ js.Array[TemplateChildNode], 
          /* options */ TemplateParserOptions, 
          Unit
        ]
      ] = default
  }
  
  @JSImport("vue-docgen-api", "cleanName")
  @js.native
  def cleanName(name: String): String = js.native
  
  @JSImport("vue-docgen-api", "getDefaultExample")
  @js.native
  def getDefaultExample(doc: ComponentDoc): String = js.native
  
  @JSImport("vue-docgen-api", "parse")
  @js.native
  def parse(filePath: String): js.Promise[ComponentDoc] = js.native
  @JSImport("vue-docgen-api", "parse")
  @js.native
  def parse(filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = js.native
  @JSImport("vue-docgen-api", "parse")
  @js.native
  def parse(filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = js.native
  
  @JSImport("vue-docgen-api", "parseMulti")
  @js.native
  def parseMulti(filePath: String): js.Promise[js.Array[ComponentDoc]] = js.native
  @JSImport("vue-docgen-api", "parseMulti")
  @js.native
  def parseMulti(filePath: String, opts: DocGenOptions): js.Promise[js.Array[ComponentDoc]] = js.native
  
  @JSImport("vue-docgen-api", "parseSource")
  @js.native
  def parseSource(source: String, filePath: String): js.Promise[ComponentDoc] = js.native
  @JSImport("vue-docgen-api", "parseSource")
  @js.native
  def parseSource(source: String, filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = js.native
  @JSImport("vue-docgen-api", "parseSource")
  @js.native
  def parseSource(source: String, filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = js.native
}
