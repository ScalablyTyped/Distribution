package typings.usage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rss extends StObject {
    
    var rss: Double
    
    var vsize: Double
  }
  object Rss {
    
    @scala.inline
    def apply(rss: Double, vsize: Double): Rss = {
      val __obj = js.Dynamic.literal(rss = rss.asInstanceOf[js.Any], vsize = vsize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rss]
    }
    
    @scala.inline
    implicit class RssMutableBuilder[Self <: Rss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRss(value: Double): Self = StObject.set(x, "rss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVsize(value: Double): Self = StObject.set(x, "vsize", value.asInstanceOf[js.Any])
    }
  }
}
