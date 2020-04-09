package typings.webidl2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorContext extends js.Object {
  /**
  		 * @param specifier The import specifier.
  		 * @param property The imported property, when undefined or empty,
  		 *        then the whole module namespace will be imported.
  		 * @return The identifier referring to this imported value.
  		 */
  def addImport(specifier: String): String = js.native
  def addImport(specifier: String, property: String): String = js.native
}

