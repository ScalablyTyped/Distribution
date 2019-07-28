package typings.universalDashAnalytics.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-analytics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(accountID: VisitorOptions | String): Visitor = js.native
  def apply(accountID: String, uuid: VisitorOptions | String): Visitor = js.native
  def apply(accountID: String, uuid: String, options: VisitorOptions): Visitor = js.native
  def createFromSession(): Visitor = js.native
  def createFromSession(session: Session): Visitor = js.native
  def middleware(tid: String): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, Unit], 
    Unit
  ] = js.native
  def middleware(tid: String, options: MiddlewareOptions): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, Unit], 
    Unit
  ] = js.native
}

