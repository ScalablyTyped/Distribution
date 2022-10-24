package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DisabledDescription
import typings.wixStyleReact.anon.DividerValidator
import typings.wixStyleReact.anon.MaxHeight
import typings.wixStyleReact.anon.SuffixIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableActionCellTableActionCellMod {
  
  object default {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.defaultProps.alwaysShowSecondaryActions_1")
      @js.native
      val alwaysShowSecondaryActions1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.defaultProps.numOfVisibleSecondaryActions_1")
      @js.native
      val numOfVisibleSecondaryActions1: Double = js.native
      
      inline def onClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.defaultProps.primaryAction_1")
      @js.native
      val primaryAction1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.defaultProps.secondaryActions_1")
      @js.native
      val secondaryActions1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.alwaysShowSecondaryActions")
      @js.native
      val alwaysShowSecondaryActions: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.moreActionsTooltipText")
      @js.native
      val moreActionsTooltipText: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.numOfVisibleSecondaryActions")
      @js.native
      val numOfVisibleSecondaryActions: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.popoverMenuProps")
      @js.native
      val popoverMenuProps: Requireable[InferProps[MaxHeight]] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.primaryAction")
      @js.native
      val primaryAction: Requireable[InferProps[SuffixIcon]] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.secondaryActions")
      @js.native
      val secondaryActions: Requireable[
            js.Array[js.UndefOr[(InferProps[DisabledDescription | DividerValidator]) | Null]]
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/TableActionCell/TableActionCell", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
    }
  }
}
