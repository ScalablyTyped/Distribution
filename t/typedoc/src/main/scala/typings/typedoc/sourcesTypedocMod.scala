package typings.typedoc

import typings.typedoc.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesTypedocMod {
  
  @JSImport("typedoc/dist/lib/utils/options/sources/typedoc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addTypeDocOptions(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTypeDocOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
