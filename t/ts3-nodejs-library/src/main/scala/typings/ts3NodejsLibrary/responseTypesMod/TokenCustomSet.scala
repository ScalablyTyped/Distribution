package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenCustomSet
  extends StObject
     with ResponseEntry {
  
  var ident: String
  
  var value: String
}
object TokenCustomSet {
  
  @scala.inline
  def apply(ident: String, value: String): TokenCustomSet = {
    val __obj = js.Dynamic.literal(ident = ident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenCustomSet]
  }
  
  @scala.inline
  implicit class TokenCustomSetMutableBuilder[Self <: TokenCustomSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdent(value: String): Self = StObject.set(x, "ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
