package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.anon.Choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalMod {
  
  @JSImport("@wordpress/customize-browser/external", "ImageModel")
  @js.native
  open class ImageModel protected () extends StObject {
    def this(_underscore: Choice) = this()
  }
  
  trait Attachment extends StObject {
    
    def get(_underscore: String): Any
  }
  object Attachment {
    
    inline def apply(get: String => Any): Attachment = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  trait Cropper extends StObject {
    
    def get(_underscore: String): Any
    
    // TODO
    def set(_1: String, _2: Any): Unit
  }
  object Cropper {
    
    inline def apply(get: String => Any, set: (String, Any) => Unit): Cropper = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cropper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cropper] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Theme extends StObject {
    
    var _canInstall: Boolean
    
    var _filesystemCredentialsNeeded: Boolean
    
    var id: String
    
    var name: String
  }
  object Theme {
    
    inline def apply(_canInstall: Boolean, _filesystemCredentialsNeeded: Boolean, id: String, name: String): Theme = {
      val __obj = js.Dynamic.literal(_canInstall = _canInstall.asInstanceOf[js.Any], _filesystemCredentialsNeeded = _filesystemCredentialsNeeded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def set_canInstall(value: Boolean): Self = StObject.set(x, "_canInstall", value.asInstanceOf[js.Any])
      
      inline def set_filesystemCredentialsNeeded(value: Boolean): Self = StObject.set(x, "_filesystemCredentialsNeeded", value.asInstanceOf[js.Any])
    }
  }
}
