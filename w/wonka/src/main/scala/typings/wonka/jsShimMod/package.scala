package typings.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsShimMod {
  type ExnT = typings.std.Error
  type InternalMeth[_T, R] = js.Function0[R]
  type callbagT[a] = typings.wonka.jsShimMod.Callbag[scala.Unit, a]
  type signalT[a] = (typings.wonka.AnonTag with (js.Array[js.Function1[/* talkback */ typings.wonka.jsShimMod.talkbackT, scala.Unit]])) | (typings.wonka.Anon0 with js.Array[a]) | typings.wonka.wonkaNumbers.`0`
}
