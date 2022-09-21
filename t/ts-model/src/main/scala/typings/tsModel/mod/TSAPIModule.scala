package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSAPIModule")
@js.native
open class TSAPIModule () extends TSModelElement[TSInterface] {
  def this(parent: TSModelElement[Any]) = this()
  def this(parent: Unit, config: IConfig) = this()
  def this(parent: TSModelElement[Any], config: IConfig) = this()
  
  def getInterface(nm: String): TSInterface = js.native
  
  var serializer: Serializer = js.native
}
