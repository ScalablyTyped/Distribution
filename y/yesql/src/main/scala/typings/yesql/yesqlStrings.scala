package typings.yesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yesqlStrings {
  @js.native
  sealed trait mysql extends js.Object
  
  @js.native
  sealed trait pg extends js.Object
  
  @scala.inline
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  @scala.inline
  def pg: pg = "pg".asInstanceOf[pg]
}

