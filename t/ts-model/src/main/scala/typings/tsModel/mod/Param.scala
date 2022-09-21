package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "Param")
@js.native
open class Param protected () extends TSModelElement[TSTypeReference[Any]] {
  def this(p: TSAPIElementDeclaration, nm: String, location: ParamLocation) = this()
  def this(p: TSAPIElementDeclaration, nm: String, location: ParamLocation, tp: TSTypeReference[Any]) = this()
  def this(p: TSAPIElementDeclaration, nm: String, location: ParamLocation, tp: Unit, defaultValue: Any) = this()
  def this(
    p: TSAPIElementDeclaration,
    nm: String,
    location: ParamLocation,
    tp: TSTypeReference[Any],
    defaultValue: Any
  ) = this()
  
  var defaultValue: Any = js.native
  
  var location: ParamLocation = js.native
  
  var name: String = js.native
  
  var optional: Boolean = js.native
  
  var ptype: TSTypeReference[Any] = js.native
}
