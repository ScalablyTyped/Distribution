package typings.terraThemeContext

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    /**
      * The current application theme className.
      * The default theme is indicated as undefined.
      */
    var className: js.UndefOr[String] = js.undefined
  }
  object ClassName {
    
    inline def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  trait ClassNameRequireable extends StObject {
    
    var className: Requireable[String]
  }
  object ClassNameRequireable {
    
    inline def apply(className: Requireable[String]): ClassNameRequireable = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassNameRequireable]
    }
    
    extension [Self <: ClassNameRequireable](x: Self) {
      
      inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
