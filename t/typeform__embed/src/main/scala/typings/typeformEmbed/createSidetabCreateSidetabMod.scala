package typings.typeformEmbed

import typings.typeformEmbed.embedTypesMod.EmbedPopup
import typings.typeformEmbed.sidetabOptionsMod.SidetabOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSidetabCreateSidetabMod {
  
  @JSImport("@typeform/embed/types/factories/create-sidetab/create-sidetab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSidetab(formId: String): Sidetab = ^.asInstanceOf[js.Dynamic].applyDynamic("createSidetab")(formId.asInstanceOf[js.Any]).asInstanceOf[Sidetab]
  inline def createSidetab(formId: String, userOptions: SidetabOptions): Sidetab = (^.asInstanceOf[js.Dynamic].applyDynamic("createSidetab")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Sidetab]
  
  type Sidetab = EmbedPopup
}
