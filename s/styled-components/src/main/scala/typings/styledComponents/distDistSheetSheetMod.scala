package typings.styledComponents

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.Map
import typings.std.Set
import typings.styledComponents.distSheetTypesMod.GroupedTag
import typings.styledComponents.distSheetTypesMod.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistSheetSheetMod {
  
  @JSImport("styled-components/primitives/dist/dist/sheet/Sheet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with StyleSheet {
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
    
    @JSImport("styled-components/primitives/dist/dist/sheet/Sheet", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /** Register a group ID to give it an index */
    inline def registerId(id: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("registerId")(id.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  type GlobalStylesAllocationMap = StringDictionary[Double]
  
  type NamesAllocationMap = Map[String, Set[String]]
  
  trait SheetConstructorArgs extends StObject {
    
    var isServer: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    var useCSSOMInjection: js.UndefOr[Boolean] = js.undefined
  }
  object SheetConstructorArgs {
    
    inline def apply(): SheetConstructorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetConstructorArgs]
    }
    
    extension [Self <: SheetConstructorArgs](x: Self) {
      
      inline def setIsServer(value: Boolean): Self = StObject.set(x, "isServer", value.asInstanceOf[js.Any])
      
      inline def setIsServerUndefined: Self = StObject.set(x, "isServer", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setUseCSSOMInjection(value: Boolean): Self = StObject.set(x, "useCSSOMInjection", value.asInstanceOf[js.Any])
      
      inline def setUseCSSOMInjectionUndefined: Self = StObject.set(x, "useCSSOMInjection", js.undefined)
    }
  }
  
  @js.native
  trait StyleSheet
    extends StObject
       with Sheet {
    
    var gs: GlobalStylesAllocationMap = js.native
    
    @JSName("names")
    var names_StyleSheet: NamesAllocationMap = js.native
    
    def reconstructWithOptions(options: SheetConstructorArgs): StyleSheet = js.native
    def reconstructWithOptions(options: SheetConstructorArgs, withNames: Boolean): StyleSheet = js.native
    
    var server: Boolean = js.native
    
    var tag: js.UndefOr[GroupedTag] = js.native
  }
}
