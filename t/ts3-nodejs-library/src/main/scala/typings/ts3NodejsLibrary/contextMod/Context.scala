package typings.ts3NodejsLibrary.contextMod

import typings.ts3NodejsLibrary.contextMod.SelectType.NONE
import typings.ts3NodejsLibrary.contextMod.SelectType.PORT
import typings.ts3NodejsLibrary.contextMod.SelectType.SID
import typings.ts3NodejsLibrary.ts3NodejsLibraryNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ts3NodejsLibrary.contextMod.SelectPortContext
  - typings.ts3NodejsLibrary.contextMod.SelectSidContext
  - typings.ts3NodejsLibrary.contextMod.SelectNoneContext
*/
trait Context extends js.Object
object Context {
  
  @scala.inline
  def SelectPortContext(events: js.Array[ActiveEvent], selectType: PORT, selected: Double): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  def SelectSidContext(events: js.Array[ActiveEvent], selectType: SID, selected: String): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  def SelectNoneContext(events: js.Array[ActiveEvent], selectType: NONE, selected: `0`): Context = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], selectType = selectType.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}
