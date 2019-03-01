package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated */ trait ResolveProjectReferencePathHost extends js.Object {
  def fileExists(fileName: java.lang.String): scala.Boolean
}

object ResolveProjectReferencePathHost {
  @scala.inline
  def apply(fileExists: js.Function1[java.lang.String, scala.Boolean]): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileExists")(fileExists)
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
}

