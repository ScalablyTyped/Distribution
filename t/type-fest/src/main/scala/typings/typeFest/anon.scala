package typings.typeFest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DictmoduleName
    extends /* moduleName */ StringDictionary[js.UndefOr[String]] {
    
    var browser: js.UndefOr[String] = js.native
    
    var main: js.UndefOr[String] = js.native
  }
  object DictmoduleName {
    
    @scala.inline
    def apply(): DictmoduleName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictmoduleName]
    }
    
    @scala.inline
    implicit class DictmoduleNameMutableBuilder[Self <: DictmoduleName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Email {
    
    @scala.inline
    def apply(name: String): Email = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait EmailUrl extends StObject {
    
    /**
    			The email address to which issues should be reported.
    			*/
    var email: js.UndefOr[String] = js.native
    
    /**
    			The URL to the package's issue tracker.
    			*/
    var url: js.UndefOr[String] = js.native
  }
  object EmailUrl {
    
    @scala.inline
    def apply(): EmailUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailUrl]
    }
    
    @scala.inline
    implicit class EmailUrlMutableBuilder[Self <: EmailUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Opaque extends StObject {
    
    val __opaque__ : js.Symbol = js.native
  }
  object Opaque {
    
    @scala.inline
    def apply(__opaque__ : js.Symbol): Opaque = {
      val __obj = js.Dynamic.literal(__opaque__ = __opaque__.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opaque]
    }
    
    @scala.inline
    implicit class OpaqueMutableBuilder[Self <: Opaque] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__opaque__(value: js.Symbol): Self = StObject.set(x, "__opaque__", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Type {
    
    @scala.inline
    def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var `type`: String = js.native
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(`type`: String, url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.UndefOr[scala.Nothing] = js.native
  }
}
