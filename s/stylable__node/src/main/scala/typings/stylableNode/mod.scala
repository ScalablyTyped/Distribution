package typings.stylableNode

import typings.std.Omit
import typings.std.Partial
import typings.std.Set
import typings.stylableNode.anon.Errors
import typings.stylableNode.anon.PartialOptions
import typings.stylableNode.anon.PickanyreaddirSyncstatSyn
import typings.stylableNode.stylableNodeStrings.hashSalt
import typings.stylableNode.stylableNodeStrings.prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/node/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachHook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHook")().asInstanceOf[Unit]
  inline def attachHook(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules: PartialOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHook")(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createNamespaceStrategyNode(): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespaceStrategyNode")().asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def createNamespaceStrategyNode(
    options: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateNamespaceOptions */ Any
    ]
  ): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespaceStrategyNode")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  
  inline def findFiles(
    fs: PickanyreaddirSyncstatSyn,
    join: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem * / any['join'] */ js.Any,
    relative: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem * / any['relative'] */ js.Any,
    rootDirectory: String,
    ext: String,
    blacklist: Set[String]
  ): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(fs.asInstanceOf[js.Any], join.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], rootDirectory.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Errors]
  inline def findFiles(
    fs: PickanyreaddirSyncstatSyn,
    join: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem * / any['join'] */ js.Any,
    relative: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IFileSystem * / any['relative'] */ js.Any,
    rootDirectory: String,
    ext: String,
    blacklist: Set[String],
    useRelative: Boolean
  ): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(fs.asInstanceOf[js.Any], join.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], rootDirectory.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], useRelative.asInstanceOf[js.Any])).asInstanceOf[Errors]
  
  inline def resolveNamespace(namespace: String, stylesheetOriginPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespace")(namespace.asInstanceOf[js.Any], stylesheetOriginPath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveNamespace(namespace: String, stylesheetOriginPath: String, stylesheetPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespace")(namespace.asInstanceOf[js.Any], stylesheetOriginPath.asInstanceOf[js.Any], stylesheetPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveNamespaceFactory(): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")().asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(hashSalt: String): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(hashSalt: String, prefix: String): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(
    hashSalt: String,
    prefix: String,
    options: Partial[
      Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateNamespaceOptions */ Any, 
        hashSalt | prefix
      ]
    ]
  ): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(
    hashSalt: String,
    prefix: Unit,
    options: Partial[
      Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateNamespaceOptions */ Any, 
        hashSalt | prefix
      ]
    ]
  ): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(hashSalt: Unit, prefix: String): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(
    hashSalt: Unit,
    prefix: String,
    options: Partial[
      Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateNamespaceOptions */ Any, 
        hashSalt | prefix
      ]
    ]
  ): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
  inline def resolveNamespaceFactory(
    hashSalt: Unit,
    prefix: Unit,
    options: Partial[
      Omit[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateNamespaceOptions */ Any, 
        hashSalt | prefix
      ]
    ]
  ): js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* namespace */ String, 
    /* stylesheetOriginPath */ String, 
    /* stylesheetPath */ js.UndefOr[String], 
    String
  ]]
}
