package typings.webpackValidator.mod

import typings.webpack.mod.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-validator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Validate your webpack configs with joi
    */
  def apply(config: Configuration): Configuration = js.native
  /**
    * Validate your webpack configs with joi
    */
  def apply(config: Configuration, options: ValidationOptions): Configuration = js.native
}

