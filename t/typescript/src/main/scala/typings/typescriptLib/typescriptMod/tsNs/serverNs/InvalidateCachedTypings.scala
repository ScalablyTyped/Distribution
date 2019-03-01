package typings
package typescriptLib.typescriptMod.tsNs.serverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidateCachedTypings extends ProjectResponse {
  @JSName("kind")
  val kind_InvalidateCachedTypings: ActionInvalidate
}

object InvalidateCachedTypings {
  @scala.inline
  def apply(kind: ActionInvalidate, projectName: java.lang.String): InvalidateCachedTypings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("projectName")(projectName)
    __obj.asInstanceOf[InvalidateCachedTypings]
  }
}

