package typings.webpack.webpackMod

import typings.webpack.Anon_IdNumber
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackMod.compilation.Chunk
import typings.webpack.webpackMod.compilation.ModuleTemplate
import typings.webpackDashSources.webpackDashSourcesMod.ConcatSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "Template")
@js.native
object Template extends js.Object {
  def asString(str: String): String = js.native
  def asString(str: js.Array[String]): String = js.native
  def getFunctionContent(fn: js.Function1[/* repeated */ js.Any, _]): String = js.native
  def getModulesArrayBounds(modules: js.Array[Anon_IdNumber]): (js.Tuple2[Double, Double]) | `false` = js.native
  def indent(s: String): String = js.native
  def indent(s: js.Array[String]): String = js.native
  def numberToIdentifer(n: Double): String = js.native
  def prefix(s: String, prefix: String): String = js.native
  def prefix(s: js.Array[String], prefix: String): String = js.native
  def renderChunkModules(
    chunk: Chunk,
    filterFn: js.Function2[
      /* module */ typings.webpack.webpackMod.compilation.Module, 
      /* num */ Double, 
      Boolean
    ],
    moduleTemplate: ModuleTemplate,
    dependencyTemplates: js.Any
  ): ConcatSource = js.native
  def renderChunkModules(
    chunk: Chunk,
    filterFn: js.Function2[
      /* module */ typings.webpack.webpackMod.compilation.Module, 
      /* num */ Double, 
      Boolean
    ],
    moduleTemplate: ModuleTemplate,
    dependencyTemplates: js.Any,
    prefix: String
  ): ConcatSource = js.native
  def toComment(str: String): String = js.native
  def toIdentifier(str: String): String = js.native
  def toNormalComment(str: String): String = js.native
  def toPath(str: String): String = js.native
}

