package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argv extends js.Object {
  var argv: js.Array[java.lang.String]
  var build_info: java.lang.String
  var exit_status: Double
  var platform_info: java.lang.String
  var version: js.Array[Double]
}

object Argv {
  @scala.inline
  def apply(
    argv: js.Array[java.lang.String],
    build_info: java.lang.String,
    exit_status: Double,
    platform_info: java.lang.String,
    version: js.Array[Double]
  ): Argv = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], build_info = build_info.asInstanceOf[js.Any], exit_status = exit_status.asInstanceOf[js.Any], platform_info = platform_info.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argv]
  }
}

