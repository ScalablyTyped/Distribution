package typings.wordpressData.mod

import typings.react.mod.ComponentType
import typings.wordpressData.anon.Select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/data", "withDispatch")
@js.native
object withDispatch extends js.Object {
  
  def apply[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ String, DispatcherMap], 
      /* ownProps */ P with IP, 
      /* registry */ Select, 
      DP
    ]
  ): js.Function1[/* component */ ComponentType[P with IP with DP], ComponentType[P]] = js.native
}
