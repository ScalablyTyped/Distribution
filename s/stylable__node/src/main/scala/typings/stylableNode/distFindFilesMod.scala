package typings.stylableNode

import typings.std.Set
import typings.stylableNode.anon.Errors
import typings.stylableNode.anon.PickanyreaddirSyncstatSyn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFindFilesMod {
  
  @JSImport("@stylable/node/dist/find-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  type FileSystem = Any
}
