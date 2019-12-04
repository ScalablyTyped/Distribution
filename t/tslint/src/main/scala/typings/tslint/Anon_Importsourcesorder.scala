package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Importsourcesorder extends js.Object {
  var `import-sources-order`: String
  var `module-source-path`: String
  var `named-imports-order`: String
}

object Anon_Importsourcesorder {
  @scala.inline
  def apply(`import-sources-order`: String, `module-source-path`: String, `named-imports-order`: String): Anon_Importsourcesorder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("import-sources-order")(`import-sources-order`.asInstanceOf[js.Any])
    __obj.updateDynamic("module-source-path")(`module-source-path`.asInstanceOf[js.Any])
    __obj.updateDynamic("named-imports-order")(`named-imports-order`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Importsourcesorder]
  }
}

