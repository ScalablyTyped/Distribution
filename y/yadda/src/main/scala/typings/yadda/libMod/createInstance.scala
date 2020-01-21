package typings.yadda.libMod

import typings.yadda.contextMod.Properties
import typings.yadda.yaddaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "createInstance")
@js.native
object createInstance extends js.Object {
  def apply(): ^ = js.native
  def apply(libraries: js.Array[typings.yadda.languageMod.Library]): ^ = js.native
  def apply(libraries: js.Array[typings.yadda.languageMod.Library], context: Properties): ^ = js.native
  def apply(libraries: typings.yadda.languageMod.Library): ^ = js.native
  def apply(libraries: typings.yadda.languageMod.Library, context: Properties): ^ = js.native
}

