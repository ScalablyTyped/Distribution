package typings
package typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeScriptConfiguration extends js.Object {
  /**
  		Location of the bundled TypeScript declaration file.
  		*/
  var types: js.UndefOr[java.lang.String] = js.undefined
  /**
  		Location of the bundled TypeScript declaration file. Alias of `types`.
  		*/
  @JSName("typings")
  var typings_ : js.UndefOr[java.lang.String] = js.undefined
}

object TypeScriptConfiguration {
  @scala.inline
  def apply(types: java.lang.String = null, typings_ : java.lang.String = null): TypeScriptConfiguration = {
    val __obj = js.Dynamic.literal()
    if (types != null) __obj.updateDynamic("types")(types)
    if (typings_ != null) __obj.updateDynamic("typings")(typings_)
    __obj.asInstanceOf[TypeScriptConfiguration]
  }
}

