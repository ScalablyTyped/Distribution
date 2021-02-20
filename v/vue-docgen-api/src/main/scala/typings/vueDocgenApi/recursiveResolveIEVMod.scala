package typings.vueDocgenApi

import typings.vueDocgenApi.resolveRequiredMod.ImportedVariableSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recursiveResolveIEVMod {
  
  @JSImport("vue-docgen-api/dist/utils/recursiveResolveIEV", JSImport.Default)
  @js.native
  def default(
    pathResolver: js.Function2[/* path */ String, /* originalDirNameOverride */ js.UndefOr[String], String | Null],
    varToFilePath: ImportedVariableSet,
    validExtends: js.Function1[/* fullFilePath */ String, Boolean]
  ): js.Promise[Unit] = js.native
  
  @JSImport("vue-docgen-api/dist/utils/recursiveResolveIEV", "resolveIEV")
  @js.native
  def resolveIEV(
    pathResolver: js.Function2[/* path */ String, /* originalDirNameOverride */ js.UndefOr[String], String | Null],
    varToFilePath: ImportedVariableSet,
    validExtends: js.Function1[/* fullFilePath */ String, Boolean]
  ): js.Promise[Unit] = js.native
}
