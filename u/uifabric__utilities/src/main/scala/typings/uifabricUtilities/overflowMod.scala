package typings.uifabricUtilities

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowMod {
  
  @JSImport("@uifabric/utilities/lib/overflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hasHorizontalOverflow(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasHorizontalOverflow")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasOverflow(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasOverflow")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def hasVerticalOverflow(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasVerticalOverflow")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
