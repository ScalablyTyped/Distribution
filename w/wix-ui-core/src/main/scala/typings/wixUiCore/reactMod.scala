package typings.wixUiCore

import typings.react.mod.ReactElement
import typings.wixUiCore.anon.AsFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("wix-ui-core/dist/standalone/test/utils/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRendererWithDriver(driverFactory: js.Any): js.Function2[/* jsx */ ReactElement, /* dataHook */ js.UndefOr[String], AsFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRendererWithDriver")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* jsx */ ReactElement, /* dataHook */ js.UndefOr[String], AsFragment]]
  
  inline def createRendererWithUniDriver(driverFactory: js.Any): js.Function2[/* jsx */ ReactElement, /* dataHook */ js.UndefOr[String], AsFragment] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRendererWithUniDriver")(driverFactory.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* jsx */ ReactElement, /* dataHook */ js.UndefOr[String], AsFragment]]
}
