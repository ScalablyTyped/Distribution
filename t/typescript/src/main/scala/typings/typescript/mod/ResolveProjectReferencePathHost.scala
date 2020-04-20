package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveProjectReferencePathHost extends js.Object {
  def fileExists(fileName: java.lang.String): Boolean
}

object ResolveProjectReferencePathHost {
  @scala.inline
  def apply(fileExists: java.lang.String => Boolean): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
}

