package typings.tabris.global.tabris

import typings.tabris.anon.OmitOmitPopovercontentVieCid
import typings.tabris.anon.OmitPopovercontentViewCheckDisposed
import typings.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Popover")
@js.native
class Popover ()
  extends typings.tabris.mod.Popover {
  def this(properties: Properties[OmitPopovercontentViewCheckDisposed, OmitOmitPopovercontentVieCid]) = this()
}
/* static members */
object Popover {
  
  @JSGlobal("tabris.Popover")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the given popover visible. Meant to be used with inline-JSX. In TypeScript it also casts the
    * given JSX element from `any` to an actual Popover.
    * @param popover The popover to open
    */
  inline def open(popover: typings.tabris.mod.Popover): typings.tabris.mod.Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(popover.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Popover]
}
