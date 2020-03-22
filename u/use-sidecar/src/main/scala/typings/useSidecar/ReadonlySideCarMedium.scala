package typings.useSidecar

import typings.react.mod.ComponentType
import typings.useSidecar.typesMod.MediumCallback
import typings.useSidecar.typesMod.removeCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<use-sidecar.use-sidecar/dist/es5/types.SideCarMedium> */
trait ReadonlySideCarMedium extends js.Object {
  val assignMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit]
  val assignSyncMedium: js.Function1[/* handler */ MediumCallback[ComponentType[js.Object]], Unit]
  val options: js.UndefOr[js.Object] = js.undefined
  val read: js.Function0[js.UndefOr[ComponentType[js.Object]]]
  val useMedium: js.Function1[/* effect */ ComponentType[js.Object], removeCb]
}

object ReadonlySideCarMedium {
  @scala.inline
  def apply(
    assignMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit,
    assignSyncMedium: /* handler */ MediumCallback[ComponentType[js.Object]] => Unit,
    read: () => js.UndefOr[ComponentType[js.Object]],
    useMedium: /* effect */ ComponentType[js.Object] => removeCb,
    options: js.Object = null
  ): ReadonlySideCarMedium = {
    val __obj = js.Dynamic.literal(assignMedium = js.Any.fromFunction1(assignMedium), assignSyncMedium = js.Any.fromFunction1(assignSyncMedium), read = js.Any.fromFunction0(read), useMedium = js.Any.fromFunction1(useMedium))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySideCarMedium]
  }
}

