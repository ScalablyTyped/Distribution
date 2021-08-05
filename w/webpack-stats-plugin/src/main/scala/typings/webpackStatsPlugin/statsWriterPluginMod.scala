package typings.webpackStatsPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statsWriterPluginMod {
  
  @JSImport("webpack-stats-plugin/lib/stats-writer-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with StatsWriterPlugin {
    def this(opts: Options) = this()
  }
  
  trait Options extends StObject {
    
    /**
      * fields of stats obj to keep
      * @default ['assetsByChunkName']
      */
    var fields: js.UndefOr[Null | js.Array[String]] = js.undefined
    
    /**
      * output file name
      * @default 'stats.json'
      */
    var filename: js.UndefOr[String] = js.undefined
    
    /**
      * stats config object or string preset
      * @default {}
      */
    var stats: js.UndefOr[StringDictionary[js.Any] | String] = js.undefined
    
    /**
      * transform stats obj
      * @default JSON.stringify()
      */
    var transform: js.UndefOr[TransformFunc] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsNull: Self = StObject.set(x, "fields", null)
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setStats(value: StringDictionary[js.Any] | String): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      inline def setTransform(
        value: (/* data */ StringDictionary[js.Any], /* options */ js.UndefOr[TransformOptions]) => String | js.Promise[String]
      ): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  @js.native
  trait StatsWriterPlugin
    extends StObject
       with Plugin {
    
    def emitStats(
      curCompiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): js.Promise[String] = js.native
    def emitStats(
      curCompiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any,
      callback: TransformFunc
    ): js.Promise[Unit] = js.native
  }
  
  /**
    * transform function
    */
  type TransformFunc = js.Function2[
    /* data */ StringDictionary[js.Any], 
    /* options */ js.UndefOr[TransformOptions], 
    String | js.Promise[String]
  ]
  
  trait TransformOptions extends StObject {
    
    /** Current compiler instance */
    var compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  }
  object TransformOptions {
    
    inline def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
    ): TransformOptions = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformOptions]
    }
    
    extension [Self <: TransformOptions](x: Self) {
      
      inline def setCompiler(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    }
  }
}
