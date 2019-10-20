package typings.atWebpackDashBlocksCore.atWebpackDashBlocksCoreMod

import typings.webpack.webpackMod.Configuration
import typings.webpack.webpackMod.Plugin
import typings.webpack.webpackMod.RuleSetRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  def addLoader(loaderDefinition: RuleSetRule): js.Function0[Configuration]
  def addPlugin(plugin: Plugin): js.Function0[Configuration]
  def merge(configSnippet: Configuration): js.Function0[Configuration]
}

object Util {
  @scala.inline
  def apply(
    addLoader: RuleSetRule => js.Function0[Configuration],
    addPlugin: Plugin => js.Function0[Configuration],
    merge: Configuration => js.Function0[Configuration]
  ): Util = {
    val __obj = js.Dynamic.literal(addLoader = js.Any.fromFunction1(addLoader), addPlugin = js.Any.fromFunction1(addPlugin), merge = js.Any.fromFunction1(merge))
  
    __obj.asInstanceOf[Util]
  }
}

