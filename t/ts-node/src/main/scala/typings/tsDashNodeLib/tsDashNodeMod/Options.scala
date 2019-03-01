package typings
package tsDashNodeLib.tsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cache: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var cacheDirectory: js.UndefOr[java.lang.String] = js.undefined
  var compiler: js.UndefOr[java.lang.String] = js.undefined
  var compilerOptions: js.UndefOr[js.Object] = js.undefined
  var fileExists: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Boolean]] = js.undefined
  var files: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var ignore: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ignoreDiagnostics: js.UndefOr[scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])] = js.undefined
  var pretty: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var project: js.UndefOr[java.lang.String] = js.undefined
  var readFile: js.UndefOr[js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]]] = js.undefined
  var skipIgnore: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var skipProject: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var transformers: js.UndefOr[typescriptLib.typescriptMod.tsNs.CustomTransformers] = js.undefined
  var transpileOnly: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var typeCheck: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cacheDirectory: java.lang.String = null,
    compiler: java.lang.String = null,
    compilerOptions: js.Object = null,
    fileExists: js.Function1[/* path */ java.lang.String, scala.Boolean] = null,
    files: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: java.lang.String | js.Array[java.lang.String] = null,
    ignoreDiagnostics: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    project: java.lang.String = null,
    readFile: js.Function1[/* path */ java.lang.String, js.UndefOr[java.lang.String]] = null,
    skipIgnore: js.UndefOr[scala.Boolean] = js.undefined,
    skipProject: js.UndefOr[scala.Boolean] = js.undefined,
    transformers: typescriptLib.typescriptMod.tsNs.CustomTransformers = null,
    transpileOnly: js.UndefOr[scala.Boolean] = js.undefined,
    typeCheck: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (cacheDirectory != null) __obj.updateDynamic("cacheDirectory")(cacheDirectory)
    if (compiler != null) __obj.updateDynamic("compiler")(compiler)
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (fileExists != null) __obj.updateDynamic("fileExists")(fileExists)
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (ignoreDiagnostics != null) __obj.updateDynamic("ignoreDiagnostics")(ignoreDiagnostics.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (project != null) __obj.updateDynamic("project")(project)
    if (readFile != null) __obj.updateDynamic("readFile")(readFile)
    if (!js.isUndefined(skipIgnore)) __obj.updateDynamic("skipIgnore")(skipIgnore)
    if (!js.isUndefined(skipProject)) __obj.updateDynamic("skipProject")(skipProject)
    if (transformers != null) __obj.updateDynamic("transformers")(transformers)
    if (!js.isUndefined(transpileOnly)) __obj.updateDynamic("transpileOnly")(transpileOnly)
    if (!js.isUndefined(typeCheck)) __obj.updateDynamic("typeCheck")(typeCheck)
    __obj.asInstanceOf[Options]
  }
}

