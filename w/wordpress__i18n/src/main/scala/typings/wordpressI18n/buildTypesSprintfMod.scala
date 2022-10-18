package typings.wordpressI18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSprintfMod {
  
  @JSImport("@wordpress/i18n/build-types/sprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sprintf(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(scala.List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
}
