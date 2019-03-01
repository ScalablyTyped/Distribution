package typings
package stylusLib.stylusMod.StylusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var Evaluator: js.UndefOr[org.scalablytyped.runtime.Instantiable0[Evaluator]] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var functions: js.UndefOr[Dictionary[_]] = js.undefined
  var globals: js.UndefOr[Dictionary[_]] = js.undefined
  var imports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var paths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    Evaluator: org.scalablytyped.runtime.Instantiable0[Evaluator] = null,
    filename: java.lang.String = null,
    functions: Dictionary[_] = null,
    globals: Dictionary[_] = null,
    imports: js.Array[java.lang.String] = null,
    paths: js.Array[java.lang.String] = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (Evaluator != null) __obj.updateDynamic("Evaluator")(Evaluator)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (functions != null) __obj.updateDynamic("functions")(functions)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (imports != null) __obj.updateDynamic("imports")(imports)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    __obj.asInstanceOf[RenderOptions]
  }
}

