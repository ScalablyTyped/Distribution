package typings.unusedFilesWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ignore extends StObject {
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Ignore {
    
    @scala.inline
    def apply(): Ignore = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ignore]
    }
    
    @scala.inline
    implicit class IgnoreMutableBuilder[Self <: Ignore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    }
  }
}
