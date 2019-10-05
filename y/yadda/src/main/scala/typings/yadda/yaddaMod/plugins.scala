package typings.yadda.yaddaMod

import typings.yadda.libPluginsMod.MochaPlugin
import typings.yadda.libYaddaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "plugins")
@js.native
object plugins extends js.Object {
  val jasmine: MochaPlugin = js.native
  val mocha: MochaPlugin = js.native
  @js.native
  object casper extends js.Object {
    def apply(yadda: ^, casper: js.Any): Unit = js.native
  }
  
}

