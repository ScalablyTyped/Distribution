package typings
package atUirouterCoreLib.libResolveInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderLike
  extends atUirouterCoreLib.libStateInterfaceMod.ResolveTypes {
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  var provide: js.Any
  var useClass: js.UndefOr[js.Any] = js.undefined
  var useExisting: js.UndefOr[js.Any] = js.undefined
  var useFactory: js.UndefOr[js.Function] = js.undefined
  var useValue: js.UndefOr[js.Any] = js.undefined
}

object ProviderLike {
  @scala.inline
  def apply(
    provide: js.Any,
    deps: js.Array[_] = null,
    useClass: js.Any = null,
    useExisting: js.Any = null,
    useFactory: js.Function = null,
    useValue: js.Any = null
  ): ProviderLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provide")(provide)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (useClass != null) __obj.updateDynamic("useClass")(useClass)
    if (useExisting != null) __obj.updateDynamic("useExisting")(useExisting)
    if (useFactory != null) __obj.updateDynamic("useFactory")(useFactory)
    if (useValue != null) __obj.updateDynamic("useValue")(useValue)
    __obj.asInstanceOf[ProviderLike]
  }
}

