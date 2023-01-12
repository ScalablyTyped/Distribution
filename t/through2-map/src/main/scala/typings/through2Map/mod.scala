package typings.through2Map

import typings.node.streamMod.DuplexOptions
import typings.through2.mod.Through2Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Through2Constructor = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Through2Constructor]
  inline def apply(fn: MapCallback): Through2Constructor = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def apply(options: Unit, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def apply(options: Through2MapOptions): Through2Constructor = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def apply(options: Through2MapOptions, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  
  @JSImport("through2-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ctor(): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")().asInstanceOf[Through2Constructor]
  inline def ctor(fn: MapCallback): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(fn.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def ctor(options: Unit, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def ctor(options: Through2MapOptions): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(options.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def ctor(options: Through2MapOptions, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  
  inline def obj(): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")().asInstanceOf[Through2Constructor]
  inline def obj(fn: MapCallback): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(fn.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def obj(options: Unit, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def obj(options: Through2MapOptions): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("obj")(options.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def obj(options: Through2MapOptions, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("obj")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  
  inline def objCtor(): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("objCtor")().asInstanceOf[Through2Constructor]
  inline def objCtor(fn: MapCallback): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("objCtor")(fn.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def objCtor(options: Unit, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("objCtor")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  inline def objCtor(options: Through2MapOptions): Through2Constructor = ^.asInstanceOf[js.Dynamic].applyDynamic("objCtor")(options.asInstanceOf[js.Any]).asInstanceOf[Through2Constructor]
  inline def objCtor(options: Through2MapOptions, fn: MapCallback): Through2Constructor = (^.asInstanceOf[js.Dynamic].applyDynamic("objCtor")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Through2Constructor]
  
  type MapCallback = js.Function2[/* chunk */ Any, /* index */ Double, Unit]
  
  trait Through2MapOptions
    extends StObject
       with DuplexOptions {
    
    var wantStrings: js.UndefOr[Boolean] = js.undefined
  }
  object Through2MapOptions {
    
    inline def apply(): Through2MapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Through2MapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Through2MapOptions] (val x: Self) extends AnyVal {
      
      inline def setWantStrings(value: Boolean): Self = StObject.set(x, "wantStrings", value.asInstanceOf[js.Any])
      
      inline def setWantStringsUndefined: Self = StObject.set(x, "wantStrings", js.undefined)
    }
  }
}
