package typings.victoryCore.anon

import typings.victoryCore.libVictoryUtilHooksUseAnimationStateMod.AnimationState
import typings.victoryCore.libVictoryUtilHooksUseAnimationStateMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnimationProps extends StObject {
  
  def getAnimationProps(props: Unit, child: Any, index: Any): Any = js.native
  def getAnimationProps(props: AnyObject, child: Any, index: Any): Any = js.native
  
  def getProps(initialProps: AnyObject): AnyObject = js.native
  
  def setAnimationState(props: Unit, nextProps: Any): Unit = js.native
  def setAnimationState(props: AnyObject, nextProps: Any): Unit = js.native
  
  def setState(newState: AnimationState): Unit = js.native
  
  var state: AnimationState = js.native
}
