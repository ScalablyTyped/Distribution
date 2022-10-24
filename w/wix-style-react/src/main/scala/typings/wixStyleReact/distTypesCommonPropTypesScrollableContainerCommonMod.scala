package typings.wixStyleReact

import typings.react.mod.Validator
import typings.std.HTMLElement
import typings.wixStyleReact.distTypesCommonScrollableContainerMod.ScrollAreaData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonPropTypesScrollableContainerCommonMod {
  
  object ScrollableContainerCommonProps {
    
    @JSImport("wix-style-react/dist/types/common/PropTypes/ScrollableContainerCommon", "ScrollableContainerCommonProps.onScrollAreaChanged")
    @js.native
    val onScrollAreaChanged: js.UndefOr[
        Validator[js.UndefOr[(js.Function1[/* scrollChangedData */ ScrollAreaData, Unit]) | Null]]
      ] = js.native
    
    @JSImport("wix-style-react/dist/types/common/PropTypes/ScrollableContainerCommon", "ScrollableContainerCommonProps.onScrollChanged")
    @js.native
    val onScrollChanged: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* target */ HTMLElement, Unit]) | Null]]] = js.native
  }
}
