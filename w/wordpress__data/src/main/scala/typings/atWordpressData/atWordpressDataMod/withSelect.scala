package typings.atWordpressData.atWordpressDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "withSelect")
@js.native
object withSelect extends js.Object {
  def apply[SP, P, IP](
    mapSelectToProps: js.Function2[/* sel */ js.Function1[/* key */ String, SelectorMap], /* ownProps */ P with IP, SP]
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<P & IP & SP> */ /* component */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ComponentType<P> */ _
  ] = js.native
}

