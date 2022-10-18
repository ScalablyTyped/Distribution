package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconOptionsAliasOptionsMod {
  
  trait AliasOptions extends StObject {
    
    /**
      * The icon-set this alias refers to.
      */
    var alias: String
  }
  object AliasOptions {
    
    inline def apply(alias: String): AliasOptions = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasOptions]
    }
    
    extension [Self <: AliasOptions](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
}
