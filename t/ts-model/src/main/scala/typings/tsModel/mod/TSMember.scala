package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSMember")
@js.native
open class TSMember[T /* <: TSModelElement[Any] */] () extends TSModelElement[T] {
  def this(parent: TSModelElement[Any]) = this()
  def this(parent: Unit, config: IConfig) = this()
  def this(parent: TSModelElement[Any], config: IConfig) = this()
  
  var optional: Boolean = js.native
}
