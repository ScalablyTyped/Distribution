package typings.vueDocgenApi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveAliasesMod {
  
  @JSImport("vue-docgen-api/dist/utils/resolveAliases", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(filePath: String, aliases: StringDictionary[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(filePath.asInstanceOf[js.Any], aliases.asInstanceOf[js.Any])).asInstanceOf[String]
}
