package typings.webpackServe

import typings.node.netMod.Server
import typings.webpackServe.mod.InitializedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compiler extends StObject {
    
    var compiler: typings.webpack.mod.Compiler
  }
  object Compiler {
    
    inline def apply(compiler: typings.webpack.mod.Compiler): Compiler = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compiler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compiler] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: typings.webpack.mod.Compiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompilerStats extends StObject {
    
    var compiler: typings.webpack.mod.Compiler
    
    var stats: Any
  }
  object CompilerStats {
    
    inline def apply(compiler: typings.webpack.mod.Compiler, stats: Any): CompilerStats = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompilerStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompilerStats] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: typings.webpack.mod.Compiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: InitializedOptions
    
    var server: Server
  }
  object Options {
    
    inline def apply(options: InitializedOptions, server: Server): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: InitializedOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var compiler: typings.webpack.mod.Compiler
    
    var stats: typings.webpack.mod.Stats
  }
  object Stats {
    
    inline def apply(compiler: typings.webpack.mod.Compiler, stats: typings.webpack.mod.Stats): Stats = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      inline def setCompiler(value: typings.webpack.mod.Compiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setStats(value: typings.webpack.mod.Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
