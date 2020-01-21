package typings.webpack

import typings.webpack.mod.compilation.NormalModuleFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNormalModuleFactory extends js.Object {
  var normalModuleFactory: NormalModuleFactory
}

object AnonNormalModuleFactory {
  @scala.inline
  def apply(normalModuleFactory: NormalModuleFactory): AnonNormalModuleFactory = {
    val __obj = js.Dynamic.literal(normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNormalModuleFactory]
  }
}

