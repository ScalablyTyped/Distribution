package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSubscribersObject[P, S] extends js.Object {
  var after: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
  var before: js.UndefOr[ActionSubscriber[P, S]] = js.undefined
}

