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
  
  inline def createIframe(`type`: EmbedType, param1: CreateIframe_): EmbedId = (^.asInstanceOf[js.Dynamic].applyDynamic("createIframe")(`type`.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[EmbedId]
  
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
  
  trait CreateIframe_ extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var formId: String
    
    var options: CreateIframeOptions
  }
  object CreateIframe_ {
    
    inline def apply(formId: String, options: CreateIframeOptions): CreateIframe_ = {
      val __obj = js.Dynamic.literal(formId = formId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateIframe_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateIframe_] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CreateIframeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
