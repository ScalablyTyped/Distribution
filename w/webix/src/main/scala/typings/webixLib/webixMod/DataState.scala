package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataState extends js.Object {
  def getState(): js.Any
  def setState(state: js.Any): scala.Unit
}

object DataState {
  @scala.inline
  def apply(getState: js.Function0[js.Any], setState: js.Function1[js.Any, scala.Unit]): DataState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("setState")(setState)
    __obj.asInstanceOf[DataState]
  }
}

