package typings.atWordpressData.atWordpressDataMod

import typings.atWordpressData.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "withDispatch")
@js.native
object withDispatch extends js.Object {
  def apply[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ String, DispatcherMap], 
      /* ownProps */ P with IP, 
      /* registry */ Anon_Key, 
      DP
    ]
  ): js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P & IP & DP> */ /* component */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentType<P> */ _
  ] = js.native
}

