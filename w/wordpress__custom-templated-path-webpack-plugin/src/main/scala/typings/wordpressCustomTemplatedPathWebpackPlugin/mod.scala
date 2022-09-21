package typings.wordpressCustomTemplatedPathWebpackPlugin

import typings.std.Record
import typings.webpack.mod.Plugin
import typings.wordpressCustomTemplatedPathWebpackPlugin.anon.Basename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("@wordpress/custom-templated-path-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StObject {
    def this(template: Record[String, js.Function2[/* path */ String, /* data */ Basename, String]]) = this()
  }
  
  type CustomTemplatedPathPlugin = Plugin
}
