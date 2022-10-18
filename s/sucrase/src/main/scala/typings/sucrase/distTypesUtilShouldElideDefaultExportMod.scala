package typings.sucrase

import typings.sucrase.distTypesUtilGetDeclarationInfoMod.DeclarationInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilShouldElideDefaultExportMod {
  
  @JSImport("sucrase/dist/types/util/shouldElideDefaultExport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    isTypeScriptTransformEnabled: Boolean,
    tokens: typings.sucrase.distTypesTokenProcessorMod.default,
    declarationInfo: DeclarationInfo
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(isTypeScriptTransformEnabled.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any], declarationInfo.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
