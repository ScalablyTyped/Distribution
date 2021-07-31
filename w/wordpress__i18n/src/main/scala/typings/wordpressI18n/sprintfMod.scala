package typings.wordpressI18n

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sprintfMod {
  
  @JSImport("@wordpress/i18n/build-types/sprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sprintf(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
