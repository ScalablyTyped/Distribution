package typings.terserWebpackPlugin

import typings.terserWebpackPlugin.mod.DefinedDefaultMinimizerAndOptions
import typings.terserWebpackPlugin.mod.MinimizerImplementation
import typings.terserWebpackPlugin.mod.MinimizerOptions
import typings.terserWebpackPlugin.terserWebpackPluginStrings.comment1
import typings.terserWebpackPlugin.terserWebpackPluginStrings.comment2
import typings.terserWebpackPlugin.terserWebpackPluginStrings.comment3
import typings.terserWebpackPlugin.terserWebpackPluginStrings.comment4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Col extends StObject {
    
    var col: Double
    
    var line: Double
    
    var pos: Double
    
    var `type`: comment1 | comment2 | comment3 | comment4
    
    var value: String
  }
  object Col {
    
    inline def apply(
      col: Double,
      line: Double,
      pos: Double,
      `type`: comment1 | comment2 | comment3 | comment4,
      value: String
    ): Col = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Col]
    }
    
    extension [Self <: Col](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setType(value: comment1 | comment2 | comment3 | comment4): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Implementation[T] extends StObject {
    
    var implementation: MinimizerImplementation[T]
    
    var options: MinimizerOptions[T]
  }
  object Implementation {
    
    inline def apply[T](implementation: MinimizerImplementation[T], options: MinimizerOptions[T]): Implementation[T] = {
      val __obj = js.Dynamic.literal(implementation = implementation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Implementation[T]]
    }
    
    extension [Self <: Implementation[?], T](x: Self & Implementation[T]) {
      
      inline def setImplementation(value: MinimizerImplementation[T]): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: MinimizerOptions[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Minify[T]
    extends StObject
       with DefinedDefaultMinimizerAndOptions[T] {
    
    var minify: js.UndefOr[MinimizerImplementation[T]] = js.undefined
    
    var terserOptions: js.UndefOr[MinimizerOptions[T]] = js.undefined
  }
  object Minify {
    
    inline def apply[T](): Minify[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Minify[T]]
    }
    
    extension [Self <: Minify[?], T](x: Self & Minify[T]) {
      
      inline def setMinify(value: MinimizerImplementation[T]): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setTerserOptions(value: MinimizerOptions[T]): Self = StObject.set(x, "terserOptions", value.asInstanceOf[js.Any])
      
      inline def setTerserOptionsUndefined: Self = StObject.set(x, "terserOptions", js.undefined)
    }
  }
  
  trait TerserOptions[T]
    extends StObject
       with DefinedDefaultMinimizerAndOptions[T] {
    
    var minify: MinimizerImplementation[T]
    
    var terserOptions: js.UndefOr[MinimizerOptions[T]] = js.undefined
  }
  object TerserOptions {
    
    inline def apply[T](minify: MinimizerImplementation[T]): TerserOptions[T] = {
      val __obj = js.Dynamic.literal(minify = minify.asInstanceOf[js.Any])
      __obj.asInstanceOf[TerserOptions[T]]
    }
    
    extension [Self <: TerserOptions[?], T](x: Self & TerserOptions[T]) {
      
      inline def setMinify(value: MinimizerImplementation[T]): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setTerserOptions(value: MinimizerOptions[T]): Self = StObject.set(x, "terserOptions", value.asInstanceOf[js.Any])
      
      inline def setTerserOptionsUndefined: Self = StObject.set(x, "terserOptions", js.undefined)
    }
  }
}
