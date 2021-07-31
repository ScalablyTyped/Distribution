package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPointerPointStatics extends StObject {
  
  def getCurrentPoint(pointerId: Double): PointerPoint = js.native
  def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): PointerPoint = js.native
  
  def getIntermediatePoints(pointerId: Double): IVector[PointerPoint] = js.native
  def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[PointerPoint] = js.native
}
