package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aliasOptionsMod {
  
  trait AliasOptions extends StObject {
    
    /**
      * The icon-set this alias refers to.
      */
    var alias: String
  }
  object AliasOptions {
    
    @scala.inline
    def apply(alias: String): AliasOptions = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasOptions]
    }
    
    @scala.inline
    implicit class AliasOptionsMutableBuilder[Self <: AliasOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
}
