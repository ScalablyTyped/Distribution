package typings.typeformEmbed

import typings.typeformEmbed.typesBaseEmbedTypesMod.EmbedPopup
import typings.typeformEmbed.typesFactoriesCreatePopupPopupOptionsMod.PopupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreatePopupCreatePopupMod {
  
  @JSImport("@typeform/embed/types/factories/create-popup/create-popup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPopup(formId: String): Popup = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopup")(formId.asInstanceOf[js.Any]).asInstanceOf[Popup]
  inline def createPopup(formId: String, userOptions: PopupOptions): Popup = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopup")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Popup]
  
  type Popup = EmbedPopup
}
