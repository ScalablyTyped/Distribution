package typings.uifabricUtilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectionMod {
  
  @JSImport("@uifabric/utilities/lib/selection", "SELECTION_CHANGE")
  @js.native
  val SELECTION_CHANGE: /* "change" */ String = js.native
  
  @JSImport("@uifabric/utilities/lib/selection", "SELECTION_ITEMS_CHANGE")
  @js.native
  val SELECTION_ITEMS_CHANGE: /* "items-change" */ String = js.native
  
  @JSImport("@uifabric/utilities/lib/selection", "Selection")
  @js.native
  open class Selection[TItem] protected ()
    extends typings.uifabricUtilities.libSelectionSelectionMod.Selection[TItem] {
    /**
      * Create a new Selection. If `TItem` does not have a `key` property, you must provide an options
      * object with a `getKey` implementation. Providing options is optional otherwise.
      * (At most one `options` object is accepted.)
      */
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param options because its type TItem extends IObjectWithKey ? [] | [ISelectionOptions<TItem>] : [ISelectionOptionsWithRequiredGetKey<TItem>] is not an array type */ options: /* import warning: importer.ImportType#apply Failed type conversion: TItem extends @uifabric/utilities.@uifabric/utilities/lib/selection/Selection.types.IObjectWithKey ? [] | [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptions<TItem>] : [@uifabric/utilities.@uifabric/utilities/lib/selection/Selection.ISelectionOptionsWithRequiredGetKey<TItem>] */ js.Any) = this()
  }
  
  @JSImport("@uifabric/utilities/lib/selection", "SelectionDirection")
  @js.native
  object SelectionDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection & Double
      ] = js.native
    
    /* 0 */ val horizontal: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.horizontal & Double = js.native
    
    /* 1 */ val vertical: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionDirection.vertical & Double = js.native
  }
  
  @JSImport("@uifabric/utilities/lib/selection", "SelectionMode")
  @js.native
  object SelectionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode & Double
      ] = js.native
    
    /* 2 */ val multiple: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.multiple & Double = js.native
    
    /* 0 */ val none: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.none & Double = js.native
    
    /* 1 */ val single: typings.uifabricUtilities.libSelectionSelectionDottypesMod.SelectionMode.single & Double = js.native
  }
}
