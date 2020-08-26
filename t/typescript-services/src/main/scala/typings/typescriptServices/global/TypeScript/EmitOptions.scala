package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EmitOptions")
@js.native
class EmitOptions protected ()
  extends typings.typescriptServices.TypeScript.EmitOptions {
  def this(
    compiler: typings.typescriptServices.TypeScript.TypeScriptCompiler,
    resolvePath: js.Function1[/* path */ String, String]
  ) = this()
}

