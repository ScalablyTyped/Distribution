package typings.webpackDashStream

import org.scalablytyped.runtime.Instantiable3
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.CompilerNs.Watching
import typings.webpack.webpackMod.CompilerNs.WatchingNs.Handler
import typings.webpack.webpackMod.CompilerNs.WatchingNs.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCompiler extends js.Object {
  var Watching: Instantiable3[
    /* compiler */ Compiler, 
    /* watchOptions */ WatchOptions, 
    /* handler */ Handler, 
    typings.webpack.webpackMod.CompilerNs.Watching
  ]
  val WatchingNs: js.Any
}

object TypeofCompiler {
  @scala.inline
  def apply(
    Watching: Instantiable3[
      /* compiler */ Compiler, 
      /* watchOptions */ WatchOptions, 
      /* handler */ Handler, 
      Watching
    ],
    WatchingNs: js.Any
  ): TypeofCompiler = {
    val __obj = js.Dynamic.literal(Watching = Watching, WatchingNs = WatchingNs)
  
    __obj.asInstanceOf[TypeofCompiler]
  }
}

