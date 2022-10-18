package typings.testcafe.mod

import typings.testcafe.mod.^
import typings.testcafe.mod.global.RequestHookConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("testcafe", "RequestHook")
@js.native
/**
  * Creates a request hook
  * @param requestFilterRules - determines which requests the hook handles
  * @param responseEventConfigureOpts - defines whether to pass the response headers and body to the onResponse method
  * @returns {RequestHook}
  */
open class RequestHook ()
  extends StObject
     with typings.testcafe.mod.global.RequestHook {
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
object RequestHook {
  
  inline def apply: RequestHookConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("RequestHook").asInstanceOf[RequestHookConstructor]
}
