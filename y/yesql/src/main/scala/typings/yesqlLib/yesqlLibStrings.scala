package typings
package yesqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yesqlLibStrings {
  @js.native
  sealed trait mysql extends js.Object
  
  @js.native
  sealed trait pg extends js.Object
  
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  def pg: pg = "pg".asInstanceOf[pg]
}

