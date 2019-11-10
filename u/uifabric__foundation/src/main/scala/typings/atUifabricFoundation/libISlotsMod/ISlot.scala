package typings.atUifabricFoundation.libISlotsMod

import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.PropsWithChildren
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlot[TProps] extends js.Object {
  var isSlot: js.UndefOr[Boolean] = js.native
  def apply(): ReturnType[FunctionComponent[js.Object]] = js.native
  def apply(componentProps: PropsWithChildren[TProps]): ReturnType[FunctionComponent[js.Object]] = js.native
}

