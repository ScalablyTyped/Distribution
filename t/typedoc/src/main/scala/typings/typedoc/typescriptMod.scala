package typings.typedoc

import typings.typedoc.componentMod.AbstractComponent
import typings.typedoc.optionsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/typescript", JSImport.Namespace)
@js.native
object typescriptMod extends js.Object {
  @js.native
  class TypeScriptSource () extends AbstractComponent[Options] {
    var addTSOption: js.Any = js.native
    var declarations: js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TypeScriptSource extends js.Object {
    var IGNORED: js.Array[String] = js.native
  }
  
}

