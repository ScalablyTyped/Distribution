package typings.sugar.sugarjsNs.RegExpNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.RegExp
import typings.sugar.sugarjsNs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[RegExp]]
     with Instantiable1[/* raw */ RegExp, Chainable[RegExp]] {
  def apply(): Chainable[RegExp] = js.native
  def apply(raw: RegExp): Chainable[RegExp] = js.native
  def addFlags(instance: RegExp, flags: String): RegExp = js.native
  def escape(): String = js.native
  def escape(str: String): String = js.native
  def getFlags(instance: RegExp): String = js.native
  def removeFlags(instance: RegExp, flags: String): RegExp = js.native
  def setFlags(instance: RegExp, flags: String): RegExp = js.native
}

