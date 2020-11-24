package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyEventObject
  extends EventObject
     with /* key */ StringDictionary[js.Any]
object AnyEventObject {
  
  @scala.inline
  def apply(`type`: String): AnyEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyEventObject]
  }
}
