package typings.yadda.yaddaMod

import typings.yadda.libPluginsMod.MochaPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "plugins")
@js.native
object pluginsNs extends js.Object {
  val jasmine: MochaPlugin = js.native
  val mocha: MochaPlugin = js.native
  def casper(yadda: typings.yadda.libYaddaMod.^, casper: js.Any): Unit = js.native
}

