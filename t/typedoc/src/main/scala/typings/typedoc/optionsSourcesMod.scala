package typings.typedoc

import typings.typedoc.optionsOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsSourcesMod {
  
  @JSImport("typedoc/dist/lib/utils/options/sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTSOptions(container: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTSOptions")(container.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addTypeDocOptions(options: typings.typedoc.optionsMod.Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTypeDocOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
