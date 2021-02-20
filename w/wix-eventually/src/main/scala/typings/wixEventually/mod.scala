package typings.wixEventually

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wix-eventually", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function): js.Promise[Unit] = js.native
  @JSImport("wix-eventually", JSImport.Namespace)
  @js.native
  def apply(fn: js.Function, opts: Opts): js.Promise[Unit] = js.native
  
  @JSImport("wix-eventually", "_with")
  @js.native
  def _with(overrides: Opts): js.Function2[/* fn */ js.Function, /* opts */ js.UndefOr[Opts], js.Promise[Unit]] = js.native
  
  @js.native
  trait Opts extends StObject {
    
    var interval: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Opts {
    
    @scala.inline
    def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @JSImport("wix-eventually", "with")
  @js.native
  def `with`(overrides: Opts): js.Function2[/* fn */ js.Function, /* opts */ js.UndefOr[Opts], js.Promise[Unit]] = js.native
}
