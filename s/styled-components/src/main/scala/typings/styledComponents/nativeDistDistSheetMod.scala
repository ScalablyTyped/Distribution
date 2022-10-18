package typings.styledComponents

import typings.styledComponents.nativeDistDistSheetSheetMod.GlobalStylesAllocationMap
import typings.styledComponents.nativeDistDistSheetSheetMod.NamesAllocationMap
import typings.styledComponents.nativeDistDistSheetSheetMod.SheetConstructorArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistSheetMod {
  
  @JSImport("styled-components/native/dist/dist/sheet", JSImport.Default)
  @js.native
  open class default ()
    extends typings.styledComponents.nativeDistDistSheetSheetMod.default {
    def this(options: SheetConstructorArgs) = this()
    def this(options: Unit, globalStyles: GlobalStylesAllocationMap) = this()
    def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap) = this()
    def this(options: Unit, globalStyles: Unit, names: NamesAllocationMap) = this()
    def this(options: Unit, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
    def this(options: SheetConstructorArgs, globalStyles: Unit, names: NamesAllocationMap) = this()
    def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
  }
  /* static members */
  object default {
    
    @JSImport("styled-components/native/dist/dist/sheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /** Register a group ID to give it an index */
    inline def registerId(id: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("registerId")(id.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
