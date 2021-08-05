package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllRoomAttributes
  extends StObject
     with BaseRoomAttributes
     with ImmutableRoomAttributes
object AllRoomAttributes {
  
  inline def apply(description: String, name: String): AllRoomAttributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllRoomAttributes]
  }
}
