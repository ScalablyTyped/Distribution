package typings.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wouterMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.AnchorHTMLAttributes
  import typings.std.HTMLAnchorElement
  import typings.std.Omit
  import typings.wouter.wouterNumbers.`false`
  import typings.wouter.wouterNumbers.`true`
  import typings.wouter.wouterStrings.href

  type DefaultParams = StringDictionary[String]
  type LinkProps = (Omit[AnchorHTMLAttributes[HTMLAnchorElement], href]) with NavigationalProps
  type LocationHook = js.Function1[/* options */ js.UndefOr[LocationHookOptions], LocationTuple]
  type LocationTuple = js.Tuple2[Path, PushCallback]
  type Match[T /* <: DefaultParams */] = MatchWithParams[T] | NoMatch
  type MatchWithParams[T /* <: DefaultParams */] = js.Tuple2[`true`, Params[T]]
  type MatcherFn = js.Function2[/* pattern */ Path, /* path */ Path, Match[DefaultParams]]
  type NoMatch = js.Tuple2[`false`, Null]
  type Params[T /* <: DefaultParams */] = T
  type Path = String
  type PushCallback = js.Function2[/* to */ Path, /* replace */ js.UndefOr[Boolean], Unit]
  type RedirectProps = NavigationalProps with js.Object
}
