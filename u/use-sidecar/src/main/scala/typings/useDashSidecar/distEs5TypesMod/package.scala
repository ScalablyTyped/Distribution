package typings.useDashSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEs5TypesMod {
  import typings.react.reactMod.ComponentType
  import typings.react.reactMod.FunctionComponent
  import typings.useDashSidecar.Anon_Default

  type DefaultOrNot[T] = Anon_Default[T] | T
  type Importer[T] = js.Function0[js.Promise[DefaultOrNot[ComponentType[T]]]]
  type MediumCallback[T] = js.Function1[/* data */ T, js.Any]
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ Boolean, T]
  type SideCarComponent[T] = FunctionComponent[T with SideCarHOC]
  type SideCarMedium = SideMedium[ComponentType[js.Object]]
  type removeCb = js.Function0[Unit]
}
