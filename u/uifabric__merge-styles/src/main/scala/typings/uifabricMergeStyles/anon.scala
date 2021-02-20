package typings.uifabricMergeStyles

import typings.uifabricMergeStyles.istyleMod.IStyleBaseArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Classes extends StObject {
    
    var classes: js.Array[String] = js.native
    
    var objects: IStyleBaseArray = js.native
  }
  object Classes {
    
    @scala.inline
    def apply(classes: js.Array[String], objects: IStyleBaseArray): Classes = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes]
    }
    
    @scala.inline
    implicit class ClassesMutableBuilder[Self <: Classes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: js.Array[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesVarargs(value: String*): Self = StObject.set(x, "classes", js.Array(value :_*))
      
      @scala.inline
      def setObjects(value: IStyleBaseArray): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Css extends StObject {
    
    var css: String = js.native
    
    var html: String = js.native
  }
  object Css {
    
    @scala.inline
    def apply(css: String, html: String): Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
      __obj.asInstanceOf[Css]
    }
    
    @scala.inline
    implicit class CssMutableBuilder[Self <: Css] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    }
  }
}
