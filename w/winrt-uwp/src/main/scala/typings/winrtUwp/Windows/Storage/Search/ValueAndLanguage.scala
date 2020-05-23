package typings.winrtUwp.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the language of a property, as a BCP-47 language code. */
trait ValueAndLanguage extends js.Object {
  /** Gets or sets the language of the property value, specified as a BCP-47 language code. */
  var language: String
  /** Gets or sets the property value for the current ValueAndLanguage . */
  var value: js.Any
}

object ValueAndLanguage {
  @scala.inline
  def apply(language: String, value: js.Any): ValueAndLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAndLanguage]
  }
}

