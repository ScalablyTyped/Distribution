package typings.stylableCore.mod

import typings.postcss.mod.Root_
import typings.stylableCore.stylableMetaMod.Imported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "removeUnusedRules")
@js.native
object removeUnusedRules extends js.Object {
  
  def apply(
    ast: Root_,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    _import: Imported,
    usedFiles: js.Array[String],
    resolvePath: js.Function2[/* ctx */ String, /* path */ String, String]
  ): Unit = js.native
}
