package typings.uiBox

import typings.uiBox.anon.SafeHref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeHrefMod {
  
  @JSImport("ui-box/dist/src/utils/safeHref", "configureSafeHref")
  @js.native
  def configureSafeHref(configObject: SafeHrefConfigObj): Unit = js.native
  
  @JSImport("ui-box/dist/src/utils/safeHref", "extractAnchorProps")
  @js.native
  def extractAnchorProps(href: String, rel: String): SafeHref = js.native
  
  @JSImport("ui-box/dist/src/utils/safeHref", "getURLInfo")
  @js.native
  def getURLInfo(url: String): URLInfo = js.native
  
  @JSImport("ui-box/dist/src/utils/safeHref", "getUseSafeHref")
  @js.native
  def getUseSafeHref(): Boolean = js.native
  
  @js.native
  trait SafeHrefConfigObj extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var origin: js.UndefOr[String] = js.native
  }
  object SafeHrefConfigObj {
    
    @scala.inline
    def apply(): SafeHrefConfigObj = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeHrefConfigObj]
    }
    
    @scala.inline
    implicit class SafeHrefConfigObjMutableBuilder[Self <: SafeHrefConfigObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    }
  }
  
  @js.native
  trait URLInfo extends StObject {
    
    var sameOrigin: Boolean = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object URLInfo {
    
    @scala.inline
    def apply(sameOrigin: Boolean): URLInfo = {
      val __obj = js.Dynamic.literal(sameOrigin = sameOrigin.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLInfo]
    }
    
    @scala.inline
    implicit class URLInfoMutableBuilder[Self <: URLInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSameOrigin(value: Boolean): Self = StObject.set(x, "sameOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
