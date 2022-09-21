package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializer extends StObject {
  
  def serialize(model: TSModelElement[Any]): String = js.native
  def serialize(model: TSModelElement[Any], forImplementation: Boolean): String = js.native
}
