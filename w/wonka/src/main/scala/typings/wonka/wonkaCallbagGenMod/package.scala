package typings.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wonkaCallbagGenMod {
  type callbagT[a] = typings.wonka.jsShimMod.callbagT[a]
  type callbagTalkback = js.Function1[/* _1 */ typings.wonka.wonkaCallbagGenMod.callbagSignal, scala.Unit]
}
