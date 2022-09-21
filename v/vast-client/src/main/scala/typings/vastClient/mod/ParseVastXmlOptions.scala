package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseVastXmlOptions extends StObject {
  
  var allowMultipleAds: js.UndefOr[Boolean] = js.undefined
  
  var followAdditionalWrappers: js.UndefOr[Boolean] = js.undefined
  
  var isRootVAST: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[String | Null] = js.undefined
  
  var wrapperDepth: js.UndefOr[Double] = js.undefined
}
object ParseVastXmlOptions {
  
  inline def apply(): ParseVastXmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseVastXmlOptions]
  }
  
  extension [Self <: ParseVastXmlOptions](x: Self) {
    
    inline def setAllowMultipleAds(value: Boolean): Self = StObject.set(x, "allowMultipleAds", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleAdsUndefined: Self = StObject.set(x, "allowMultipleAds", js.undefined)
    
    inline def setFollowAdditionalWrappers(value: Boolean): Self = StObject.set(x, "followAdditionalWrappers", value.asInstanceOf[js.Any])
    
    inline def setFollowAdditionalWrappersUndefined: Self = StObject.set(x, "followAdditionalWrappers", js.undefined)
    
    inline def setIsRootVAST(value: Boolean): Self = StObject.set(x, "isRootVAST", value.asInstanceOf[js.Any])
    
    inline def setIsRootVASTUndefined: Self = StObject.set(x, "isRootVAST", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWrapperDepth(value: Double): Self = StObject.set(x, "wrapperDepth", value.asInstanceOf[js.Any])
    
    inline def setWrapperDepthUndefined: Self = StObject.set(x, "wrapperDepth", js.undefined)
  }
}
