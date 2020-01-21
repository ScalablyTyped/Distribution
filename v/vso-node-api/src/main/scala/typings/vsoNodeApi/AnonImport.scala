package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImport extends js.Object {
  var `import`: Double
  var validate: Double
}

object AnonImport {
  @scala.inline
  def apply(`import`: Double, validate: Double): AnonImport = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImport]
  }
}

