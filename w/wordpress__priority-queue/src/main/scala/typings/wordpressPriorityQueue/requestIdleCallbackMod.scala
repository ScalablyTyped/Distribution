package typings.wordpressPriorityQueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/priority-queue/build-types/request-idle-callback", JSImport.Namespace)
@js.native
object requestIdleCallbackMod extends js.Object {
  
  def createRequestIdleCallback(): js.Function1[
    /* callback */ js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ], 
    Unit
  ] = js.native
  
  def default(
    callback: js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ]
  ): Unit = js.native
  
  type Callback = js.Function1[
    /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
    Unit
  ]
}
