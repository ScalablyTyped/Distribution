package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionContext[S, R] extends StObject {
  
  def commit(`type`: String): Unit
  def commit(`type`: String, payload: Any): Unit
  def commit(`type`: String, payload: Any, options: CommitOptions): Unit
  def commit(`type`: String, payload: Unit, options: CommitOptions): Unit
  def commit[P /* <: Payload */](payloadWithType: P): Unit
  def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit
  @JSName("commit")
  var commit_Original: Commit
  
  def dispatch(`type`: String): js.Promise[Any]
  def dispatch(`type`: String, payload: Any): js.Promise[Any]
  def dispatch(`type`: String, payload: Any, options: DispatchOptions): js.Promise[Any]
  def dispatch(`type`: String, payload: Unit, options: DispatchOptions): js.Promise[Any]
  def dispatch[P /* <: Payload */](payloadWithType: P): js.Promise[Any]
  def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[Any]
  @JSName("dispatch")
  var dispatch_Original: Dispatch
  
  var getters: Any
  
  var rootGetters: Any
  
  var rootState: R
  
  var state: S
}
object ActionContext {
  
  inline def apply[S, R](commit: Commit, dispatch: Dispatch, getters: Any, rootGetters: Any, rootState: R, state: S): ActionContext[S, R] = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], dispatch = dispatch.asInstanceOf[js.Any], getters = getters.asInstanceOf[js.Any], rootGetters = rootGetters.asInstanceOf[js.Any], rootState = rootState.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionContext[S, R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionContext[?, ?], S, R] (val x: Self & (ActionContext[S, R])) extends AnyVal {
    
    inline def setCommit(value: Commit): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setDispatch(value: Dispatch): Self = StObject.set(x, "dispatch", value.asInstanceOf[js.Any])
    
    inline def setGetters(value: Any): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
    
    inline def setRootGetters(value: Any): Self = StObject.set(x, "rootGetters", value.asInstanceOf[js.Any])
    
    inline def setRootState(value: R): Self = StObject.set(x, "rootState", value.asInstanceOf[js.Any])
    
    inline def setState(value: S): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
