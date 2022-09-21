package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Serializer extends StObject {
  
  var context: Any = js.native
  
  def deserialize(): Any = js.native
  def deserialize(value: Any): Any = js.native
  def deserialize(value: Any, context: Any): Any = js.native
  def deserialize(value: Unit, context: Any): Any = js.native
  
  var deserializeMiddlewares: Any = js.native
  
  def serialize(): Any = js.native
  def serialize(obj: Any): Any = js.native
  def serialize(obj: Any, context: Any): Any = js.native
  def serialize(obj: Unit, context: Any): Any = js.native
  
  var serializeMiddlewares: Any = js.native
}
