package typings.webgme.global

import typings.webgme.Gme.Client
import typings.webgme.GmePanel.Options
import typings.webgme.GmePanel.OptionsWithHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GmePanel")
@js.native
object GmePanel extends js.Object {
  
  @js.native
  class IActivePanel ()
    extends typings.webgme.GmePanel.IActivePanel
  
  @js.native
  class Layout ()
    extends typings.webgme.GmePanel.Layout
  
  @js.native
  class LayoutManager ()
    extends typings.webgme.GmePanel.LayoutManager
  
  @js.native
  class Logger ()
    extends typings.webgme.GmePanel.Logger
  
  @js.native
  class PanelBase protected ()
    extends typings.webgme.GmePanel.PanelBase {
    def this(options: Options) = this()
  }
  
  @js.native
  class PanelBaseWithHeader protected ()
    extends typings.webgme.GmePanel.PanelBaseWithHeader {
    def this(options: OptionsWithHeader, layoutManger: typings.webgme.GmePanel.LayoutManager) = this()
  }
  
  @js.native
  class PanelManager protected ()
    extends typings.webgme.GmePanel.PanelManager {
    def this(client: Client) = this()
  }
}
