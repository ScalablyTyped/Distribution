package typings.uslug

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(value: String): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(value: String, options: UslugOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("uslug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UslugOptions extends StObject {
    
    var allowedChars: js.UndefOr[String] = js.undefined
    
    var lower: js.UndefOr[Boolean] = js.undefined
    
    var spaces: js.UndefOr[Boolean] = js.undefined
  }
  object UslugOptions {
    
    @scala.inline
    def apply(): UslugOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UslugOptions]
    }
    
    @scala.inline
    implicit class UslugOptionsMutableBuilder[Self <: UslugOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedChars(value: String): Self = StObject.set(x, "allowedChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedCharsUndefined: Self = StObject.set(x, "allowedChars", js.undefined)
      
      @scala.inline
      def setLower(value: Boolean): Self = StObject.set(x, "lower", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerUndefined: Self = StObject.set(x, "lower", js.undefined)
      
      @scala.inline
      def setSpaces(value: Boolean): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    }
  }
}
