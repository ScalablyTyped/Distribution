package typings.terminalKit.anon

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransparencyChar extends js.Object {
  var attr: Double | Attributes
  var transparencyChar: String
  var transparencyType: Double
}

object TransparencyChar {
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): TransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransparencyChar]
  }
}

