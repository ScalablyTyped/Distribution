package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.wixStyleReact.distTypesDividerMod.DividerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardDividerMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Card/Divider", JSImport.Default)
  @js.native
  val default: FunctionComponent[DividerProps] = js.native
  
  type _To = FunctionComponent[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesCardDividerMod.foo` */
  override def _to: FunctionComponent[DividerProps] = default
}
