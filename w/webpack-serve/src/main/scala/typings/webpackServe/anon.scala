package typings.webpackServe

import typings.node.netMod.Server
import typings.webpackServe.mod.InitializedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compiler extends StObject {
    
    var compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
  }
  object Compiler {
    
    inline def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Compiler = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
      __obj.asInstanceOf[Compiler]
    }
    
    extension [Self <: Compiler](x: Self) {
      
      inline def setCompiler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: InitializedOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stats extends StObject {
    
    var compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    
    var stats: js.Any
  }
  object Stats {
    
    inline def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
      stats: js.Any
    ): Stats = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setCompiler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setStats(value: js.Any): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
