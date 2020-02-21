package typings.webpack

import typings.webpack.mod.compilation.NormalModuleFactory_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNormalModuleFactory extends js.Object {
  var normalModuleFactory: NormalModuleFactory_
}

object AnonNormalModuleFactory {
  @scala.inline
  def apply(normalModuleFactory: NormalModuleFactory_): AnonNormalModuleFactory = {
    val __obj = js.Dynamic.literal(normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNormalModuleFactory]
  }
}

