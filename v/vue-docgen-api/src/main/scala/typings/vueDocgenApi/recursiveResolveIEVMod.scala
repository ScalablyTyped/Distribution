package typings.vueDocgenApi

import typings.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recursiveResolveIEVMod {
  
  @JSImport("vue-docgen-api/dist/utils/recursiveResolveIEV", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    pathResolver: js.Function2[/* path */ String, /* originalDirNameOverride */ js.UndefOr[String], String | Null],
    varToFilePath: ImportedVariableSet,
    validExtends: js.Function1[/* fullFilePath */ String, Boolean]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathResolver.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], validExtends.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def resolveIEV(
    pathResolver: js.Function2[/* path */ String, /* originalDirNameOverride */ js.UndefOr[String], String | Null],
    varToFilePath: ImportedVariableSet,
    validExtends: js.Function1[/* fullFilePath */ String, Boolean]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveIEV")(pathResolver.asInstanceOf[js.Any], varToFilePath.asInstanceOf[js.Any], validExtends.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
