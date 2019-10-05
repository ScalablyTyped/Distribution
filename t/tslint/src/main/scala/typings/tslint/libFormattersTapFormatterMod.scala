package typings.tslint

import typings.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters/tapFormatter", JSImport.Namespace)
@js.native
object libFormattersTapFormatterMod extends js.Object {
  @js.native
  class Formatter () extends AbstractFormatter {
    var mapToMessages: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

