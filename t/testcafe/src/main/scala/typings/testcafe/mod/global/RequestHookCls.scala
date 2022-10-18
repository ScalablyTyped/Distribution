package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("RequestHook")
@js.native
/**
  * Creates a request hook
  * @param requestFilterRules - determines which requests the hook handles
  * @param responseEventConfigureOpts - defines whether to pass the response headers and body to the onResponse method
  * @returns {RequestHook}
  */
open class RequestHookCls ()
  extends StObject
     with RequestHook {
  def this(requestFilterRules: js.Array[Any]) = this()
  def this(requestFilterRules: js.Array[Any], responseEventConfigureOpts: js.Object) = this()
  def this(requestFilterRules: Unit, responseEventConfigureOpts: js.Object) = this()
  
  /**
    * The `onRequest` method is called before sending the request.
    */
  /* CompleteClass */
  override def onRequest(requestEvent: js.Object): js.Promise[Unit] | Unit = js.native
  
  /**
    * The `onResponse` method is called after sending the request
    */
  /* CompleteClass */
  override def onResponse(responseEvent: js.Object): js.Promise[Unit] | Unit = js.native
}
