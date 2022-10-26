package typings.wixStyleReact

import org.scalablytyped.runtime.StringDictionary
import typings.wixStyleReact.anon.AccentColor
import typings.wixStyleReact.anon.Exit
import typings.wixStyleReact.anon.`16`
import typings.wixStyleReact.distTypesTransitionConstantsMod.TransitionStyles
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.EnterAnimation
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.ExitAnimation
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.MoveIn
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.MoveOut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionUtilsUtilsMod {
  
  @JSImport("wix-style-react/dist/types/Transition/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMoveStyles(moveProps: MoveIn, isExiting: Boolean): StringDictionary[AccentColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoveStyles")(moveProps.asInstanceOf[js.Any], isExiting.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[AccentColor]]
  inline def getMoveStyles(moveProps: MoveOut, isExiting: Boolean): StringDictionary[AccentColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoveStyles")(moveProps.asInstanceOf[js.Any], isExiting.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[AccentColor]]
  
  inline def getPercentageValue(percentage: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentageValue")(percentage.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTimeout(): Exit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")().asInstanceOf[Exit]
  inline def getTimeout(enterAnimation: Unit, exitAnimation: ExitAnimation): Exit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[Exit]
  inline def getTimeout(enterAnimation: EnterAnimation): Exit = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(enterAnimation.asInstanceOf[js.Any]).asInstanceOf[Exit]
  inline def getTimeout(enterAnimation: EnterAnimation, exitAnimation: ExitAnimation): Exit = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimeout")(enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[Exit]
  
  inline def getTransitionStyles(param0: `16`): TransitionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(param0.asInstanceOf[js.Any]).asInstanceOf[TransitionStyles]
  inline def getTransitionStyles(param0: `16`, enterAnimation: Unit, exitAnimation: ExitAnimation): TransitionStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(param0.asInstanceOf[js.Any], enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[TransitionStyles]
  inline def getTransitionStyles(param0: `16`, enterAnimation: EnterAnimation): TransitionStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(param0.asInstanceOf[js.Any], enterAnimation.asInstanceOf[js.Any])).asInstanceOf[TransitionStyles]
  inline def getTransitionStyles(param0: `16`, enterAnimation: EnterAnimation, exitAnimation: ExitAnimation): TransitionStyles = (^.asInstanceOf[js.Dynamic].applyDynamic("getTransitionStyles")(param0.asInstanceOf[js.Any], enterAnimation.asInstanceOf[js.Any], exitAnimation.asInstanceOf[js.Any])).asInstanceOf[TransitionStyles]
}
