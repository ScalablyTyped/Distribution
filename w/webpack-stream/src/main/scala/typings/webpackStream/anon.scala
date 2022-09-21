package typings.webpackStream

import typings.webpack.mod.CallbackWebpack
import typings.webpack.mod.Compiler
import typings.webpack.mod.Configuration
import typings.webpack.mod.MultiCompiler
import typings.webpack.mod.MultiCompilerOptions
import typings.webpack.mod.MultiStats
import typings.webpack.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(options: js.Array[Configuration] & MultiCompilerOptions): MultiCompiler = js.native
    def apply(options: js.Array[Configuration] & MultiCompilerOptions, callback: CallbackWebpack[MultiStats]): MultiCompiler = js.native
    def apply(options: Configuration): Compiler = js.native
    def apply(options: Configuration, callback: CallbackWebpack[Stats]): Compiler = js.native
  }
}
