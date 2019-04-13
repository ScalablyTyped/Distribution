package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-analytics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(accountID: VisitorOptions | java.lang.String): Visitor = js.native
  def apply(accountID: java.lang.String, uuid: VisitorOptions | java.lang.String): Visitor = js.native
  def apply(accountID: java.lang.String, uuid: java.lang.String, options: VisitorOptions): Visitor = js.native
  def createFromSession(): Visitor = js.native
  def createFromSession(session: Session): Visitor = js.native
  def middleware(tid: java.lang.String): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, scala.Unit], 
    scala.Unit
  ] = js.native
  def middleware(tid: java.lang.String, options: MiddlewareOptions): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, scala.Unit], 
    scala.Unit
  ] = js.native
}

