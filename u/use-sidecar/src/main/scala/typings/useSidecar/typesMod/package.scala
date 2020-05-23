package typings.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DefaultOrNot[T] = typings.useSidecar.anon.Default[T] | T
  type Importer[T] = js.Function0[
    js.Promise[typings.useSidecar.typesMod.DefaultOrNot[typings.react.mod.ComponentType[T]]]
  ]
  type MediumCallback[T] = js.Function1[/* data */ T, js.Any]
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ scala.Boolean, T]
  type SideCarComponent[T] = typings.react.mod.FunctionComponent[T with typings.useSidecar.typesMod.SideCarHOC]
  type SideCarMedium = typings.useSidecar.typesMod.SideMedium[typings.react.mod.ComponentType[js.Object]]
  type removeCb = js.Function0[scala.Unit]
}
