package typings.typedoc.typedocMod

import typings.minimatch.minimatchMod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createMinimatch(patterns: js.Array[String]): js.Array[IMinimatch] = js.native
  def normalizePath(path: String): String = js.native
  def resetReflectionID(): Unit = js.native
}

