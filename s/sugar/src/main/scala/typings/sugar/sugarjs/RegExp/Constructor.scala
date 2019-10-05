package typings.sugar.sugarjs.RegExp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[typings.std.RegExp]]
     with Instantiable1[/* raw */ typings.std.RegExp, Chainable[typings.std.RegExp]] {
  def apply(): Chainable[typings.std.RegExp] = js.native
  def apply(raw: typings.std.RegExp): Chainable[typings.std.RegExp] = js.native
  def addFlags(instance: typings.std.RegExp, flags: String): typings.std.RegExp = js.native
  def escape(): String = js.native
  def escape(str: String): String = js.native
  def getFlags(instance: typings.std.RegExp): String = js.native
  def removeFlags(instance: typings.std.RegExp, flags: String): typings.std.RegExp = js.native
  def setFlags(instance: typings.std.RegExp, flags: String): typings.std.RegExp = js.native
}

