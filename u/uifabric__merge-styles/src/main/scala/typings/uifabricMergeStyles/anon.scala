package typings.uifabricMergeStyles

import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Classes extends StObject {
    
    var classes: js.Array[String]
    
    var objects: IStyleBaseArray
  }
  object Classes {
    
    inline def apply(classes: js.Array[String], objects: IStyleBaseArray): Classes = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    extension [Self <: Classes](x: Self) {
      
      inline def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      inline def setObjects(value: IStyleBaseArray): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    }
  }
  
  trait Css extends StObject {
    
    var css: String
    
    var html: String
  }
  object Css {
    
    inline def apply(css: String, html: String): Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    extension [Self <: Css](x: Self) {
      
      inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
}
