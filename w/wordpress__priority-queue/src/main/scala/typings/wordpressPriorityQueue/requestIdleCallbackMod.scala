package typings.wordpressPriorityQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestIdleCallbackMod {
  
  @JSImport("@wordpress/priority-queue/build-types/request-idle-callback", JSImport.Default)
  @js.native
  def default(
    callback: js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("@wordpress/priority-queue/build-types/request-idle-callback", "createRequestIdleCallback")
  @js.native
  def createRequestIdleCallback(): js.Function1[
    /* callback */ js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ], 
    Unit
  ] = js.native
  
  type Callback = js.Function1[
    /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
    Unit
  ]
}
