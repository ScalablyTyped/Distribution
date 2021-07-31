package typings.winrtUwp.global.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the step in the progress for an HTTP connection. */
@JSGlobal("Windows.Web.Http.HttpProgressStage")
@js.native
object HttpProgressStage extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Web.Http.HttpProgressStage & Double] = js.native
  
  /* 3 */ val connectingToServer: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.connectingToServer & Double = js.native
  
  /* 1 */ val detectingProxy: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.detectingProxy & Double = js.native
  
  /* 4 */ val negotiatingSsl: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.negotiatingSsl & Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.none & Double = js.native
  
  /* 9 */ val receivingContent: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.receivingContent & Double = js.native
  
  /* 8 */ val receivingHeaders: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.receivingHeaders & Double = js.native
  
  /* 2 */ val resolvingName: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.resolvingName & Double = js.native
  
  /* 6 */ val sendingContent: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.sendingContent & Double = js.native
  
  /* 5 */ val sendingHeaders: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.sendingHeaders & Double = js.native
  
  /* 7 */ val waitingForResponse: typings.winrtUwp.Windows.Web.Http.HttpProgressStage.waitingForResponse & Double = js.native
}
