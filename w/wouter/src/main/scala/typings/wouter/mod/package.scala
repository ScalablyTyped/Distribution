package typings.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefaultParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LinkProps = (typings.std.Omit[
    typings.react.mod.AnchorHTMLAttributes[typings.std.HTMLAnchorElement], 
    typings.wouter.wouterStrings.href
  ]) with typings.wouter.mod.NavigationalProps
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[typings.wouter.mod.LocationHookOptions], 
    typings.wouter.mod.LocationTuple
  ]
  type LocationTuple = js.Tuple2[typings.wouter.mod.Path, typings.wouter.mod.PushCallback]
  type Match[T /* <: typings.wouter.mod.DefaultParams */] = typings.wouter.mod.MatchWithParams[T] | typings.wouter.mod.NoMatch
  type MatchWithParams[T /* <: typings.wouter.mod.DefaultParams */] = js.Tuple2[typings.wouter.wouterBooleans.`true`, typings.wouter.mod.Params[T]]
  type MatcherFn = js.Function2[
    /* pattern */ typings.wouter.mod.Path, 
    /* path */ typings.wouter.mod.Path, 
    typings.wouter.mod.Match[typings.wouter.mod.DefaultParams]
  ]
  type NoMatch = js.Tuple2[typings.wouter.wouterBooleans.`false`, scala.Null]
  type Params[T /* <: typings.wouter.mod.DefaultParams */] = T
  type Path = java.lang.String
  type PushCallback = js.Function2[
    /* to */ typings.wouter.mod.Path, 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RedirectProps = typings.wouter.mod.NavigationalProps with js.Object
}
