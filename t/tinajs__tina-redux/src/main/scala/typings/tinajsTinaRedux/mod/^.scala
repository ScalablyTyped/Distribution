package typings.tinajsTinaRedux.mod

import typings.redux.mod.Action
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tinajs/tina-redux", JSImport.Namespace)
@js.native
class ^[S, A /* <: Action[_] */] protected () extends TinaRedux[S, A] {
  def this(reduxStore: Store[S, A]) = this()
}
