package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.PostableResource because var conflicts: get_Original. Inlined post, post, post, post_Original */ @js.native
trait CreatableMappedResource[T] extends MappedResource[T] {
  
  def create(args: js.Any): Promise[js.Any] = js.native
  def create(args: js.Any, callback: RequestCallback): Promise[js.Any] = js.native
  def create(callback: RequestCallback): Promise[js.Any] = js.native
  @JSName("create")
  var create_Original: RestMethod = js.native
  
  def post(args: js.Any): Promise[js.Any] = js.native
  def post(args: js.Any, callback: RequestCallback): Promise[js.Any] = js.native
  def post(callback: RequestCallback): Promise[js.Any] = js.native
  @JSName("post")
  var post_Original: RestMethod = js.native
}
