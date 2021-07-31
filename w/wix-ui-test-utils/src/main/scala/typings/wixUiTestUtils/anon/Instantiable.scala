package typings.wixUiTestUtils.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.wixUiTestUtils.helpersMod.ControlledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable1[
      (/* props */ ControlledComponentProps) | (/* props */ ReadonlyControlledCompone), 
      Context
    ]
     with Instantiable2[/* props */ ControlledComponentProps, /* context */ js.Any, Context] {
  
  var contextType: js.UndefOr[typings.react.mod.Context[js.Any]] = js.native
  
  var defaultProps: Value = js.native
}
