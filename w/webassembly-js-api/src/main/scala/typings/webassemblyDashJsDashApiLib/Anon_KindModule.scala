package typings
package webassemblyDashJsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KindModule extends js.Object {
  var kind: java.lang.String
  var module: java.lang.String
  var name: java.lang.String
}

object Anon_KindModule {
  @scala.inline
  def apply(kind: java.lang.String, module: java.lang.String, name: java.lang.String): Anon_KindModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_KindModule]
  }
}

