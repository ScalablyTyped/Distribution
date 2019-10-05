package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/readers", JSImport.Namespace)
@js.native
object distLibUtilsOptionsReadersMod extends js.Object {
  @js.native
  class ArgumentsReader ()
    extends typings.typedoc.distLibUtilsOptionsReadersArgumentsMod.ArgumentsReader
  
  @js.native
  class TSConfigReader ()
    extends typings.typedoc.distLibUtilsOptionsReadersTsconfigMod.TSConfigReader
  
  @js.native
  class TypedocReader ()
    extends typings.typedoc.distLibUtilsOptionsReadersTypedocMod.TypedocReader
  
  /* static members */
  @js.native
  object TSConfigReader extends js.Object {
    var OPTIONS_KEY: js.Any = js.native
    var PROJECT_KEY: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TypedocReader extends js.Object {
    var OPTIONS_KEY: js.Any = js.native
  }
  
}

