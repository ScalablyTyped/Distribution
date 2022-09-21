package typings.tetherDrop

import org.scalablytyped.runtime.Instantiable1
import typings.tetherDrop.mod.IDropContextOptions
import typings.tetherDrop.mod.IDropOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Drop {
    
    // global Drop constructor
    @JSGlobal("Drop")
    @js.native
    open class ^ protected ()
      extends typings.tetherDrop.mod.^ {
      def this(options: IDropOptions) = this()
    }
    
    @JSGlobal("Drop")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def createContext(options: IDropContextOptions): Instantiable1[/* options */ IDropOptions, typings.tetherDrop.mod.Drop] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(options.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* options */ IDropOptions, typings.tetherDrop.mod.Drop]]
  }
}
