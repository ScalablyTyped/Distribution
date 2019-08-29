package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveProjectReferencePathHost extends js.Object {
  def fileExists(fileName: String): Boolean
}

object ResolveProjectReferencePathHost {
  @scala.inline
  def apply(fileExists: String => Boolean): ResolveProjectReferencePathHost = {
    val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists))
  
    __obj.asInstanceOf[ResolveProjectReferencePathHost]
  }
}

