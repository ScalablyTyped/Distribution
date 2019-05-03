package typings
package yeomanDashEnvironmentLib.yeomanDashEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantiateOptions extends js.Object {
  var arguments: java.lang.String | js.Array[java.lang.String]
  var options: Options
}

object InstantiateOptions {
  @scala.inline
  def apply(arguments: java.lang.String | js.Array[java.lang.String], options: Options): InstantiateOptions = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], options = options)
  
    __obj.asInstanceOf[InstantiateOptions]
  }
}

