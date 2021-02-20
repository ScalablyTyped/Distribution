package typings.svg2png

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg2png", JSImport.Namespace)
  @js.native
  def apply(sourceBuffer: Buffer): js.Promise[Buffer] = js.native
  @JSImport("svg2png", JSImport.Namespace)
  @js.native
  def apply(sourceBuffer: Buffer, opts: opts): js.Promise[Buffer] = js.native
  
  @JSImport("svg2png", "sync")
  @js.native
  def sync(sourceBuffer: Buffer): Buffer = js.native
  @JSImport("svg2png", "sync")
  @js.native
  def sync(sourceBuffer: Buffer, opts: opts): Buffer = js.native
  
  @js.native
  trait opts extends StObject {
    
    var fileName: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object opts {
    
    @scala.inline
    def apply(): opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[opts]
    }
    
    @scala.inline
    implicit class optsMutableBuilder[Self <: opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
