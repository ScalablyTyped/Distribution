package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSSimpleTypeReference")
@js.native
open class TSSimpleTypeReference protected () extends TSTypeReference[NoChildren] {
  def this(p: TSModelElement[Any], tn: String) = this()
  
  def genericStr(): String = js.native
  
  var name: String = js.native
  
  var typeParameters: js.Array[TSTypeReference[Any]] = js.native
}
