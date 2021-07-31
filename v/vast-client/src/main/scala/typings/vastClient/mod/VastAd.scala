package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastAd extends StObject {
  
  var advertiser: String | Null
  
  var creatives: js.Array[VastCreative]
  
  var description: String | Null
  
  var errorURLTemplates: js.Array[String]
  
  var extensions: js.Array[VastAdExtension]
  
  var id: String | Null
  
  var impressionURLTemplates: js.Array[String]
  
  var pricing: String | Null
  
  var sequence: String | Null
  
  var survey: String | Null
  
  var system: VastSystem | String | Null
  
  var title: String | Null
}
object VastAd {
  
  @scala.inline
  def apply(
    creatives: js.Array[VastCreative],
    errorURLTemplates: js.Array[String],
    extensions: js.Array[VastAdExtension],
    impressionURLTemplates: js.Array[String]
  ): VastAd = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], errorURLTemplates = errorURLTemplates.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], impressionURLTemplates = impressionURLTemplates.asInstanceOf[js.Any], advertiser = null, description = null, id = null, pricing = null, sequence = null, survey = null, system = null, title = null)
    __obj.asInstanceOf[VastAd]
  }
  
  @scala.inline
  implicit class VastAdMutableBuilder[Self <: VastAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiser(value: String): Self = StObject.set(x, "advertiser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserNull: Self = StObject.set(x, "advertiser", null)
    
    @scala.inline
    def setCreatives(value: js.Array[VastCreative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativesVarargs(value: VastCreative*): Self = StObject.set(x, "creatives", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setErrorURLTemplates(value: js.Array[String]): Self = StObject.set(x, "errorURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorURLTemplatesVarargs(value: String*): Self = StObject.set(x, "errorURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[VastAdExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: VastAdExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setImpressionURLTemplates(value: js.Array[String]): Self = StObject.set(x, "impressionURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionURLTemplatesVarargs(value: String*): Self = StObject.set(x, "impressionURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setPricing(value: String): Self = StObject.set(x, "pricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricingNull: Self = StObject.set(x, "pricing", null)
    
    @scala.inline
    def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNull: Self = StObject.set(x, "sequence", null)
    
    @scala.inline
    def setSurvey(value: String): Self = StObject.set(x, "survey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyNull: Self = StObject.set(x, "survey", null)
    
    @scala.inline
    def setSystem(value: VastSystem | String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemNull: Self = StObject.set(x, "system", null)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
  }
}
