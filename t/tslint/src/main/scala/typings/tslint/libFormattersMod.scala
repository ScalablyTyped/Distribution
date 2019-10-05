package typings.tslint

import typings.tslint.libFormattersCodeFrameFormatterMod.Formatter
import typings.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/formatters", JSImport.Namespace)
@js.native
object libFormattersMod extends js.Object {
  @js.native
  abstract class AbstractFormatter ()
    extends typings.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
  
  @js.native
  class CodeFrameFormatter () extends Formatter
  
  @js.native
  class FileslistFormatter ()
    extends typings.tslint.libFormattersFileslistFormatterMod.Formatter
  
  @js.native
  class JUnitFormatter ()
    extends typings.tslint.libFormattersJunitFormatterMod.Formatter
  
  @js.native
  class JsonFormatter ()
    extends typings.tslint.libFormattersJsonFormatterMod.Formatter
  
  @js.native
  class PmdFormatter ()
    extends typings.tslint.libFormattersPmdFormatterMod.Formatter
  
  @js.native
  class ProseFormatter ()
    extends typings.tslint.libFormattersProseFormatterMod.Formatter
  
  @js.native
  class StylishFormatter ()
    extends typings.tslint.libFormattersStylishFormatterMod.Formatter
  
  @js.native
  class TapFormatter ()
    extends typings.tslint.libFormattersTapFormatterMod.Formatter
  
  @js.native
  class VerboseFormatter ()
    extends typings.tslint.libFormattersVerboseFormatterMod.Formatter
  
  /* static members */
  @js.native
  object AbstractFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object CodeFrameFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object FileslistFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object JUnitFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object JsonFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object PmdFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object ProseFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object StylishFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object TapFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
  /* static members */
  @js.native
  object VerboseFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

