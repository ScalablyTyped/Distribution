package typings.atUifabricMergeDashStyles.libStyleToClassNameMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegistration extends js.Object {
  var args: js.Array[IStyle]
  var className: String
  var key: String
  var rulesToInsert: js.Array[String]
}

object IRegistration {
  @scala.inline
  def apply(args: js.Array[IStyle], className: String, key: String, rulesToInsert: js.Array[String]): IRegistration = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rulesToInsert = rulesToInsert.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRegistration]
  }
}

