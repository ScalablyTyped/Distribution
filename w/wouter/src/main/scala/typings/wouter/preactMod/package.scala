package typings.wouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  type DefaultParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type LinkProps = typings.wouter.OmitHTMLAttributesEventTa with typings.wouter.preactMod.NavigationalProps
  type LocationHook = js.Function1[
    /* options */ js.UndefOr[typings.wouter.preactMod.LocationHookOptions], 
    typings.wouter.preactMod.LocationTuple
  ]
  type LocationTuple = js.Tuple2[typings.wouter.preactMod.Path, typings.wouter.preactMod.PushCallback]
  type Match[T /* <: typings.wouter.preactMod.DefaultParams */] = typings.wouter.preactMod.MatchWithParams[T] | typings.wouter.preactMod.NoMatch
  type MatchWithParams[T /* <: typings.wouter.preactMod.DefaultParams */] = js.Tuple2[typings.wouter.wouterBooleans.`true`, typings.wouter.preactMod.Params[T]]
  type MatcherFn = js.Function2[
    /* pattern */ typings.wouter.preactMod.Path, 
    /* path */ typings.wouter.preactMod.Path, 
    typings.wouter.preactMod.Match[typings.wouter.preactMod.DefaultParams]
  ]
  type NoMatch = js.Tuple2[typings.wouter.wouterBooleans.`false`, scala.Null]
  type Params[T /* <: typings.wouter.preactMod.DefaultParams */] = T
  type Path = java.lang.String
  type PushCallback = js.Function2[
    /* to */ typings.wouter.preactMod.Path, 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type RedirectProps = typings.wouter.preactMod.NavigationalProps with js.Object
}
