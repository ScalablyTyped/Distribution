package typings.typeformEmbed

import typings.typeformEmbed.typesFactoriesCreateSidetabCreateSidetabMod.Sidetab
import typings.typeformEmbed.typesFactoriesCreateSidetabSidetabOptionsMod.SidetabOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreateSidetabMod {
  
  @JSImport("@typeform/embed/types/factories/create-sidetab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSidetab(formId: String): Sidetab = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidetab")(formId.asInstanceOf[js.Any]).asInstanceOf[Sidetab]
  inline def createSidetab(formId: String, userOptions: SidetabOptions): Sidetab = (^.asInstanceOf[js.Dynamic].applyDynamic("createSidetab")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Sidetab]
}
