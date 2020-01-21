package typings.typedoc

import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/paths", JSImport.Namespace)
@js.native
object pathsMod extends js.Object {
  def createMinimatch(patterns: js.Array[String]): js.Array[IMinimatch] = js.native
}

