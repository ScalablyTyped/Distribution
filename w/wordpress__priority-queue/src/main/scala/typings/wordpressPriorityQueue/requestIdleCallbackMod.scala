package typings.wordpressPriorityQueue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestIdleCallbackMod {
  
  @JSImport("@wordpress/priority-queue/build-types/request-idle-callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    callback: js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def createRequestIdleCallback(): js.Function1[
    /* callback */ js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRequestIdleCallback")().asInstanceOf[js.Function1[
    /* callback */ js.Function1[
      /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
      Unit
    ], 
    Unit
  ]]
  
  type Callback = js.Function1[
    /* timeOrDeadline */ Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IdleDeadline */ js.Any), 
    Unit
  ]
}
