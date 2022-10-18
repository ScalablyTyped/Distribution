package typings.testcafe.mod.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHookConstructor
  extends StObject
     with /**
  * Creates a request hook
  * @param requestFilterRules - determines which requests the hook handles
  * @param responseEventConfigureOpts - defines whether to pass the response headers and body to the onResponse method
  * @returns {RequestHook}
  */
Instantiable0[RequestHook]
     with Instantiable1[/* requestFilterRules */ js.Array[Any], RequestHook]
     with Instantiable2[
      (/* requestFilterRules */ js.Array[Any]) | (/* requestFilterRules */ Unit), 
      /* responseEventConfigureOpts */ js.Object, 
      RequestHook
    ]
