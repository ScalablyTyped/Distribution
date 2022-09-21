package typings.tsModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-model", "TSFunctionReference")
@js.native
open class TSFunctionReference protected () extends TSTypeReference[NoChildren] {
  def this(p: TSModelElement[Any]) = this()
  
  def paramStr(): String = js.native
  def paramStr(appendDefault: Boolean): String = js.native
  
  var parameters: js.Array[Param] = js.native
  
  var rangeType: TSTypeReference[Any] = js.native
}
