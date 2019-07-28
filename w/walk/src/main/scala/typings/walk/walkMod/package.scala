package typings.walk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object walkMod {
  type WalkNamesEventCallback = js.Function3[/* base */ String, /* names */ js.Array[String], /* next */ WalkNext, Unit]
  type WalkNext = js.Function0[Unit]
  type WalkStatArrayEventCallback = js.Function3[/* base */ String, /* names */ js.Array[WalkStats], /* next */ WalkNext, Unit]
  type WalkStatEventCallback = js.Function3[/* base */ String, /* names */ WalkStats, /* next */ WalkNext, Unit]
}
