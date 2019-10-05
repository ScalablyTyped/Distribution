package typings.webpack.webpackMod.compilation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "compilation.Dependency")
@js.native
class Dependency () extends js.Object {
  def disconnect(): Unit = js.native
  def getErrors(): js.Any = js.native
  def getExports(): js.Any = js.native
  def getReference(): js.Any = js.native
  def getResourceIdentifier(): js.Any = js.native
  def getWarnings(): js.Any = js.native
  def updateHash(hash: js.Any): Unit = js.native
}

/* static members */
@JSImport("webpack", "compilation.Dependency")
@js.native
object Dependency extends js.Object {
  def compare(a: js.Any, b: js.Any): js.Any = js.native
}

