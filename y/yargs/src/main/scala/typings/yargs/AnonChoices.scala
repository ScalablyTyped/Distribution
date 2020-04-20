package typings.yargs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChoices extends js.Object {
  var choices: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any
  ]
}

object AnonChoices {
  @scala.inline
  def apply(
    choices: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any
    ]
  ): AnonChoices = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChoices]
  }
}

