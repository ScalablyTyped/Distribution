package typings.uifabricUtilities

import typings.uifabricUtilities.customizerContextMod.ICustomizerContext
import typings.uifabricUtilities.customizerTypesMod.ICustomizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeCustomizationsMod {
  
  @JSImport("@uifabric/utilities/lib/customizations/mergeCustomizations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeCustomizations(props: ICustomizerProps, parentContext: ICustomizerContext): ICustomizerContext = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeCustomizations")(props.asInstanceOf[js.Any], parentContext.asInstanceOf[js.Any])).asInstanceOf[ICustomizerContext]
}
