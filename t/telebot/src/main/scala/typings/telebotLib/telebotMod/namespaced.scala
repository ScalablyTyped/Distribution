package typings
package telebotLib.telebotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("telebot", JSImport.Namespace)
@js.native
class namespaced protected () extends telebot {
  def this(config: java.lang.String) = this()
  def this(config: telebotLib.telebotMod.telebotNs.config) = this()
}

@JSImport("telebot", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def addMethods(methods: (telebotLib.telebotMod.telebotNs.genericCb | js.Any)*): js.Any = js.native
}

