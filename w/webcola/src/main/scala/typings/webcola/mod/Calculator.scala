package typings.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcola", "Calculator")
@js.native
class Calculator[Link] protected ()
  extends typings.webcola.shortestpathsMod.Calculator[Link] {
  def this(
    n: Double,
    es: js.Array[Link],
    getSourceIndex: js.Function1[/* l */ Link, Double],
    getTargetIndex: js.Function1[/* l */ Link, Double],
    getLength: js.Function1[/* l */ Link, Double]
  ) = this()
}
