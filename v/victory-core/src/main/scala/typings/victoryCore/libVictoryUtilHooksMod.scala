package typings.victoryCore

import typings.victoryCore.anon.GetAnimationProps
import typings.victoryCore.libVictoryUtilHooksUseAnimationStateMod.AnimationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilHooksMod {
  
  @JSImport("victory-core/lib/victory-util/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnimationState(): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")().asInstanceOf[GetAnimationProps]
  inline def useAnimationState(initialState: AnimationState): GetAnimationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnimationState")(initialState.asInstanceOf[js.Any]).asInstanceOf[GetAnimationProps]
  
  inline def usePreviousProps[T](props: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
