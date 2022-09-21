package typings.styledComponents

import typings.styledComponents.anon.TypeofStyleSheetInstantiable
import typings.styledComponents.sheetMod.default
import typings.styledComponents.sheetSheetMod.GlobalStylesAllocationMap
import typings.styledComponents.sheetSheetMod.NamesAllocationMap
import typings.styledComponents.sheetSheetMod.SheetConstructorArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secretInternalsMod {
  
  object __PRIVATE__ {
    
    @JSImport("styled-components/native/dist/dist/secretInternals", "__PRIVATE__")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("styled-components/native/dist/dist/secretInternals", "__PRIVATE__.StyleSheet")
    @js.native
    open class StyleSheet () extends default {
      def this(options: SheetConstructorArgs) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: Unit, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
    }
    @JSImport("styled-components/native/dist/dist/secretInternals", "__PRIVATE__.StyleSheet")
    @js.native
    def StyleSheet: TypeofStyleSheetInstantiable = js.native
    inline def StyleSheet_=(x: TypeofStyleSheetInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
    
    @JSImport("styled-components/native/dist/dist/secretInternals", "__PRIVATE__.mainSheet")
    @js.native
    def mainSheet: default = js.native
    inline def mainSheet_=(x: default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainSheet")(x.asInstanceOf[js.Any])
  }
}
