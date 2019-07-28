package typings.atTinajsTinaDashRedux

import typings.redux.reduxMod.AnyAction
import typings.redux.reduxMod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTinajsTinaDashReduxMod {
  type MapStateToProps = js.Function1[/* state */ js.Any, js.Any]
  type mapDispatchToProps = js.Function1[/* dispatch */ Dispatch[AnyAction], js.Any]
}
