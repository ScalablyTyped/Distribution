package typings.universalAnalytics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("universal-analytics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(accountID: String): Visitor = js.native
  def apply(accountID: String, uuid: String): Visitor = js.native
  def apply(accountID: String, uuid: String, options: VisitorOptions): Visitor = js.native
  def apply(accountID: String, uuid: VisitorOptions): Visitor = js.native
  def apply(accountID: VisitorOptions): Visitor = js.native
}

