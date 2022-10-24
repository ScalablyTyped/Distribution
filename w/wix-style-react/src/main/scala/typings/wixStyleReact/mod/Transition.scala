package typings.wixStyleReact.mod

import typings.react.mod.ReactElement
import typings.wixStyleReact.anon.AnimateOnLoad
import typings.wixStyleReact.anon.AnimateOnLoadBoolean
import typings.wixStyleReact.distTypesTransitionTransitionDottypesMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Transition is a wrapper that allows animations of other components. */
object Transition {
  
  inline def apply(param0: TransitionProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("wix-style-react", "Transition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "Transition.defaultProps")
  @js.native
  def defaultProps: AnimateOnLoadBoolean = js.native
  inline def defaultProps_=(x: AnimateOnLoadBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Transition.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "Transition.propTypes")
  @js.native
  def propTypes: AnimateOnLoad = js.native
  inline def propTypes_=(x: AnimateOnLoad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
