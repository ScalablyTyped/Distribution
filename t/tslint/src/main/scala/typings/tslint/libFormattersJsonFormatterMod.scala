package typings.tslint

import typings.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters/jsonFormatter", JSImport.Namespace)
@js.native
object libFormattersJsonFormatterMod extends js.Object {
  @js.native
  class Formatter () extends AbstractFormatter
  
  /* static members */
  @js.native
  object Formatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

