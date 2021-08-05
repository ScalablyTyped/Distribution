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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-docgen-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vue-docgen-api", "Documentation")
  @js.native
  class Documentation protected () extends default {
    def this(fullFilePath: String) = this()
  }
  
  object ScriptHandlers {
    
    @JSImport("vue-docgen-api", "ScriptHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vue-docgen-api", "ScriptHandlers.default")
    @js.native
    val default: js.Array[Handler] = js.native
    
    inline def classDisplayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("classDisplayNameHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def classMethodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("classMethodHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def classPropHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      path: NodePath[ClassDeclaration_, js.Any]
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("classPropHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def componentHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("componentHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def displayNameHandler(documentation: typings.vueDocgenApi.documentationMod.default, compDef: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("displayNameHandler")(documentation.asInstanceOf[js.Any], compDef.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def eventHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      path: NodePath[js.Any, js.Any],
      astPath: File_
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def extendsHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[js.Any, js.Any],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendsHandler")(documentation.asInstanceOf[js.Any], componentDefinition.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def methodHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("methodHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def mixinsHandler(
      documentation: typings.vueDocgenApi.documentationMod.default,
      componentDefinition: NodePath[js.Any, js.Any],
      astPath: File_,
      opt: ParseOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mixinsHandler")(documentation.asInstanceOf[js.Any], componentDefinition.asInstanceOf[js.Any], astPath.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("vue-docgen-api", "ScriptHandlers.preHandlers")
    @js.native
    val preHandlers: js.Array[Handler] = js.native
    
    inline def propHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("propHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def slotHandler(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("slotHandler")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def slotHandlerFunctional(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("slotHandlerFunctional")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def slotHandlerLitteral(documentation: typings.vueDocgenApi.documentationMod.default, path: NodePath[js.Any, js.Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("slotHandlerLitteral")(documentation.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
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
  
  inline def cleanName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDefaultExample(doc: ComponentDoc): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultExample")(doc.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(filePath: String): js.Promise[ComponentDoc] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ComponentDoc]]
  inline def parse(filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComponentDoc]]
  inline def parse(filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComponentDoc]]
  
  inline def parseMulti(filePath: String): js.Promise[js.Array[ComponentDoc]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMulti")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ComponentDoc]]]
  inline def parseMulti(filePath: String, opts: DocGenOptions): js.Promise[js.Array[ComponentDoc]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMulti")(filePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ComponentDoc]]]
  
  inline def parseSource(source: String, filePath: String): js.Promise[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSource")(source.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComponentDoc]]
  inline def parseSource(source: String, filePath: String, opts: StringDictionary[String]): js.Promise[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSource")(source.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComponentDoc]]
  inline def parseSource(source: String, filePath: String, opts: DocGenOptions): js.Promise[ComponentDoc] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSource")(source.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ComponentDoc]]
}
