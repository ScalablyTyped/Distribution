package typings.wixStyleReact

import typings.react.mod.Context
import typings.wixStyleReact.anon.AriaDescribedByAny
import typings.wixStyleReact.anon.AriaDescribedBy_
import typings.wixStyleReact.anon.Ariadescribedby
import typings.wixStyleReact.anon.AriadescribedbyUndefined
import typings.wixStyleReact.anon.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFormFieldStatusContextMod {
  
  @JSImport("wix-style-react/dist/types/FormField/StatusContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/FormField/StatusContext", "StatusContext")
  @js.native
  val StatusContext: Context[AriaDescribedBy_] = js.native
  
  inline def getAriaAttributesFromContext(param0: AriaDescribedByAny): Ariadescribedby | AriadescribedbyUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getAriaAttributesFromContext")(param0.asInstanceOf[js.Any]).asInstanceOf[Ariadescribedby | AriadescribedbyUndefined]
  
  inline def getStatusFromContext(param0: Status, propsStatus: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStatusFromContext")(param0.asInstanceOf[js.Any], propsStatus.asInstanceOf[js.Any])).asInstanceOf[Any]
}
