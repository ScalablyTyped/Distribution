package typings.typescript.typescriptMod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidateCachedTypings extends ProjectResponse {
  @JSName("kind")
  val kind_InvalidateCachedTypings: ActionInvalidate
}

object InvalidateCachedTypings {
  @scala.inline
  def apply(kind: ActionInvalidate, projectName: String): InvalidateCachedTypings = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InvalidateCachedTypings]
  }
}

