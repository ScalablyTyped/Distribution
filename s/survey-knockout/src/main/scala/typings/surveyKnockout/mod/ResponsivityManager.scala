package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ResponsivityManager")
@js.native
open class ResponsivityManager protected () extends StObject {
  def this(container: Any, model: Any, itemsSelector: String) = this()
  def this(container: Any, model: Any, itemsSelector: String, dotsItemSize: Double) = this()
  
  /* protected */ def calcItemSize(item: Any): Double = js.native
  
  def dispose(): Unit = js.native
  
  /* protected */ def getAvailableSpace(): Double = js.native
  
  def getComputedStyle(elt: Any): Any = js.native
  
  /* protected */ def getDimensions(element: Any): IDimensions = js.native
  
  var isInitialized: Boolean = js.native
  
  /* protected */ var minDimensionConst: Double = js.native
  
  var paddingSizeConst: Double = js.native
  
  /* protected */ var recalcMinDimensionConst: Boolean = js.native
  
  var resizeObserver: Any = js.native
  
  var separatorAddConst: Double = js.native
  
  var separatorSize: Double = js.native
}
