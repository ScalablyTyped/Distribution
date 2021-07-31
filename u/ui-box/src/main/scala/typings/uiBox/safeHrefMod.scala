package typings.uiBox

import typings.uiBox.anon.SafeHref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeHrefMod {
  
  @JSImport("ui-box/dist/src/utils/safeHref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def configureSafeHref(configObject: SafeHrefConfigObj): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configureSafeHref")(configObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def extractAnchorProps(href: String, rel: String): SafeHref = (^.asInstanceOf[js.Dynamic].applyDynamic("extractAnchorProps")(href.asInstanceOf[js.Any], rel.asInstanceOf[js.Any])).asInstanceOf[SafeHref]
  
  @scala.inline
  def getURLInfo(url: String): URLInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getURLInfo")(url.asInstanceOf[js.Any]).asInstanceOf[URLInfo]
  
  @scala.inline
  def getUseSafeHref(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUseSafeHref")().asInstanceOf[Boolean]
  
  trait SafeHrefConfigObj extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
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
  
  trait URLInfo extends StObject {
    
    var sameOrigin: Boolean
    
    var url: js.UndefOr[String] = js.undefined
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
