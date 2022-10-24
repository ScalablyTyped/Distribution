package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {getNumOfLabels (): number, getLabels (delimiter : string | undefined): std.Array<string>, getLabelAt (index : number, delimiter : string | undefined): string} & std.Pick<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.driver.InputWithOptionsDriver, 'driver'> */
@js.native
trait getNumOfLabelsnumbergetLa extends StObject {
  
  var driver: InputWrapper = js.native
  
  def getLabelAt(index: Double): String = js.native
  def getLabelAt(index: Double, delimiter: String): String = js.native
  
  def getLabels(): js.Array[String] = js.native
  def getLabels(delimiter: String): js.Array[String] = js.native
  
  def getNumOfLabels(): Double = js.native
}
