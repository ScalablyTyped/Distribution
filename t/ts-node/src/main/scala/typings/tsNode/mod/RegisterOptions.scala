package typings.tsNode.mod

import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends CreateOptions

object RegisterOptions {
  @scala.inline
  def apply(
    compiler: String = null,
    compilerOptions: js.Object = null,
    dir: String = null,
    fileExists: /* path */ String => Boolean = null,
    files: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String] = null,
    ignoreDiagnostics: js.Array[Double | String] = null,
    logError: js.UndefOr[Boolean] = js.undefined,
    preferTsExts: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    project: String = null,
    readFile: /* path */ String => js.UndefOr[String] = null,
    scope: js.UndefOr[Boolean] = js.undefined,
    skipIgnore: js.UndefOr[Boolean] = js.undefined,
    skipProject: js.UndefOr[Boolean] = js.undefined,
    transformers: CustomTransformers | (js.Function1[/* p */ Program, CustomTransformers]) = null,
    transpileOnly: js.UndefOr[Boolean] = js.undefined,
    typeCheck: js.UndefOr[Boolean] = js.undefined
  ): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (compiler != null) __obj.updateDynamic("compiler")(compiler.asInstanceOf[js.Any])
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (fileExists != null) __obj.updateDynamic("fileExists")(js.Any.fromFunction1(fileExists))
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (ignoreDiagnostics != null) __obj.updateDynamic("ignoreDiagnostics")(ignoreDiagnostics.asInstanceOf[js.Any])
    if (!js.isUndefined(logError)) __obj.updateDynamic("logError")(logError.asInstanceOf[js.Any])
    if (!js.isUndefined(preferTsExts)) __obj.updateDynamic("preferTsExts")(preferTsExts.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction1(readFile))
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipIgnore)) __obj.updateDynamic("skipIgnore")(skipIgnore.asInstanceOf[js.Any])
    if (!js.isUndefined(skipProject)) __obj.updateDynamic("skipProject")(skipProject.asInstanceOf[js.Any])
    if (transformers != null) __obj.updateDynamic("transformers")(transformers.asInstanceOf[js.Any])
    if (!js.isUndefined(transpileOnly)) __obj.updateDynamic("transpileOnly")(transpileOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(typeCheck)) __obj.updateDynamic("typeCheck")(typeCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOptions]
  }
}

