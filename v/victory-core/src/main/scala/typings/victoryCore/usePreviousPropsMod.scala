package typings.victoryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usePreviousPropsMod {
  
  @JSImport("victory-core/lib/victory-util/hooks/use-previous-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePreviousProps[T](props: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreviousProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
}
