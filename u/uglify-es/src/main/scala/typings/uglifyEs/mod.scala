package typings.uglifyEs

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.uglifyJs.mod.MinifyOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglify-es", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def minify(files: String): MinifyOutput = js.native
  def minify(files: String, options: MinifyOptions): MinifyOutput = js.native
  def minify(files: js.Array[String]): MinifyOutput = js.native
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = js.native
  def minify(files: StringDictionary[String]): MinifyOutput = js.native
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = js.native
  @js.native
  object InlineFunctions extends js.Object {
    /* 0 */ val Disabled: typings.uglifyJs.mod.InlineFunctions.Disabled with Double = js.native
    /* 1 */ val SimpleFunctions: typings.uglifyJs.mod.InlineFunctions.SimpleFunctions with Double = js.native
    /* 2 */ val WithArguments: typings.uglifyJs.mod.InlineFunctions.WithArguments with Double = js.native
    /* 3 */ val WithArgumentsAndVariables: typings.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uglifyJs.mod.InlineFunctions with Double] = js.native
  }
  
  @js.native
  object OutputQuoteStyle extends js.Object {
    /* 2 */ val AlwaysDouble: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble with Double = js.native
    /* 3 */ val AlwaysOriginal: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal with Double = js.native
    /* 1 */ val AlwaysSingle: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle with Double = js.native
    /* 0 */ val PreferDouble: typings.uglifyJs.mod.OutputQuoteStyle.PreferDouble with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uglifyJs.mod.OutputQuoteStyle with Double] = js.native
  }
  
}

