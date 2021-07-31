package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.ListableResource because var conflicts: get_Original. Inlined list, list, list, list_Original */ @js.native
trait RecordingResource extends MappedResource[RecordingInstance] {
  
  def list(args: js.Any): Promise[js.Any] = js.native
  def list(args: js.Any, callback: RequestCallback): Promise[js.Any] = js.native
  def list(callback: RequestCallback): Promise[js.Any] = js.native
  @JSName("list")
  var list_Original: RestMethod = js.native
}
