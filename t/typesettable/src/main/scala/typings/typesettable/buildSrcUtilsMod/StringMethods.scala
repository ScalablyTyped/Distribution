package typings.typesettable.buildSrcUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/utils", "StringMethods")
@js.native
class StringMethods ()
  extends typings.typesettable.buildSrcUtilsStringMethodsMod.StringMethods

/* static members */
@JSImport("typesettable/build/src/utils", "StringMethods")
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

