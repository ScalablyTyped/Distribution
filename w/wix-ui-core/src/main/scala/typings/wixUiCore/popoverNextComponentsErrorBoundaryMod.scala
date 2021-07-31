package typings.wixUiCore

import typings.react.mod.Component
import typings.wixUiCore.anon.HasError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverNextComponentsErrorBoundaryMod {
  
  @JSImport("wix-ui-core/src/components/popover-next/components/ErrorBoundary", JSImport.Default)
  @js.native
  class default protected () extends ErrorBoundary {
    def this(props: js.Any) = this()
  }
  object default {
    
    @JSImport("wix-ui-core/src/components/popover-next/components/ErrorBoundary", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def getDerivedStateFromError(error: js.Any): HasError = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[HasError]
  }
  
  @js.native
  trait ErrorBoundary
    extends Component[js.Any, HasError, js.Any]
}
