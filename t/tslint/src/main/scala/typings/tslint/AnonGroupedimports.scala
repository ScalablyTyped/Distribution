package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupedimports extends js.Object {
  var `grouped-imports`: Boolean
  var `import-sources-order`: String
  var `module-source-path`: String
  var `named-imports-order`: String
}

object AnonGroupedimports {
  @scala.inline
  def apply(
    `grouped-imports`: Boolean,
    `import-sources-order`: String,
    `module-source-path`: String,
    `named-imports-order`: String
  ): AnonGroupedimports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("grouped-imports")(`grouped-imports`.asInstanceOf[js.Any])
    __obj.updateDynamic("import-sources-order")(`import-sources-order`.asInstanceOf[js.Any])
    __obj.updateDynamic("module-source-path")(`module-source-path`.asInstanceOf[js.Any])
    __obj.updateDynamic("named-imports-order")(`named-imports-order`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupedimports]
  }
}

