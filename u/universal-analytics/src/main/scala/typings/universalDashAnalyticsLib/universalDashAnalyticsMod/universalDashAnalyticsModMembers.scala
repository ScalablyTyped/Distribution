package typings
package universalDashAnalyticsLib.universalDashAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-analytics", JSImport.Namespace)
@js.native
object universalDashAnalyticsModMembers extends js.Object {
  def apply(
    accountID: universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.VisitorOptions | java.lang.String
  ): universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.Visitor = js.native
  def apply(
    accountID: java.lang.String,
    uuid: universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.VisitorOptions | java.lang.String
  ): universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.Visitor = js.native
  def apply(
    accountID: java.lang.String,
    uuid: java.lang.String,
    options: universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.VisitorOptions
  ): universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.Visitor = js.native
  def createFromSession(): universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.Visitor = js.native
  def createFromSession(session: universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.Session): universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.Visitor = js.native
  def middleware(tid: java.lang.String): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, scala.Unit], 
    scala.Unit
  ] = js.native
  def middleware(
    tid: java.lang.String,
    options: universalDashAnalyticsLib.universalDashAnalyticsMod.uaNs.MiddlewareOptions
  ): js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* err */ js.Any, scala.Unit], 
    scala.Unit
  ] = js.native
}

