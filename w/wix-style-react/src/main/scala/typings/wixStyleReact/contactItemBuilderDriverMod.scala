package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contactItemBuilderDriverMod {
  
  trait ContactItemBuilderDriver
    extends StObject
       with BaseDriver {
    
    def getSubtitle(): String
    
    def getTitle(): String
  }
  object ContactItemBuilderDriver {
    
    @scala.inline
    def apply(exists: () => Boolean, getSubtitle: () => String, getTitle: () => String): ContactItemBuilderDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), getSubtitle = js.Any.fromFunction0(getSubtitle), getTitle = js.Any.fromFunction0(getTitle))
      __obj.asInstanceOf[ContactItemBuilderDriver]
    }
    
    @scala.inline
    implicit class ContactItemBuilderDriverMutableBuilder[Self <: ContactItemBuilderDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSubtitle(value: () => String): Self = StObject.set(x, "getSubtitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    }
  }
}
