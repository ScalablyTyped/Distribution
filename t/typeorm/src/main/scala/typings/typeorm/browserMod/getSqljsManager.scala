package typings.typeorm.browserMod

import typings.typeorm.sqljsEntityManagerMod.SqljsEntityManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "getSqljsManager")
@js.native
object getSqljsManager extends js.Object {
  
  def apply(): SqljsEntityManager = js.native
  def apply(connectionName: String): SqljsEntityManager = js.native
}
