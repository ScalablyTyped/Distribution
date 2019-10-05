package typings.webpackDashStream

import org.scalablytyped.runtime.Instantiable3
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Compiler.Watching
import typings.webpack.webpackMod.Compiler.Watching.Handler
import typings.webpack.webpackMod.Compiler.Watching.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCompiler extends js.Object {
  var Watching: js.Any | (Instantiable3[
    /* compiler */ Compiler, 
    /* watchOptions */ WatchOptions, 
    /* handler */ Handler, 
    typings.webpack.webpackMod.Compiler.Watching
  ])
}

object TypeofCompiler {
  @scala.inline
  def apply(
    Watching: Instantiable3[
      /* compiler */ Compiler, 
      /* watchOptions */ WatchOptions, 
      /* handler */ Handler, 
      Watching
    ]
  ): TypeofCompiler = {
    val __obj = js.Dynamic.literal(Watching = Watching)
  
    __obj.asInstanceOf[TypeofCompiler]
  }
}

