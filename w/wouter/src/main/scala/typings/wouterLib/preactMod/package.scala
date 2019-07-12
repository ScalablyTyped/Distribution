package typings
package wouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  type LocationTuple = js.Tuple2[Path, PushCallback]
  type Match = js.Tuple2[scala.Boolean, Params]
  type MatcherFn = js.Function2[/* pattern */ java.lang.String, /* path */ Path, Match]
  type Params = org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  type Path = java.lang.String
  type PushCallback = js.Function1[/* to */ java.lang.String, scala.Unit]
}
