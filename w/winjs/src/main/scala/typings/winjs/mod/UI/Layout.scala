package typings.winjs.mod.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
  **/
@JSImport("winjs", "UI.Layout")
@js.native
open class Layout ()
  extends StObject
     with typings.winjs.WinJS.UI.Layout
object Layout {
  
  @JSImport("winjs", "UI.Layout")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  /* static member */
  @JSImport("winjs", "UI.Layout.supportedForProcessing")
  @js.native
  def supportedForProcessing: Boolean = js.native
  inline def supportedForProcessing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportedForProcessing")(x.asInstanceOf[js.Any])
}
