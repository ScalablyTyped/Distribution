package typings.tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cancel extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var redirect: js.UndefOr[From | String] = js.undefined
  }
  object Cancel {
    
    inline def apply(): Cancel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setRedirect(value: From | String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var include: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Exclude {
    
    inline def apply(): Exclude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
      
      inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setInclude(value: String | js.Array[String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: String*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value*))
    }
  }
  
  trait From extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object From {
    
    inline def apply(url: String): From = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Imported extends StObject {
    
    var imported: js.UndefOr[Double] = js.undefined
  }
  object Imported {
    
    inline def apply(): Imported = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Imported]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Imported] (val x: Self) extends AnyVal {
      
      inline def setImported(value: Double): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
      
      inline def setImportedUndefined: Self = StObject.set(x, "imported", js.undefined)
    }
  }
  
  trait Mimetype extends StObject {
    
    var mimetype: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Mimetype {
    
    inline def apply(): Mimetype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mimetype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mimetype] (val x: Self) extends AnyVal {
      
      inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
      
      inline def setMimetypeUndefined: Self = StObject.set(x, "mimetype", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
