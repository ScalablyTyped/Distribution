package typings.yadda.libMod

import typings.yadda.pluginsMod.MochaPlugin
import typings.yadda.yaddaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "plugins")
@js.native
object plugins extends js.Object {
  val jasmine: MochaPlugin = js.native
  val mocha: MochaPlugin = js.native
  @js.native
  object casper extends js.Object {
    def apply(yadda: ^, casper: js.Any): Unit = js.native
  }
  
}

