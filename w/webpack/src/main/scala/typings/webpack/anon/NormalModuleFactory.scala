package typings.webpack.anon

import typings.webpack.mod.compilation.NormalModuleFactory_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalModuleFactory extends js.Object {
  var normalModuleFactory: NormalModuleFactory_
}

object NormalModuleFactory {
  @scala.inline
  def apply(normalModuleFactory: NormalModuleFactory_): NormalModuleFactory = {
    val __obj = js.Dynamic.literal(normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalModuleFactory]
  }
}

