package typings.typeformEmbed

import typings.typeformEmbed.typesBaseBaseOptionsMod.BaseOptions
import typings.typeformEmbed.typesBaseEmbedTypesMod.EmbedType
import typings.typeformEmbed.typesBaseUrlOptionsMod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsBuildIframeSrcMod {
  
  @JSImport("@typeform/embed/types/utils/build-iframe-src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildIframeSrc(params: BuildIframeSrcOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildIframeSrc")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait BuildIframeSrcOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var embedId: String
    
    var formId: String
    
    var options: BaseOptions & UrlOptions
    
    var `type`: EmbedType
  }
  object BuildIframeSrcOptions {
    
    inline def apply(embedId: String, formId: String, options: BaseOptions & UrlOptions, `type`: EmbedType): BuildIframeSrcOptions = {
      val __obj = js.Dynamic.literal(embedId = embedId.asInstanceOf[js.Any], formId = formId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildIframeSrcOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildIframeSrcOptions] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEmbedId(value: String): Self = StObject.set(x, "embedId", value.asInstanceOf[js.Any])
      
      inline def setFormId(value: String): Self = StObject.set(x, "formId", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: BaseOptions & UrlOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: EmbedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
