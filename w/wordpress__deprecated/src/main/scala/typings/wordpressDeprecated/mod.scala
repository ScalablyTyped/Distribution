package typings.wordpressDeprecated

import typings.std.Record
import typings.utilityTypes.distMappedTypesMod.NonUndefined
import typings.wordpressDeprecated.anon.Alternative
import typings.wordpressDeprecated.wordpressDeprecatedBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/deprecated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(feature: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(feature.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(feature: String, options: Alternative): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(feature.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@wordpress/deprecated", "logged")
  @js.native
  val logged: Record[String, js.UndefOr[`true`]] = js.native
  
  type DeprecatedOptions = NonUndefined[
    /* import warning: importer.ImportType#apply Failed type conversion: [feature: string, options: @wordpress/deprecated.anon.Alternative | undefined | undefined][1] */ js.Any
  ]
}
