package typings.through2Map

import typings.node.streamMod.DuplexOptions
import typings.through2.mod.Through2Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("through2-map", JSImport.Namespace)
  @js.native
  def apply(): Through2Constructor = js.native
  @JSImport("through2-map", JSImport.Namespace)
  @js.native
  def apply(fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", JSImport.Namespace)
  @js.native
  def apply(options: js.UndefOr[scala.Nothing], fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", JSImport.Namespace)
  @js.native
  def apply(options: Through2MapOptions): Through2Constructor = js.native
  @JSImport("through2-map", JSImport.Namespace)
  @js.native
  def apply(options: Through2MapOptions, fn: MapCallback): Through2Constructor = js.native
  
  @JSImport("through2-map", "ctor")
  @js.native
  def ctor(): Through2Constructor = js.native
  @JSImport("through2-map", "ctor")
  @js.native
  def ctor(fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", "ctor")
  @js.native
  def ctor(options: js.UndefOr[scala.Nothing], fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", "ctor")
  @js.native
  def ctor(options: Through2MapOptions): Through2Constructor = js.native
  @JSImport("through2-map", "ctor")
  @js.native
  def ctor(options: Through2MapOptions, fn: MapCallback): Through2Constructor = js.native
  
  @JSImport("through2-map", "obj")
  @js.native
  def obj(): Through2Constructor = js.native
  @JSImport("through2-map", "obj")
  @js.native
  def obj(fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", "obj")
  @js.native
  def obj(options: js.UndefOr[scala.Nothing], fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", "obj")
  @js.native
  def obj(options: Through2MapOptions): Through2Constructor = js.native
  @JSImport("through2-map", "obj")
  @js.native
  def obj(options: Through2MapOptions, fn: MapCallback): Through2Constructor = js.native
  
  @JSImport("through2-map", "objCtor")
  @js.native
  def objCtor(): Through2Constructor = js.native
  @JSImport("through2-map", "objCtor")
  @js.native
  def objCtor(fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", "objCtor")
  @js.native
  def objCtor(options: js.UndefOr[scala.Nothing], fn: MapCallback): Through2Constructor = js.native
  @JSImport("through2-map", "objCtor")
  @js.native
  def objCtor(options: Through2MapOptions): Through2Constructor = js.native
  @JSImport("through2-map", "objCtor")
  @js.native
  def objCtor(options: Through2MapOptions, fn: MapCallback): Through2Constructor = js.native
  
  type MapCallback = js.Function2[/* chunk */ js.Any, /* index */ Double, Unit]
  
  @js.native
  trait Through2MapOptions extends DuplexOptions {
    
    var wantStrings: js.UndefOr[Boolean] = js.native
  }
  object Through2MapOptions {
    
    @scala.inline
    def apply(): Through2MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Through2MapOptions]
    }
    
    @scala.inline
    implicit class Through2MapOptionsMutableBuilder[Self <: Through2MapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWantStrings(value: Boolean): Self = StObject.set(x, "wantStrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWantStringsUndefined: Self = StObject.set(x, "wantStrings", js.undefined)
    }
  }
}
