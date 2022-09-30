package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Context
import typings.wixUiTestUtils.helpersMod.ControlledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable[T /* <: ControlledComponentProps */]
  extends StObject
     with Instantiable1[/* props */ T, ComponentDidCatch[T]]
     with Instantiable2[/* props */ T, /* context */ Any, ComponentDidCatch[T]] {
  
  var contextType: js.UndefOr[Context[Any]] = js.native
  
  var defaultProps: Value = js.native
}
