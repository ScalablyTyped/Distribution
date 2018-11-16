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

