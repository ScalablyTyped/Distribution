package typings.yesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yesqlStrings {
  
  @scala.inline
  def mysql: mysql = "mysql".asInstanceOf[mysql]
  
  @scala.inline
  def pg: pg = "pg".asInstanceOf[pg]
  
  @js.native
  sealed trait mysql extends js.Object
  
  @js.native
  sealed trait pg extends js.Object
}
