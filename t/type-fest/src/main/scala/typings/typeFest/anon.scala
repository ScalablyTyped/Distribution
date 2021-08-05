package typings.typeFest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DictmoduleName
    extends StObject
       with /* moduleName */ StringDictionary[js.UndefOr[String]] {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var main: js.UndefOr[String] = js.undefined
  }
  object DictmoduleName {
    
    inline def apply(): DictmoduleName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DictmoduleName]
    }
    
    extension [Self <: DictmoduleName](x: Self) {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    }
  }
  
  trait Email extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Email {
    
    inline def apply(name: String): Email = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait EmailUrl extends StObject {
    
    /**
    			The email address to which issues should be reported.
    			*/
    var email: js.UndefOr[String] = js.undefined
    
    /**
    			The URL to the package's issue tracker.
    			*/
    var url: js.UndefOr[String] = js.undefined
  }
  object EmailUrl {
    
    inline def apply(): EmailUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailUrl]
    }
    
    extension [Self <: EmailUrl](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Opaque extends StObject {
    
    val __opaque__ : js.Symbol
  }
  object Opaque {
    
    inline def apply(__opaque__ : js.Symbol): Opaque = {
      val __obj = js.Dynamic.literal(__opaque__ = __opaque__.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opaque]
    }
    
    extension [Self <: Opaque](x: Self) {
      
      inline def set__opaque__(value: js.Symbol): Self = StObject.set(x, "__opaque__", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Url extends StObject {
    
    var `type`: String
    
    var url: String
  }
  object Url {
    
    inline def apply(`type`: String, url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.UndefOr[scala.Nothing] = js.undefined
  }
}
