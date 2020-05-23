package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  var `import`: scala.Double
  var validate: scala.Double
}

object Import {
  @scala.inline
  def apply(`import`: scala.Double, validate: scala.Double): Import = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Import]
  }
}

