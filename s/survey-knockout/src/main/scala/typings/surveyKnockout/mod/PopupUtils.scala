package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "PopupUtils")
@js.native
open class PopupUtils () extends StObject
/* static members */
object PopupUtils {
  
  @JSImport("survey-knockout", "PopupUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "PopupUtils.bottomIndent")
  @js.native
  def bottomIndent: Double = js.native
  inline def bottomIndent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomIndent")(x.asInstanceOf[js.Any])
  
  inline def calculatePointerTarget(targetRect: Any, top: Double, left: Double, verticalPosition: Any, horizontalPosition: Any): INumberPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointerTarget")(targetRect.asInstanceOf[js.Any], top.asInstanceOf[js.Any], left.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any])).asInstanceOf[INumberPosition]
  inline def calculatePointerTarget(
    targetRect: Any,
    top: Double,
    left: Double,
    verticalPosition: Any,
    horizontalPosition: Any,
    marginLeft: Double
  ): INumberPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointerTarget")(targetRect.asInstanceOf[js.Any], top.asInstanceOf[js.Any], left.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], marginLeft.asInstanceOf[js.Any])).asInstanceOf[INumberPosition]
  inline def calculatePointerTarget(
    targetRect: Any,
    top: Double,
    left: Double,
    verticalPosition: Any,
    horizontalPosition: Any,
    marginLeft: Double,
    marginRight: Double
  ): INumberPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointerTarget")(targetRect.asInstanceOf[js.Any], top.asInstanceOf[js.Any], left.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], marginLeft.asInstanceOf[js.Any], marginRight.asInstanceOf[js.Any])).asInstanceOf[INumberPosition]
  inline def calculatePointerTarget(
    targetRect: Any,
    top: Double,
    left: Double,
    verticalPosition: Any,
    horizontalPosition: Any,
    marginLeft: Unit,
    marginRight: Double
  ): INumberPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePointerTarget")(targetRect.asInstanceOf[js.Any], top.asInstanceOf[js.Any], left.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], marginLeft.asInstanceOf[js.Any], marginRight.asInstanceOf[js.Any])).asInstanceOf[INumberPosition]
  
  inline def calculatePopupDirection(verticalPosition: Any, horizontalPosition: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePopupDirection")(verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def calculatePosition(
    targetRect: Any,
    height: Double,
    width: Double,
    verticalPosition: Any,
    horizontalPosition: Any,
    showPointer: Boolean
  ): INumberPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePosition")(targetRect.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], showPointer.asInstanceOf[js.Any])).asInstanceOf[INumberPosition]
  inline def calculatePosition(
    targetRect: Any,
    height: Double,
    width: Double,
    verticalPosition: Any,
    horizontalPosition: Any,
    showPointer: Boolean,
    positionMode: Any
  ): INumberPosition = (^.asInstanceOf[js.Dynamic].applyDynamic("calculatePosition")(targetRect.asInstanceOf[js.Any], height.asInstanceOf[js.Any], width.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], showPointer.asInstanceOf[js.Any], positionMode.asInstanceOf[js.Any])).asInstanceOf[INumberPosition]
  
  inline def updateHorizontalDimensions(left: Double, width: Double, windowWidth: Double, horizontalPosition: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHorizontalDimensions")(left.asInstanceOf[js.Any], width.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def updateHorizontalDimensions(left: Double, width: Double, windowWidth: Double, horizontalPosition: Any, positionMode: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHorizontalDimensions")(left.asInstanceOf[js.Any], width.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], positionMode.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def updateHorizontalDimensions(
    left: Double,
    width: Double,
    windowWidth: Double,
    horizontalPosition: Any,
    positionMode: Any,
    margins: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHorizontalDimensions")(left.asInstanceOf[js.Any], width.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], positionMode.asInstanceOf[js.Any], margins.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def updateHorizontalDimensions(
    left: Double,
    width: Double,
    windowWidth: Double,
    horizontalPosition: Any,
    positionMode: Unit,
    margins: Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateHorizontalDimensions")(left.asInstanceOf[js.Any], width.asInstanceOf[js.Any], windowWidth.asInstanceOf[js.Any], horizontalPosition.asInstanceOf[js.Any], positionMode.asInstanceOf[js.Any], margins.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def updateVerticalDimensions(top: Double, height: Double, windowHeight: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateVerticalDimensions")(top.asInstanceOf[js.Any], height.asInstanceOf[js.Any], windowHeight.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def updateVerticalPosition(targetRect: Any, height: Double, verticalPosition: Any, showPointer: Boolean, windowHeight: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateVerticalPosition")(targetRect.asInstanceOf[js.Any], height.asInstanceOf[js.Any], verticalPosition.asInstanceOf[js.Any], showPointer.asInstanceOf[js.Any], windowHeight.asInstanceOf[js.Any])).asInstanceOf[Any]
}
