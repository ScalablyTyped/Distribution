package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivilegeKeyEntry extends ResponseEntry {
  
  var token: String = js.native
  
  var tokenCreated: Double = js.native
  
  /** only in server version >= 3.11.x */
  var tokenCustomset: js.Array[TokenCustomSet] = js.native
  
  var tokenDescription: String = js.native
  
  var tokenId1: Double = js.native
  
  var tokenId2: Double = js.native
  
  var tokenType: Double = js.native
}
object PrivilegeKeyEntry {
  
  @scala.inline
  def apply(
    token: String,
    tokenCreated: Double,
    tokenCustomset: js.Array[TokenCustomSet],
    tokenDescription: String,
    tokenId1: Double,
    tokenId2: Double,
    tokenType: Double
  ): PrivilegeKeyEntry = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], tokenCreated = tokenCreated.asInstanceOf[js.Any], tokenCustomset = tokenCustomset.asInstanceOf[js.Any], tokenDescription = tokenDescription.asInstanceOf[js.Any], tokenId1 = tokenId1.asInstanceOf[js.Any], tokenId2 = tokenId2.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivilegeKeyEntry]
  }
  
  @scala.inline
  implicit class PrivilegeKeyEntryMutableBuilder[Self <: PrivilegeKeyEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenCreated(value: Double): Self = StObject.set(x, "tokenCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenCustomset(value: js.Array[TokenCustomSet]): Self = StObject.set(x, "tokenCustomset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenCustomsetVarargs(value: TokenCustomSet*): Self = StObject.set(x, "tokenCustomset", js.Array(value :_*))
    
    @scala.inline
    def setTokenDescription(value: String): Self = StObject.set(x, "tokenDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenId1(value: Double): Self = StObject.set(x, "tokenId1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenId2(value: Double): Self = StObject.set(x, "tokenId2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: Double): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
