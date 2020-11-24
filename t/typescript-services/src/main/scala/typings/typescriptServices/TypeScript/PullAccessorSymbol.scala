package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PullAccessorSymbol extends PullSymbol {
  
  var _getterSymbol: js.Any = js.native
  
  var _setterSymbol: js.Any = js.native
  
  def getGetter(): PullSymbol = js.native
  
  def getSetter(): PullSymbol = js.native
  
  def setGetter(getter: PullSymbol): Unit = js.native
  
  def setSetter(setter: PullSymbol): Unit = js.native
}
