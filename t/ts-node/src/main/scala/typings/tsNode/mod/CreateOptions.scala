package typings.tsNode.mod

import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  var compiler: js.UndefOr[String] = js.undefined
  var compilerOptions: js.UndefOr[js.Object] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var fileExists: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
  var files: js.UndefOr[Boolean | Null] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var ignoreDiagnostics: js.UndefOr[js.Array[Double | String]] = js.undefined
  var logError: js.UndefOr[Boolean | Null] = js.undefined
  var preferTsExts: js.UndefOr[Boolean | Null] = js.undefined
  var pretty: js.UndefOr[Boolean | Null] = js.undefined
  var project: js.UndefOr[String] = js.undefined
  var readFile: js.UndefOr[js.Function1[/* path */ String, js.UndefOr[String]]] = js.undefined
  var scope: js.UndefOr[Boolean | Null] = js.undefined
  var skipIgnore: js.UndefOr[Boolean | Null] = js.undefined
  var skipProject: js.UndefOr[Boolean | Null] = js.undefined
  var transformers: js.UndefOr[CustomTransformers | (js.Function1[/* p */ Program, CustomTransformers])] = js.undefined
  var transpileOnly: js.UndefOr[Boolean | Null] = js.undefined
  var typeCheck: js.UndefOr[Boolean | Null] = js.undefined
}

object CreateOptions {
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
  ): CreateOptions = {
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
    __obj.asInstanceOf[CreateOptions]
  }
}

