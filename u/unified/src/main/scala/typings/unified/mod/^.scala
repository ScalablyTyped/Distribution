package typings.unified.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("unified", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Unified processor allows plugins, parsers, and compilers to be chained together to transform content.
    *
    * @typeParam P Processor settings. Useful when packaging unified with a preset parser and compiler.
    */
  def apply[P](): Processor[P] = js.native
}
