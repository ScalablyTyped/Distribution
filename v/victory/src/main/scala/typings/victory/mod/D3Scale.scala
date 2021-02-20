package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * D3 scale function shape. Don't want to introduce typing dependency to d3
  */
@js.native
trait D3Scale extends StObject {
  
  def apply(input: String): Double = js.native
  def apply(input: Double): Double = js.native
  
  def copy(): js.Any = js.native
  
  def domain(): js.Any = js.native
  
  def range(): js.Any = js.native
}
