package typings.vueDocgenApi

import typings.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-docgen-api/dist/utils/recursiveResolveIEV", JSImport.Namespace)
@js.native
object recursiveResolveIEVMod extends js.Object {
  
  def default(
    pathResolver: js.Function2[/* path */ String, /* originalDirNameOverride */ js.UndefOr[String], String | Null],
    varToFilePath: ImportedVariableSet,
    validExtends: js.Function1[/* fullFilePath */ String, Boolean]
  ): js.Promise[Unit] = js.native
  
  def resolveIEV(
    pathResolver: js.Function2[/* path */ String, /* originalDirNameOverride */ js.UndefOr[String], String | Null],
    varToFilePath: ImportedVariableSet,
    validExtends: js.Function1[/* fullFilePath */ String, Boolean]
  ): js.Promise[Unit] = js.native
}
