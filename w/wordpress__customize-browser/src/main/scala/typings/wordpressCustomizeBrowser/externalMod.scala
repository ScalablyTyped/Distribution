package typings.wordpressCustomizeBrowser

import typings.wordpressCustomizeBrowser.anon.Choice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalMod {
  
  @JSImport("@wordpress/customize-browser/external", "ImageModel")
  @js.native
  class ImageModel protected () extends StObject {
    def this(_underscore: Choice) = this()
  }
  
  @js.native
  trait Attachment extends StObject {
    
    def get(_underscore: String): js.Any = js.native
  }
  object Attachment {
    
    @scala.inline
    def apply(get: String => js.Any): Attachment = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Cropper extends StObject {
    
    def get(_underscore: String): js.Any = js.native
    
    // TODO
    def set(_1: String, _2: js.Any): Unit = js.native
  }
  object Cropper {
    
    @scala.inline
    def apply(get: String => js.Any, set: (String, js.Any) => Unit): Cropper = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cropper]
    }
    
    @scala.inline
    implicit class CropperMutableBuilder[Self <: Cropper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Theme extends StObject {
    
    var _canInstall: Boolean = js.native
    
    var _filesystemCredentialsNeeded: Boolean = js.native
    
    var id: String = js.native
    
    var name: String = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(_canInstall: Boolean, _filesystemCredentialsNeeded: Boolean, id: String, name: String): Theme = {
      val __obj = js.Dynamic.literal(_canInstall = _canInstall.asInstanceOf[js.Any], _filesystemCredentialsNeeded = _filesystemCredentialsNeeded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_canInstall(value: Boolean): Self = StObject.set(x, "_canInstall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_filesystemCredentialsNeeded(value: Boolean): Self = StObject.set(x, "_filesystemCredentialsNeeded", value.asInstanceOf[js.Any])
    }
  }
}
