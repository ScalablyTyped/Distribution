package typings.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveSection
  extends StObject
     with Modifier {
  
  def draw(stave: Stave, shift_x: Double): StaveSection = js.native
  
  def setShiftX(x: Double): StaveSection = js.native
  
  def setShiftY(y: Double): StaveSection = js.native
  
  def setStaveSection(section: String): StaveSection = js.native
}
