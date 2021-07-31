package typings.uglifyEs

import org.scalablytyped.runtime.StringDictionary
import typings.uglifyJs.mod.MinifyOptions
import typings.uglifyJs.mod.MinifyOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uglify-es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uglify-es", "InlineFunctions")
  @js.native
  object InlineFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uglifyJs.mod.InlineFunctions & Double] = js.native
    
    /* 0 */ val Disabled: typings.uglifyJs.mod.InlineFunctions.Disabled & Double = js.native
    
    /* 1 */ val SimpleFunctions: typings.uglifyJs.mod.InlineFunctions.SimpleFunctions & Double = js.native
    
    /* 2 */ val WithArguments: typings.uglifyJs.mod.InlineFunctions.WithArguments & Double = js.native
    
    /* 3 */ val WithArgumentsAndVariables: typings.uglifyJs.mod.InlineFunctions.WithArgumentsAndVariables & Double = js.native
  }
  
  @JSImport("uglify-es", "OutputQuoteStyle")
  @js.native
  object OutputQuoteStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uglifyJs.mod.OutputQuoteStyle & Double] = js.native
    
    /* 2 */ val AlwaysDouble: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysDouble & Double = js.native
    
    /* 3 */ val AlwaysOriginal: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysOriginal & Double = js.native
    
    /* 1 */ val AlwaysSingle: typings.uglifyJs.mod.OutputQuoteStyle.AlwaysSingle & Double = js.native
    
    /* 0 */ val PreferDouble: typings.uglifyJs.mod.OutputQuoteStyle.PreferDouble & Double = js.native
  }
  
  @scala.inline
  def minify(files: String): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
  @scala.inline
  def minify(files: String, options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
  @scala.inline
  def minify(files: js.Array[String]): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
  @scala.inline
  def minify(files: js.Array[String], options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
  @scala.inline
  def minify(files: StringDictionary[String]): MinifyOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any]).asInstanceOf[MinifyOutput]
  @scala.inline
  def minify(files: StringDictionary[String], options: MinifyOptions): MinifyOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("minify")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MinifyOutput]
}
