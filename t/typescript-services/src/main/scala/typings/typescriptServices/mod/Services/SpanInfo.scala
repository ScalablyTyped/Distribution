package typings.typescriptServices.mod.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.SpanInfo")
@js.native
class SpanInfo protected ()
  extends typings.typescriptServices.TypeScript.Services.SpanInfo {
  def this(minChar: Double, limChar: Double) = this()
  def this(minChar: Double, limChar: Double, text: String) = this()
  /* CompleteClass */
  override var limChar: Double = js.native
  /* CompleteClass */
  override var minChar: Double = js.native
  /* CompleteClass */
  override var text: String = js.native
}

