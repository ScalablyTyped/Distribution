package typings.sugar.sugarjs.RegExp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[typings.sugar.RegExp]]
     with Instantiable1[/* raw */ typings.sugar.RegExp, Chainable[typings.sugar.RegExp]] {
  
  def apply(): Chainable[typings.sugar.RegExp] = js.native
  def apply(raw: typings.sugar.RegExp): Chainable[typings.sugar.RegExp] = js.native
  
  def addFlags(instance: typings.sugar.RegExp, flags: String): typings.sugar.RegExp = js.native
  
  def escape(): String = js.native
  def escape(str: String): String = js.native
  
  def getFlags(instance: typings.sugar.RegExp): String = js.native
  
  def removeFlags(instance: typings.sugar.RegExp, flags: String): typings.sugar.RegExp = js.native
  
  def setFlags(instance: typings.sugar.RegExp, flags: String): typings.sugar.RegExp = js.native
}
