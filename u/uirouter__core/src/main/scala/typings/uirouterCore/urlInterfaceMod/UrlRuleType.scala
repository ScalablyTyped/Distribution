package typings.uirouterCore.urlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.uirouterCore.uirouterCoreStrings.STATE
  - typings.uirouterCore.uirouterCoreStrings.URLMATCHER
  - typings.uirouterCore.uirouterCoreStrings.REGEXP
  - typings.uirouterCore.uirouterCoreStrings.RAW
  - typings.uirouterCore.uirouterCoreStrings.OTHER
*/
trait UrlRuleType extends js.Object

object UrlRuleType {
  @scala.inline
  def OTHER: typings.uirouterCore.uirouterCoreStrings.OTHER = this.cast("OTHER")
  @scala.inline
  def RAW: typings.uirouterCore.uirouterCoreStrings.RAW = this.cast("RAW")
  @scala.inline
  def REGEXP: typings.uirouterCore.uirouterCoreStrings.REGEXP = this.cast("REGEXP")
  @scala.inline
  def STATE: typings.uirouterCore.uirouterCoreStrings.STATE = this.cast("STATE")
  @scala.inline
  def URLMATCHER: typings.uirouterCore.uirouterCoreStrings.URLMATCHER = this.cast("URLMATCHER")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

