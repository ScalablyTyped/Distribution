package typings
package typesettableLib.typesettableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "StringMethods")
@js.native
class StringMethods ()
  extends typesettableLib.buildSrcUtilsMod.StringMethods

/* static members */
@JSImport("typesettable", "StringMethods")
@js.native
object StringMethods extends js.Object {
  /**
    * Treat all sequences of consecutive spaces as a single " ".
    */
  def combineWhitespace(str: java.lang.String): java.lang.String = js.native
  def isNotEmptyString(str: java.lang.String): scala.Boolean = js.native
  def trimEnd(str: java.lang.String): java.lang.String = js.native
  def trimEnd(str: java.lang.String, c: java.lang.String): java.lang.String = js.native
  def trimStart(str: java.lang.String): java.lang.String = js.native
  def trimStart(str: java.lang.String, splitter: java.lang.String): java.lang.String = js.native
}

