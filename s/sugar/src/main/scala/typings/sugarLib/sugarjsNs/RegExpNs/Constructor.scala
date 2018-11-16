package typings
package sugarLib.sugarjsNs.RegExpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with ScalablyTyped.runtime.Instantiable0[Chainable[stdLib.RegExp]]
     with ScalablyTyped.runtime.Instantiable1[/* raw */ stdLib.RegExp, Chainable[stdLib.RegExp]] {
  def apply(): Chainable[stdLib.RegExp] = js.native
  def apply(raw: stdLib.RegExp): Chainable[stdLib.RegExp] = js.native
  def addFlags(instance: stdLib.RegExp, flags: java.lang.String): stdLib.RegExp = js.native
  def escape(): java.lang.String = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def getFlags(instance: stdLib.RegExp): java.lang.String = js.native
  def removeFlags(instance: stdLib.RegExp, flags: java.lang.String): stdLib.RegExp = js.native
  def setFlags(instance: stdLib.RegExp, flags: java.lang.String): stdLib.RegExp = js.native
}

