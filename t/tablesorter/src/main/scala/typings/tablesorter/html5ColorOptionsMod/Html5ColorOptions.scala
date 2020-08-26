package typings.tablesorter.html5ColorOptionsMod

import typings.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.previewableOptionsMod.PreviewableOptions
import typings.tablesorter.strictOptionsMod.StrictOptions
import typings.tablesorter.testableOptionsMod.TestableOptions
import typings.tablesorter.toggleableOptionsMod.ToggleableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Html5ColorOptions
  extends DefaultValueOptions[String]
     with ToggleableOptions
     with StrictOptions
     with PreviewableOptions
     with TestableOptions

object Html5ColorOptions {
  @scala.inline
  def apply(): Html5ColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html5ColorOptions]
  }
}

