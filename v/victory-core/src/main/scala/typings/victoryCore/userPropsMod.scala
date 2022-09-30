package typings.victoryCore

import typings.react.mod.ReactElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userPropsMod {
  
  @JSImport("victory-core/lib/victory-util/user-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSafeUserProps[T](props: T): Record[SafeAttribute, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafeUserProps")(props.asInstanceOf[js.Any]).asInstanceOf[Record[SafeAttribute, String]]
  
  inline def withSafeUserProps(component: ReactElement, props: Any): ReactElement = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeUserProps")(component.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[ReactElement]
  
  type SafeAttribute = String
}
