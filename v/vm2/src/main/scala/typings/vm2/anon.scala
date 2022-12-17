package typings.vm2

import typings.vm2.mod.CompilerFunction
import typings.vm2.vm2Strings.coffeescript
import typings.vm2.vm2Strings.commonjs
import typings.vm2.vm2Strings.javascript
import typings.vm2.vm2Strings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ColumnOffset extends StObject {
    
    var columnOffset: js.UndefOr[Double] = js.undefined
    
    var compiler: js.UndefOr[javascript | coffeescript | CompilerFunction] = js.undefined
    
    var lineOffset: js.UndefOr[Double] = js.undefined
  }
  object ColumnOffset {
    
    inline def apply(): ColumnOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOffset]
    }
    
    extension [Self <: ColumnOffset](x: Self) {
      
      inline def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
      
      inline def setColumnOffsetUndefined: Self = StObject.set(x, "columnOffset", js.undefined)
      
      inline def setCompiler(value: javascript | coffeescript | CompilerFunction): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerFunction2(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "compiler", js.Any.fromFunction2(value))
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
      
      inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    }
  }
  
  trait Compiler extends StObject {
    
    var columnOffset: js.UndefOr[Double] = js.undefined
    
    var compiler: js.UndefOr[javascript | coffeescript | CompilerFunction] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var lineOffset: js.UndefOr[Double] = js.undefined
  }
  object Compiler {
    
    inline def apply(): Compiler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Compiler]
    }
    
    extension [Self <: Compiler](x: Self) {
      
      inline def setColumnOffset(value: Double): Self = StObject.set(x, "columnOffset", value.asInstanceOf[js.Any])
      
      inline def setColumnOffsetUndefined: Self = StObject.set(x, "columnOffset", js.undefined)
      
      inline def setCompiler(value: javascript | coffeescript | CompilerFunction): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerFunction2(value: (/* code */ String, /* filename */ String) => String): Self = StObject.set(x, "compiler", js.Any.fromFunction2(value))
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setLineOffset(value: Double): Self = StObject.set(x, "lineOffset", value.asInstanceOf[js.Any])
      
      inline def setLineOffsetUndefined: Self = StObject.set(x, "lineOffset", js.undefined)
    }
  }
  
  trait Filename extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
  }
  object Filename {
    
    inline def apply(): Filename = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Filename]
    }
    
    extension [Self <: Filename](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  trait Modules extends StObject {
    
    var modules: js.Array[String]
    
    var transitive: Boolean
  }
  object Modules {
    
    inline def apply(modules: js.Array[String], transitive: Boolean): Modules = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], transitive = transitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modules]
    }
    
    extension [Self <: Modules](x: Self) {
      
      inline def setModules(value: js.Array[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: String*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setTransitive(value: Boolean): Self = StObject.set(x, "transitive", value.asInstanceOf[js.Any])
    }
  }
  
  trait Strict extends StObject {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: js.UndefOr[commonjs | none] = js.undefined
  }
  object Strict {
    
    inline def apply(): Strict = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Strict]
    }
    
    extension [Self <: Strict](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setWrapper(value: commonjs | none): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
}
