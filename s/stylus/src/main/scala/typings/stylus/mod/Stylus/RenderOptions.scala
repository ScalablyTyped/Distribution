package typings.stylus.mod.Stylus

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var Evaluator: js.UndefOr[Instantiable0[typings.stylus.mod.Stylus.Evaluator]] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var functions: js.UndefOr[Dictionary[_]] = js.undefined
  var globals: js.UndefOr[Dictionary[_]] = js.undefined
  var imports: js.UndefOr[js.Array[String]] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    Evaluator: Instantiable0[Evaluator] = null,
    filename: String = null,
    functions: Dictionary[_] = null,
    globals: Dictionary[_] = null,
    imports: js.Array[String] = null,
    paths: js.Array[String] = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (Evaluator != null) __obj.updateDynamic("Evaluator")(Evaluator.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

