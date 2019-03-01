package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranspileOptions extends js.Object {
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var moduleName: js.UndefOr[java.lang.String] = js.undefined
  var renamedDependencies: js.UndefOr[MapLike[java.lang.String]] = js.undefined
  var reportDiagnostics: js.UndefOr[scala.Boolean] = js.undefined
  var transformers: js.UndefOr[CustomTransformers] = js.undefined
}

object TranspileOptions {
  @scala.inline
  def apply(
    compilerOptions: CompilerOptions = null,
    fileName: java.lang.String = null,
    moduleName: java.lang.String = null,
    renamedDependencies: MapLike[java.lang.String] = null,
    reportDiagnostics: js.UndefOr[scala.Boolean] = js.undefined,
    transformers: CustomTransformers = null
  ): TranspileOptions = {
    val __obj = js.Dynamic.literal()
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName)
    if (renamedDependencies != null) __obj.updateDynamic("renamedDependencies")(renamedDependencies)
    if (!js.isUndefined(reportDiagnostics)) __obj.updateDynamic("reportDiagnostics")(reportDiagnostics)
    if (transformers != null) __obj.updateDynamic("transformers")(transformers)
    __obj.asInstanceOf[TranspileOptions]
  }
}

