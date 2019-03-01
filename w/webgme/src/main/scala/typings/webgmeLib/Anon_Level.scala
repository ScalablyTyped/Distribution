package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: webgmeLib.GmeCommonNs.DefIntegerObject
  var name: webgmeLib.GmeCommonNs.DefStringObject
}

object Anon_Level {
  @scala.inline
  def apply(level: webgmeLib.GmeCommonNs.DefIntegerObject, name: webgmeLib.GmeCommonNs.DefStringObject): Anon_Level = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Level]
  }
}

