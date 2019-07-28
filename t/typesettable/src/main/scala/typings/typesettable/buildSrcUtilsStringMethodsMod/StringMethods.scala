package typings.typesettable.buildSrcUtilsStringMethodsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/utils/stringMethods", "StringMethods")
@js.native
class StringMethods () extends js.Object

/* static members */
@JSImport("typesettable/build/src/utils/stringMethods", "StringMethods")
@js.native
object StringMethods extends js.Object {
  /**
    * Treat all sequences of consecutive spaces as a single " ".
    */
  def combineWhitespace(str: String): String = js.native
  def isNotEmptyString(str: String): Boolean = js.native
  def trimEnd(str: String): String = js.native
  def trimEnd(str: String, c: String): String = js.native
  def trimStart(str: String): String = js.native
  def trimStart(str: String, splitter: String): String = js.native
}

