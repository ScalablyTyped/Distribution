package typings.yeomanDashEnvironment.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantiateOptions extends js.Object {
  var arguments: String | js.Array[String]
  var options: Options
}

object InstantiateOptions {
  @scala.inline
  def apply(arguments: String | js.Array[String], options: Options): InstantiateOptions = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], options = options)
  
    __obj.asInstanceOf[InstantiateOptions]
  }
}

