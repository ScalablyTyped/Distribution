package typings.wonka

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wonkaTypesGenMod {
  type operatorT[a, b] = js.Function1[
    /* _1 */ typings.wonka.wonkaTypesGenMod.sourceT[a], 
    typings.wonka.wonkaTypesGenMod.sourceT[b]
  ]
  type signalT[a] = typings.wonka.jsShimMod.signalT[a]
  type sinkT[a] = js.Function1[/* _1 */ typings.wonka.wonkaTypesGenMod.signalT[a], scala.Unit]
  type sourceT[a] = js.Function1[/* _1 */ typings.wonka.wonkaTypesGenMod.sinkT[a], scala.Unit]
  type talkbackT = typings.wonka.jsShimMod.talkbackT
  type teardownT = js.Function0[scala.Unit]
}
