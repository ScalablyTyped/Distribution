package typings.themeUiCore

import typings.react.mod.ReactNode
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var context: ColorMode
  }
  object Children {
    
    inline def apply(context: ColorMode): Children = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: ColorMode): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorMode extends StObject {
    
    var __EMOTION_VERSION__ : String
    
    var colorMode: js.UndefOr[String] = js.undefined
    
    var setColorMode: js.UndefOr[js.Function1[/* colorMode */ SetStateAction[js.UndefOr[String]], Unit]] = js.undefined
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
  }
  object ColorMode {
    
    inline def apply(
      __EMOTION_VERSION__ : String,
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
    ): ColorMode = {
      val __obj = js.Dynamic.literal(__EMOTION_VERSION__ = __EMOTION_VERSION__.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorMode]
    }
    
    extension [Self <: ColorMode](x: Self) {
      
      inline def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
      
      inline def setColorModeUndefined: Self = StObject.set(x, "colorMode", js.undefined)
      
      inline def setSetColorMode(value: /* colorMode */ SetStateAction[js.UndefOr[String]] => Unit): Self = StObject.set(x, "setColorMode", js.Any.fromFunction1(value))
      
      inline def setSetColorModeUndefined: Self = StObject.set(x, "setColorMode", js.undefined)
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def set__EMOTION_VERSION__(value: String): Self = StObject.set(x, "__EMOTION_VERSION__", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnNumber extends StObject {
    
    var columnNumber: Double
    
    var filename: String
    
    var lineNumber: Double
  }
  object ColumnNumber {
    
    inline def apply(columnNumber: Double, filename: String, lineNumber: Double): ColumnNumber = {
      val __obj = js.Dynamic.literal(columnNumber = columnNumber.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnNumber]
    }
    
    extension [Self <: ColumnNumber](x: Self) {
      
      inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[A, B](a: A, B: B): A & B = js.native
    def apply[A, B, C](a: A, B: B, c: C): A & B & C = js.native
    def apply[A, B, C, D](a: A, B: B, c: C, d: D): A & B & C & D = js.native
  }
}
