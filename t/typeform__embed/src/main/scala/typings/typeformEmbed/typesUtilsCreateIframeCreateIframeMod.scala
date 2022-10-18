package typings.typeformEmbed

import typings.typeformEmbed.anon.EmbedId
import typings.typeformEmbed.typesBaseActionableOptionsMod.ActionableOptions
import typings.typeformEmbed.typesBaseEmbedTypesMod.EmbedType
import typings.typeformEmbed.typesBaseIframeOptionsMod.IframeOptions
import typings.typeformEmbed.typesBaseUrlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCreateIframeCreateIframeMod {
  
  @JSImport("@typeform/embed/types/utils/create-iframe/create-iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIframe(formId: String, `type`: EmbedType, options: CreateIframeOptions): EmbedId = (^.asInstanceOf[js.Dynamic].applyDynamic("createIframe")(formId.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EmbedId]
  
  trait CreateIframeOptions
    extends StObject
       with UrlOptions
       with ActionableOptions
       with IframeOptions
  object CreateIframeOptions {
    
    inline def apply(): CreateIframeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateIframeOptions]
    }
  }
}
