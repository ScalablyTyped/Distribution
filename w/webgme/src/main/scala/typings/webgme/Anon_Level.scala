package typings.webgme

import typings.webgme.GmeCommonNs.DefIntegerObject
import typings.webgme.GmeCommonNs.DefStringObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: DefIntegerObject
  var name: DefStringObject
}

object Anon_Level {
  @scala.inline
  def apply(level: DefIntegerObject, name: DefStringObject): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level, name = name)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

