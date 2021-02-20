package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientDBFind extends ResponseEntry {
  
  var cldbid: String = js.native
}
object ClientDBFind {
  
  @scala.inline
  def apply(cldbid: String): ClientDBFind = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDBFind]
  }
  
  @scala.inline
  implicit class ClientDBFindMutableBuilder[Self <: ClientDBFind] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
  }
}
