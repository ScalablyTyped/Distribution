package typings.wouter

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wouterMod {
  type LocationTuple = js.Tuple2[Path, PushCallback]
  type Match = js.Tuple2[Boolean, Params]
  type MatcherFn = js.Function2[/* pattern */ String, /* path */ Path, Match]
  type Params = StringDictionary[String] | Null
  type Path = String
  type PushCallback = js.Function1[/* to */ String, Unit]
}
