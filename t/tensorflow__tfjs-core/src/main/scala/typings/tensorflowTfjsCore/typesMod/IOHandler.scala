package typings.tensorflowTfjsCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOHandler extends js.Object {
  var load: js.UndefOr[LoadHandler] = js.undefined
  var save: js.UndefOr[SaveHandler] = js.undefined
}

object IOHandler {
  @scala.inline
  def apply(
    load: () => js.Promise[ModelArtifacts] = null,
    save: /* modelArtifact */ ModelArtifacts => js.Promise[SaveResult] = null
  ): IOHandler = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction0(load))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1(save))
    __obj.asInstanceOf[IOHandler]
  }
}

