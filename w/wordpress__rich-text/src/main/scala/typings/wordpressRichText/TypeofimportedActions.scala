package typings.wordpressRichText

import typings.wordpressRichText.mod.NamedFormatConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofimportedActions extends js.Object {
  def addFormatTypes(configs: js.Array[NamedFormatConfiguration]): Unit = js.native
  def addFormatTypes(configs: NamedFormatConfiguration): Unit = js.native
  def removeFormatTypes(names: String): Unit = js.native
  def removeFormatTypes(names: js.Array[String]): Unit = js.native
}

