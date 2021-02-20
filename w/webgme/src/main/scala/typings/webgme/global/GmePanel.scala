package typings.webgme.global

import typings.webgme.Gme.Client
import typings.webgme.GmePanel.Options
import typings.webgme.GmePanel.OptionsWithHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmePanel {
  
  @JSGlobal("GmePanel.IActivePanel")
  @js.native
  class IActivePanel ()
    extends typings.webgme.GmePanel.IActivePanel
  
  @JSGlobal("GmePanel.Layout")
  @js.native
  class Layout ()
    extends typings.webgme.GmePanel.Layout
  
  @JSGlobal("GmePanel.LayoutManager")
  @js.native
  class LayoutManager ()
    extends typings.webgme.GmePanel.LayoutManager
  
  @JSGlobal("GmePanel.Logger")
  @js.native
  class Logger ()
    extends typings.webgme.GmePanel.Logger
  
  @JSGlobal("GmePanel.PanelBase")
  @js.native
  class PanelBase protected ()
    extends typings.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
  }
  
  @JSGlobal("GmePanel.PanelBaseWithHeader")
  @js.native
  class PanelBaseWithHeader protected ()
    extends typings.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typings.webgme.GmePanel.LayoutManager) = this()
  }
  
  @JSGlobal("GmePanel.PanelManager")
  @js.native
  class PanelManager protected ()
    extends typings.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
  }
}
