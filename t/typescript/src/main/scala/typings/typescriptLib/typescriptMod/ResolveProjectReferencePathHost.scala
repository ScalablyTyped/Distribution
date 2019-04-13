package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated */ trait ResolveProjectReferencePathHost extends js.Object {
  def fileExists(fileName: java.lang.String): scala.Boolean
}

object ResolveProjectReferencePathHost {
  @scala.inline
  def apply(fileExists: java.lang.String => scala.Boolean): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
  
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
}

